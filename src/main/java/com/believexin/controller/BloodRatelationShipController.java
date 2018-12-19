package com.believexin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.believexin.common.entity.vo.BloodRaletionShip;
import com.believexin.service.BloodRaletionShipServices;

@RestController
public class BloodRatelationShipController {
	
	@Autowired
	BloodRaletionShipServices service;

	@GetMapping("/api/bloodRatelationShip")
	public ResponseEntity<BloodRaletionShip> getBloodRatelateionShip(@RequestParam("schema")String schema,@RequestParam("tablename")String tablename){
		BloodRaletionShip ship = service.getChildrenNode(schema, tablename);
		return new ResponseEntity<>(ship,HttpStatus.OK);
	}
	
}
