package com.kyj.demo.rabbit.topic;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TopicSenderTest {
	
	@Autowired
	private TopicSender sender;

	@Test
	public void testSend() {
		sender.send();
	}

	@Test
	public void testSend1() {
		sender.send1();
	}

	@Test
	public void testSend2() {
		sender.send2();
	}
	

}
