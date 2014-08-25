package com.mp.webapp.controller;

import com.mp.webapp.entity.UserEntity;
import com.mp.webapp.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class UsersController {

    @Autowired
    private IUserService userService;

	@RequestMapping(method = RequestMethod.GET)
	public String showForm(Model model) {
        model.addAttribute("user", new UserEntity());
        model.addAttribute("usersList", userService.findAll());
        return "users";
	}

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String addUser(@ModelAttribute("user") UserEntity user) {
        userService.save(user);
        return "redirect:/";
    }

    @RequestMapping(value = "delete/{userId}", method = RequestMethod.GET)
    public String deleteUser(@PathVariable("userId") Long id) {
        userService.delete(id);
        return "redirect:/";
    }
}