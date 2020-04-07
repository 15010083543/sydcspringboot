package com.example.fangspringboot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;

@SpringBootTest
class FangspringbootApplicationTests {
	@Autowired
	StringRedisTemplate stringRedisTemplate;
	@Test
	public void test()  {

		// 保存字符串
		stringRedisTemplate.opsForValue().set("aaa", "111");

	}
	@Test
	void contextLoads() {
		System.out.println("-------");
	}

}
