package com.oasis.project.boa.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oasis.project.boa.dao.UserDAO;
import com.oasis.project.boa.dto.UserDTO;
import com.oasis.project.boa.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO dao;
	
	@Override
	public UserDTO getUser(String user_id) {
		UserDTO user = dao.selectUser(user_id);
		return user;
	}

	@Override
	public void setUser(UserDTO user) {
		dao.insertUser(user);
	}

}
