package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import com.example.demo.model.UserModel;
import com.example.demo.repository.UserRepository;
import java.util.List;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/")

public class SignupController {

	public SignupController() {
		// TODO Auto-generated constructor stub
	}

		@Autowired
    UserRepository userRepository;
	
	
    @PostMapping("/signup")
    public Boolean saveUser(@Validated @RequestBody UserModel newUser) {
        List<UserModel> users = userRepository.findAll();
           for (UserModel user : users) {
            if (user.equals(newUser)) {
                System.out.println("User Already exists!");
                return false;
            }
        }
       userRepository.save(newUser);    
       return true;
    }
	
}
