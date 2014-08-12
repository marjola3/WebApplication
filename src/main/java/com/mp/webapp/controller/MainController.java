package com.mp.webapp.controller;

import com.mp.webapp.entity.User;
import com.mp.webapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class MainController {

    @Autowired
    private UserRepository userRepository;

	@RequestMapping(method = RequestMethod.GET)
	public String showForm() {
        User userEntity = new User();
        userEntity.setFirstName("Ola");
        userEntity.setLastName("Kowalska");
        userEntity.setLogin("login");
        userEntity.setPassword("pass");

        User savedUser = userRepository.save(userEntity);
        System.out.println(savedUser);
        return "index";
	}
}