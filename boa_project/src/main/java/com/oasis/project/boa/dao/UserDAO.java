package com.oasis.project.boa.dao;

import com.oasis.project.boa.dto.UserDTO;

public interface UserDAO {
	// 일반사용자 프로필 요청
	UserDTO selectUser(String user_id);
	
	// 일반사용자 회원등록
	void insertUser(UserDTO user);
}
