package com.believexin.common.entity.vo;

import java.util.List;

public class BloodRaletionShip {

	private String tablename;
	
	private String viewname;
	
	private String shcemaname;
	
	private String title;
	
	private List<BloodRaletionShip> children;

	public String getTablename() {
		return tablename;
	}

	public void setTablename(String tablename) {
		this.tablename = tablename;
	}

	public String getViewname() {
		return viewname;
	}

	public void setViewname(String viewname) {
		this.viewname = viewname;
	}

	public String getShcemaname() {
		return shcemaname;
	}

	public void setShcemaname(String shcemaname) {
		this.shcemaname = shcemaname;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<BloodRaletionShip> getChildren() {
		return children;
	}

	public void setChildren(List<BloodRaletionShip> children) {
		this.children = children;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BloodRaletionShip [tablename=");
		builder.append(tablename);
		builder.append(", viewname=");
		builder.append(viewname);
		builder.append(", shcemaname=");
		builder.append(shcemaname);
		builder.append(", title=");
		builder.append(title);
		builder.append(", children=");
		builder.append(children);
		builder.append("]");
		return builder.toString();
	}
	
}
