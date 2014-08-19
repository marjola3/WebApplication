package com.mp.webapp.controller;

import com.mp.webapp.entity.UserEntity;
import com.mp.webapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class UsersController {

    @Autowired
    private UserRepository userRepository;

	@RequestMapping(method = RequestMethod.GET)
	public String showForm(ModelMap modelMap) {
        modelMap.addAttribute("user", new UserEntity());
        return "users";
	}

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String addUser() {
        return "users";
    }
}