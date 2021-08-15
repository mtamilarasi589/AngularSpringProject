package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.UserModel;
import com.example.demo.model.LoginModel;
import com.example.demo.repository.UserRepository;

import java.util.List;
import com.example.demo.repository.LoginRepository;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/")
public class LoginController {

	public LoginController() {
		// TODO Auto-generated constructor stub
	}
	@Autowired
    UserRepository userRepository;
	LoginRepository loginRepository;
	
	@PostMapping("/login")
    public Boolean checkUser(@RequestBody LoginModel user) {
        List<UserModel> users = userRepository.findAll();
        for (UserModel other : users) {
            if (other.equals(user)) {
                 loginRepository.save(user);
                return true;
            }
        }
        return false;
    }
	
	
	

}
