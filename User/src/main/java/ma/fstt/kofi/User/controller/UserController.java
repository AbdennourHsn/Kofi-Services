package ma.fstt.kofi.User.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.fstt.kofi.User.entity.User;
import ma.fstt.kofi.User.service.UserServiceImpl;
import models.RequestModel;
import utils.JwtToken;



@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired UserServiceImpl userServiceImpl;
	@Autowired
	JwtToken jwtToken;
	
//	public UserController () {
//		jwtToken=new JwtToken();
//	}
	

	
	@GetMapping(value="/getAll")
	public List<User> getAllUsers(){
		return userServiceImpl.getAll();
	}
	
	@PostMapping(value="/register")
	public User register(@RequestBody User user) {
		return userServiceImpl.save(user);
	}
	
	@GetMapping(value="/{id}")
	public User getUser(@PathVariable("id") Long id) {
		return userServiceImpl.findById(id);
	}
	
	@GetMapping(value="/search/{username}")
	public List<User> searchUserByUsername(@PathVariable("username") String username){
		List<User> users=userServiceImpl.searchByUsername(username);
		System.out.println("===================");
		System.out.println(users);
		return users;
	}
	
	@GetMapping(value="/username/{username}")
	public User getUserByUsername(@PathVariable("username") String username){
		return userServiceImpl.findByUsername(username);

	}
	
	@PostMapping(value="/validate/token")
	public boolean validateToken(@RequestBody User user) {
		System.out.println(user.getToken());
		return  jwtToken.validateToken(user.getToken());
	}
	
	@PostMapping(value="/login")
	public String  login(@RequestBody User user) {
	
		return jwtToken.generateToken(user);
	}
	
	
	
	
}
