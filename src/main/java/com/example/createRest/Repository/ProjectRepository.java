package com.example.createRest.Repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.repository.query.MongoEntityInformation;
import org.springframework.data.mongodb.repository.support.SimpleMongoRepository;
import org.springframework.stereotype.Repository;

import com.example.createRest.Entity.User;


@Repository
public class ProjectRepository {



	public List <User> user = new ArrayList<User>();

	public List<User> getall() {
		// TODO Auto-generated method stub
		System.out.println(user);
		return user;
	}

	public List<User> add(User user2) {
		// TODO Auto-generated method stub
		user.add(user2);
		return user;
	}
//delete by id
	public List<User> deleteuser(int userId) {
		// TODO Auto-generated method stub
		//user.stream()
        //.filter(usr -> usr.getUserId() == userId).
       // forEach(u ->
      //  {
       //  int Uindx = user.indexOf(u);
       //  user.remove(Uindx);
       // });
		
		for (Iterator<User> iterator = user.iterator(); iterator.hasNext(); ) {
		    User value = iterator.next();
		    if (value.getUserId() == userId) {
		        iterator.remove();
		    }
		}
		return user;
	}

	public List<User> edituser(int userId, User usr) {
		// TODO Auto-generated method stub
		for (Iterator<User> iterator = user.iterator(); iterator.hasNext(); ) {
		    User value = iterator.next();
		    if (value.getUserId() == userId) {
		    	value.setUserId(userId);
		       value.setName(usr.getName());
		       value.setAddress(usr.getAddress());
		    }
		}
		return user;
	}
	
}
