package com.kyj.demo.rabbit.object;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.kyj.demo.entity.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ObjectSenderTest {

	@Autowired
	private ObjectSender sender;

	@Test
	public void sendOject() throws Exception {
		User user=new User();
		user.setUserName("neo");
		user.setPassWord("123456");
		sender.send(user);
	}

}
