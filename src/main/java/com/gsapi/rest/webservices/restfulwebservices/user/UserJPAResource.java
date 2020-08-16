package com.gsapi.rest.webservices.restfulwebservices.user;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class UserJPAResource
{
	//@Autowired
	//private UserDaoService service;
	
	@Autowired
	private UserRepository userRepository;
	
	
	@GetMapping(path="/jpa/users")
	public List<User> retriveAllUsers() {
		return userRepository.findAll();
	}
	
	@GetMapping(path="/jpa/users/{id}")
	public Optional<User> retriveUser(@PathVariable int id) {
		Optional<User> user=userRepository.findById(id);
		
		if(!user.isPresent())
		{
			throw new UserNotFoundException("id - "+id);
		}
		return user;
	}
//	
//	@PostMapping(path="/jpa/users")
//	public ResponseEntity<Object> createUser(@RequestBody User user) {
//		User savedUser=service.save(user);
//		URI location=ServletUriComponentsBuilder
//				.fromCurrentRequest()
//				.path("/{id}")
//				.buildAndExpand(savedUser.getId()).toUri();
//		return ResponseEntity.created(location).build();
//	}
}
