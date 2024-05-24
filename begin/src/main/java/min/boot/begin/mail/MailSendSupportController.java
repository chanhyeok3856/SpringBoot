package min.boot.begin.mail;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MailSendSupportController {
private final MailSendSupportService mailSendSupportService;
public MailSendSupportController(MailSendSupportService mailSendSupportService) {
	this.mailSendSupportService = mailSendSupportService;
}
@GetMapping("/sendMailSupport")
public String send(Model model) throws Exception{
	mailSendSupportService.sendEmail();
	String receiverMail = "minhaett@naver.com";
	model.addAttribute("receiverMail", receiverMail);
	return "./mail/sendMail";
}
}
