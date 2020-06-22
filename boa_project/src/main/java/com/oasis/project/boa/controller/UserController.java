package com.oasis.project.boa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.oasis.project.boa.constant.CodeMapperValue;
import com.oasis.project.boa.constant.EnumMapper;
import com.oasis.project.boa.constant.ShopCareerType;
import com.oasis.project.boa.dto.UserDTO;
import com.oasis.project.boa.service.UserService;

@Controller
public class UserController {
	@Autowired
	UserService service;
	
	@Autowired
	EnumMapper enumMapper;
	
	@Bean
	public EnumMapper enumMapper() {
		EnumMapper enumMapper = new EnumMapper();
		enumMapper.put( "ShopCareerType", ShopCareerType.class);
		return enumMapper;
	}
	
	@GetMapping("/shopcareer-type")
	public List<CodeMapperValue> getShopCareerList(){
		return enumMapper.get("ShopCareerType");
	}
	
	@RequestMapping("/register")
	public ResponseEntity<String> registerUser(@RequestBody UserDTO user) {
		service.setUser(user);
		return ResponseEntity.ok("ok");
	}
	@RequestMapping("/getUser")
	public ResponseEntity<UserDTO> getUser(@RequestParam("id") String user_id){
		UserDTO userDto = service.getUser(user_id);
		return ResponseEntity.ok(userDto);
	}
	
	@RequestMapping("/getUserList")	// URL 주소
	public String list(Model model) {
//		UserDTO user = service.printUser();
//		
//		model.addAttribute("seq", provider.getSeq());
//		model.addAttribute("name", provider.getName());
//		model.addAttribute("userId", provider.getUser_id());
//		model.addAttribute("location", provider.getLocation());
//		model.addAttribute("worker_num", provider.getWorker_num());
//		
//		System.out.println("이름 : " + provider.getName());
		return "list";	// JSP 파일명
	}
}
