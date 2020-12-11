package com.example.fangspringboot;

/*import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;

import java.util.Set;*/

import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FangspringbootApplicationTests {

	/*@Autowired
	StringRedisTemplate stringRedisTemplate;

	@Test
	public void test()  {
		// 排行榜
		//stringRedisTemplate.opsForZSet().add("topkey", "liu", 8);
		// 增加分数
		*//*stringRedisTemplate.opsForZSet().incrementScore("topkey", "liu", 1);
		System.out.println(stringRedisTemplate.opsForZSet().score("topkey", "liu"));
		stringRedisTemplate.opsForZSet().add("topkey", "li", 10);
		stringRedisTemplate.opsForZSet().add("topkey", "li2", 11);
		// 获取由高到低的分数集合
		Set<String> set = stringRedisTemplate.opsForZSet().reverseRangeByScore("topkey", 1, 15);
		set.stream().forEach(x -> System.out.println(x));*//*

		stringRedisTemplate.opsForValue().set("key","value");
		stringRedisTemplate.opsForValue().append("key", "a");
	}

	@Test
	void contextLoads() {
		System.out.println("-------");
	}
*/
}
