package demo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import  demo.dao.UserDao;
import  demo.entity.User;

@Service
public class UserService {
	
	@Autowired
	private UserDao userDao;
	
	public User getAllUser(){
		Long userId = new Long(2);
		return userDao.selectByPrimaryKey(userId);
	}

}
