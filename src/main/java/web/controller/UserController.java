package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.CurrentSecurityContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import web.dao.UserDao;
import web.model.User;
import web.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@GetMapping("")
	public String showUserInfo(@CurrentSecurityContext(expression = "authentication.principal") User principal,
							   Model model) {
		model.addAttribute("user", principal);
		return "/show";
	}
}