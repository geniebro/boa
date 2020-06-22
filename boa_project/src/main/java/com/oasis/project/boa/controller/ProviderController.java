package com.oasis.project.boa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.oasis.project.boa.dto.ProviderDTO;
import com.oasis.project.boa.service.ProviderService;

@RestController
@RequestMapping("/api/provider")
public class ProviderController {
	@Autowired
	ProviderService service;
	
	@GetMapping("/get_profile")
	public ResponseEntity getProfile(@RequestParam("id") String user_id) {
		ProviderDTO provider = service.getProvider(user_id);
//		System.out.println("userID  : " + user_id);
//		System.out.println("userName: " + provider.getName());
		return ResponseEntity.ok(provider);
	}
	
	@GetMapping("/register")
	public ResponseEntity<String> registerProvider(@RequestBody ProviderDTO provider){
		service.setProvider(provider);
		return ResponseEntity.ok("ok");
	}
//	@RequestMapping("/list")	// URL 주소
//	public String list(Model model) {
////		ProviderDTO provider = service.printProvider();
//		List<ProviderDTO> providerList = service.getProviderList();
//		
//		model.addAttribute("seq", provider.getSeq());
//		model.addAttribute("name", provider.getName());
//		
//		model.addAttribute("userId", provider.getUser_id());
//		model.addAttribute("location", provider.getLocation());
//		model.addAttribute("worker_num", provider.getWorker_num());
//		
//		System.out.println("이름 : " + provider.getName());
//		return "list";	// JSP 파일명
//	}
}
