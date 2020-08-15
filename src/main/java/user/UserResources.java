package user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserResources {
	
	//@Autowired
	//private UserDaoService service;
	
	//Get all users
//	@GetMapping("/users")
//	public List<User> retrieveAllUsers()
//	{
//		return service.findAll();
//	}
	
	@GetMapping("/users")
	public String retrieveAllUsers()
	{
		return "all users";
	}

}
