package com.kyj.demo.rabbit.many;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class KyjSenderTest {
	
	@Autowired
	private KyjSender kyjSender;

	@Autowired
	private KyjSender2 kyjSender2;

	@Test
	public void oneToMany() throws Exception {
		for (int i=0;i<100;i++){
			kyjSender.send(i);
		}
	}

	@Test
	public void manyToMany() throws Exception {
		for (int i=0;i<100;i++){
			kyjSender.send(i);
			kyjSender2.send(i);
		}
	}
	

}
