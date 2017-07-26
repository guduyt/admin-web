package com.yt.springboot.admin.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import de.codecentric.boot.admin.notify.MailNotifier;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes =AdminWebApplication.class)
public class AdminWebApplicationTests {

	@Autowired
	private JavaMailSender mailSender;

	@Autowired
	private MailNotifier mailNotifier;

	@Test
	public void contextLoads() {
	}

	@Test
	public void sendSimpleMail() throws Exception {
		mailNotifier.getTo();
		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom("yitao11@zto.cn");
		message.setTo("yitao11@zto.cn");
		message.setSubject("主题：test邮件");
		message.setText("测试邮件内容");

		mailSender.send(message);
	}


}
