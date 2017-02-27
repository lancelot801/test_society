package cn.joongky.society.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/admin")
@Controller
public class AdminLoginController {
	@RequestMapping(value = "/login",method=RequestMethod.GET)
	public String login() {
		return "admin/login";
	}
}
