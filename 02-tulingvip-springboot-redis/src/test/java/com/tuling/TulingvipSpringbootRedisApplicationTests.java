package com.tuling;

import com.tuling.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TulingvipSpringbootRedisApplicationTests {

	@Autowired
	private RedisTemplate redisTemplate;

	@Test
	public void contextLoads() {
	}

	@Test
	public void testSaveObj() {
		User user =new User(1,"zhangsan","123345","aa@qq.com","199107");
		redisTemplate.opsForValue().set("zhangsan",user);
	}

	@Test
	public void testSaveString() {
		redisTemplate.opsForValue().set("smls","回首掏11111");
	}

}
