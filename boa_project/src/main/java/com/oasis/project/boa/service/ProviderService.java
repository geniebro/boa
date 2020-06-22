package com.oasis.project.boa.service;

import java.util.List;

import com.oasis.project.boa.dto.ProviderDTO;

public interface ProviderService {
	// 사업자가입
	void setProvider(ProviderDTO provider);
	
	// 사업자 프로필조회
	ProviderDTO getProvider(String user_id);
	
	// 등록 사업자리스트 조회
	List<ProviderDTO> getProviderList();
	
	// 테스트
	ProviderDTO printProvider();
	
}
