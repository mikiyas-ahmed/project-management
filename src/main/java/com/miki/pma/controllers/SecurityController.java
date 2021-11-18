package com.miki.pma.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.miki.pma.dao.AccountRepository;
import com.miki.pma.entity.UserAccount;

@Controller
public class SecurityController {

	@Autowired
	BCryptPasswordEncoder bCryptEncoder;
	@Autowired
	AccountRepository accountRepo;
	 
	
	@GetMapping("/register")
	public String registerer(Model model) {
		UserAccount useracc= new UserAccount();
		model.addAttribute("userAccount",useracc);
		return "security/register";
	}
	@PostMapping("/register/save")
	public String saveUser(Model model ,UserAccount user) {
		user.setPassword(bCryptEncoder.encode(user.getPassword()));
		accountRepo.save(user);
		return "redirect:/";
	}
	
}
