package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class InsertRedis {
	@Autowired
	RedisTemplate<String, String> template;
	
	public void insertDB(String key, String value) {
		// insert cap key value vao redis
		template.opsForValue().set(key, value);
		// doc gia tri vua insert vao redis
		System.out.println("Gia tri da duoc insert vao redis: " + template.opsForValue().get(key));
	}
}
