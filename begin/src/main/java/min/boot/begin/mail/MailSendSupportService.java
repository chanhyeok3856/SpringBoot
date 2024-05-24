package min.boot.begin.mail;

import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import jakarta.mail.internet.MimeMessage;

@Component
public class MailSendSupportService {
	private final JavaMailSender javaMailSender;
	public MailSendSupportService(JavaMailSender javaMailSender) {
		this.javaMailSender = javaMailSender;
	}
public void sendEmail() throws Exception{
	String subject = "테스트 메일";
	String content = "메일 테스트 내용입니다.";
	String senderMail = "songminhaett@naver.com";
	String receiverMail = "minhaett@naver.com";
	MimeMessage mimeMessage = javaMailSender.createMimeMessage();
	MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, true, "UTF-8");
	mimeMessageHelper.setFrom(senderMail);
	mimeMessageHelper.setTo(receiverMail);
	mimeMessageHelper.setSubject(subject);
	mimeMessageHelper.setText(content, true);
	javaMailSender.send(mimeMessage);
}
}
