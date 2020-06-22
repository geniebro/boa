package com.oasis.project.boa.service;

import com.oasis.project.boa.dto.UserDTO;

public interface UserService {
	// 사용자 가입
	void setUser(UserDTO user);
	
	// 사용자 프로필 조회
	UserDTO getUser(String user_id);
	
	// 모든 사용자 프로필 조회
	
}
