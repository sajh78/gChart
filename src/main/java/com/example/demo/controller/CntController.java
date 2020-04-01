package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.db.DBManager;
import com.example.demo.vo.CntVo;
import com.google.gson.Gson;

@RestController
public class CntController {

	
	@RequestMapping(value ="/cntList",produces = "application/json;charset=UTF-8")
	public String cntList() {
		String str ="";
		List<CntVo> list = DBManager.cntList();
		Gson gson = new Gson();
		str = gson.toJson(list);
		return str;
	}
}
