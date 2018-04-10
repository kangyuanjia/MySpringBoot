package com.kyj.demo.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;


@RunWith(SpringRunner.class)
@SpringBootTest
public class MailServiceTest {

	@Autowired
    private MailService mailService;

    @Autowired
    private TemplateEngine templateEngine;
	
	@Test
	public void testSendSimpleMail() {
		mailService.sendSimpleMail("kangyuanjia@aliyun.com","test simple mail"," hello this is simple mail");
	}

	@Test
	public void testSendHtmlMail() {
		String content="<html>\n" +
                "<body>\n" +
                "    <h3>hello world ! 这是一封html邮件!</h3>\n" +
                "</body>\n" +
                "</html>";
        mailService.sendHtmlMail("kangyuanjia@aliyun.com","test simple mail",content);
	}

	@Test
	public void testSendAttachmentsMail() {
		 String filePath="D:\\work\\PARTITION.xlsx";
	        mailService.sendAttachmentsMail("kangyuanjia@aliyun.com", "主题：带附件的邮件", "有附件，请查收！", filePath);
	}

	@Test
	public void testSendInlineResourceMail() {
		String rscId = "neo006";
        String content="<html><body>这是有图片的邮件：<img src=\'cid:" + rscId + "\' ></body></html>";
        String imgPath = "D:\\work\\TEMPLATE_CUBE\\src\\main\\webapp\\resource\\ui\\images\\build.png";

        mailService.sendInlineResourceMail("kangyuanjia@aliyun.com", "主题：这是有图片的邮件", content, imgPath, rscId);
	}

	@Test
    public void sendTemplateMail() {
        //创建邮件正文
        Context context = new Context();
        context.setVariable("id", "20171219");
        String emailContent = templateEngine.process("emailTemplate", context);

        mailService.sendHtmlMail("kangyuanjia@aliyun.com","主题：这是模板邮件",emailContent);
    }
}
