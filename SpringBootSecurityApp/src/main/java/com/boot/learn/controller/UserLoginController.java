/**
 * 
 */
package com.boot.learn.controller;

import java.security.Principal;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Sanjeev
 *
 */
@Controller
public class UserLoginController {

	@GetMapping(value = { "/", "/home" })
	public String welcomePage() {
		return "welcome";
	}

	@GetMapping("loginpage")
	public String showLoginAuthenticationPage() {
		return "loginPage";
	}

	@PostMapping("loginpage")
	public String showLoginPage() {
		return "redirect:home";
	}

	@GetMapping("logoutpage")
	public String showLogoutPage(HttpSession session) {
		session.invalidate();
		return "logoutPage";
	}

	@GetMapping("admin")
	public String showAdminPage() {
		return "adminPage";
	}

	@GetMapping("/error")
	public String showErrorPage() {
		return "errorPage";
	}

	@GetMapping(value = "/403")
	public ModelAndView accesssDenied(Principal user) {
		ModelAndView model = new ModelAndView();
		if (user != null) {
			model.addObject("msg", "Hi " + user.getName() + ", you do not have permission to access this page!");
		} else {
			model.addObject("msg", "You do not have permission to access this page!");
		}
		model.setViewName("403");
		return model;
	}

}
