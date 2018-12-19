package com.believexin.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.believexin.common.entity.po.TViewsUsedTables;
import com.believexin.common.entity.po.TViewsUsedTablesExample;
import com.believexin.common.entity.vo.BloodRaletionShip;
import com.believexin.repository.TViewsUsedTablesMapper;
@Service
public class BloodRaletionShipServices {
	
	@Autowired
	private TViewsUsedTablesMapper mapper;
	
	@Value("${blood.specialTables}")
	private String specialTables;
	
	public BloodRaletionShip getChildrenNode(String tableschema,String tablename) {
		String viewname =  getViewName(tablename);
		BloodRaletionShip ship = new BloodRaletionShip();
		ship.setShcemaname(tableschema);
		ship.setTablename(tablename);
		ship.setViewname(viewname);
		ship.setTitle(tableschema + "." + viewname);
		List<BloodRaletionShip> childrenList = new ArrayList<>();
		ship.setChildren(childrenList);
		if(isExistOid(tableschema,tablename)) {
			TViewsUsedTablesExample example = new TViewsUsedTablesExample();
			example.createCriteria().andCViewnameEqualTo(viewname).andCViewschemaEqualTo(tableschema);
			List<TViewsUsedTables> list = mapper.selectByExample(example);
			if(list == null || list.isEmpty()) {
				return ship;
			}
			list.forEach(item ->{
				BloodRaletionShip tempShip = exchangeTViewsUsedTablesToBloodRaletionShip(item);
				childrenList.add(tempShip);
				getChildrenNodeRecursion(tempShip);
			});
		}
		return ship;
	}
	private BloodRaletionShip getChildrenNodeRecursion(BloodRaletionShip ship) {
		String viewname =  getViewName(ship.getViewname());
		List<BloodRaletionShip> childrenList = new ArrayList<>();
		ship.setChildren(childrenList);
		if(isExistOid(ship.getShcemaname(),ship.getTablename())) {
			TViewsUsedTablesExample example = new TViewsUsedTablesExample();
			example.createCriteria().andCViewnameEqualTo(viewname).andCViewschemaEqualTo(ship.getShcemaname());
			List<TViewsUsedTables> list = mapper.selectByExample(example);
			if(list == null || list.isEmpty()) {
				return ship;
			}
			list.forEach(item ->{
				BloodRaletionShip tempShip = exchangeTViewsUsedTablesToBloodRaletionShip(item);
				childrenList.add(tempShip);
				getChildrenNodeRecursion(tempShip);
			});
		}
		return ship;
	}
	
	public String getViewName(String tablename) {
		if(tablename == null) {
			return tablename;
		}
		String viewname = tablename.toLowerCase();
		if(tablename.startsWith("bb_")) {
			viewname = "v_" + viewname;
		}
		if(tablename != null && tablename.startsWith("t_v_")) {
			viewname = viewname.replace("t_", "");
		}
		if(tablename.startsWith("t_")) {
			viewname = viewname.replace("t_", "v_");
		}
		return viewname;
	}
	private boolean isExistOid(String scheam,String name) {
		//TODO 判断在数据库是否存在视图或表
		return true;
	}
	private BloodRaletionShip exchangeTViewsUsedTablesToBloodRaletionShip(TViewsUsedTables po) {
		BloodRaletionShip ship = new BloodRaletionShip();
		String view = getViewName(po.getcTablename());
		if(isExistOid(po.getcTableschema(), view)) {
			ship.setViewname(view);
			ship.setTitle(po.getcTableschema() + "." + view);
		} 
		if(isSpecialTable(po.getcTablename())) {
			ship.setTablename(po.getcTablename());
			ship.setTitle(po.getcTableschema() + "." + po.getcTablename());
		} else if(!po.getcTablename().startsWith("v_") && !po.getcTablename().startsWith("tmp_")) {
			ship.setTablename(po.getcTablename());
			ship.setTitle(po.getcTableschema() + "." + po.getcTablename());
		}
		ship.setShcemaname(po.getcTableschema());
		return ship;
	}
	private boolean isSpecialTable(String tablename){
		String[] specialTable = this.specialTables.split(",");
		List<Object> specialTableList = new ArrayList<>(Arrays.asList(specialTable));
		if(specialTableList.contains(tablename)) {
			return true;
		}
		return false;
	}
}
