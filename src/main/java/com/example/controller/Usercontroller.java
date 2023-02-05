package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.createRest.Entity.User;
import com.example.service.UserService;

@RestController
@RequestMapping("/user")
public class Usercontroller {

	@Autowired
	UserService userserv;
	@GetMapping("/get/all")
	public List<User> getAll(){
		
		return userserv.getall();
		
	}
	@PostMapping("/add")
	public List<User> adduser(@RequestBody User user )
	{
		return userserv.add(user);
	}
	@PutMapping("/edit")
	public List<User> edituser(@RequestParam int userId,
			@RequestBody User user)
	{
		
		return userserv.edituser(userId, user);
		
	}
	@DeleteMapping("/delete")
	public List<User> deleteUser(@RequestParam int userId)
	{
		return userserv.deleteuser(userId);
		
	}
	
	
}
