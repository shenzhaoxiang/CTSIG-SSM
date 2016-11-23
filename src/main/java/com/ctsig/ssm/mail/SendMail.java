//package com.ctsig.ssm.mail;
//
//import org.springframework.beans.factory.annotation.Autowired;
//
//import java.util.Map;
//
///**
// * @version： V1.0.0
// * @des：
// * @author: Shen
// * @email: shenzhaoxiang@gmail.com
// * @date: 2016/11/19
// */
//public class SendMail {
//    @Autowired
//    private JavaMailSender mailSender;
//
//    public void sendTemplateMail() throws Exception {
//        MimeMessage mimeMessage = mailSender.createMimeMessage();
//        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
//        helper.setFrom("dyc87112@qq.com");
//        helper.setTo("dyc87112@qq.com");
//        helper.setSubject("主题：模板邮件");
//        Map<String, Object> model = new HashedMap();
//        model.put("username", "didi");
//        String text = VelocityEngineUtils.mergeTemplateIntoString(
//                velocityEngine, "template.vm", "UTF-8", model);
//        helper.setText(text, true);
//        mailSender.send(mimeMessage);
//    }
//}
