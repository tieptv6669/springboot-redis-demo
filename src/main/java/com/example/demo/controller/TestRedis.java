package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.InsertRedis;

@RestController
public class TestRedis {
	@Autowired
	InsertRedis insertRedis;
	
	@GetMapping(path = "/insertRedisDB")
	public String doInsertRedis() {
		String key = "name";
		String value = "Tran Viet Tiep";
		insertRedis.insertDB(key, value);
		
		return "Done";
	}
}
