package com.example.createRest.CreateRest;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import com.example.createRest.Entity.User;
import com.example.createRest.Repository.ProjectRepository;
@ComponentScan("com.example.createRest.Repository")
@ComponentScan("com.example.createRest.Entity")
@ComponentScan("com.example.createRest.CreateRest")
@ComponentScan("com.example.controller")
@ComponentScan("com.example.service")
@SpringBootApplication
@EnableAutoConfiguration
public class CreateRestApplication implements CommandLineRunner{

	@Autowired
	ProjectRepository projrepo;
	
	public static void main(String[] args) {
		SpringApplication.run(CreateRestApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		User u1= new User(1,"Bablu","abc");
		User u2= new User(2,"Dileep","BBC");
		User u3= new User(3,"Sai","mnc");
		User u4= new User(4,"Kumar","cbn");
		projrepo.user.addAll(Arrays.asList(u1,u2,u3,u4));
		
	}

}
