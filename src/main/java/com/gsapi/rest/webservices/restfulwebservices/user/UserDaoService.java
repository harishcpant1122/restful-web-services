package com.gsapi.rest.webservices.restfulwebservices.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService
{
	private static List<User> users = new ArrayList<>();

	private static int usersCount = 2;

	static {
		users.add(new User(1, "Harish", new Date()));
		users.add(new User(2, "Pratibha", new Date()));
	}

	public List<User> findAll() {
		return users;
	}
	
	public User findOne(int id)
	{
		for(User user:users)
		{
			if(user.getId()==id)
			{
				return user;
			}
		}
		return null;
	}
	
	public User save(User user)
	{
		//System.out.println(user.getId());
		if(user.getId()==0)
		{
			user.setId(++usersCount);
			
		}
		//System.out.println(usersCount);
		users.add(user);
		return user;
	}
}

