package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.createRest.Entity.User;
import com.example.createRest.Repository.ProjectRepository;

@Service
public class UserService {

	@Autowired 
	ProjectRepository Projrep;
	public List<User> getall() {
		// TODO Auto-generated method stub
		
		return Projrep.getall();
	}
	public List<User> add(User us) {
		// TODO Auto-generated method stub
		return Projrep.add(us);
	}
	public List<User> deleteuser(int userId) {
		// TODO Auto-generated method stub
		return Projrep.deleteuser(userId);
	}
	public List<User> edituser(int userId, User user) {
		// TODO Auto-generated method stub
		return Projrep.edituser(userId, user);
	}

}
