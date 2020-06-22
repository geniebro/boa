package com.oasis.project.boa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oasis.project.boa.dao.ProviderDAO;
import com.oasis.project.boa.dto.ProviderDTO;
import com.oasis.project.boa.service.ProviderService;

@Service
public class ProviderServiceImpl implements ProviderService {

	@Autowired
	private ProviderDAO dao;
	
	@Override
	public ProviderDTO printProvider() {
//		ProviderDTO provider = dao.getProvider();
//		return provider;
		return null;
	}
	
	@Override
	public void setProvider(ProviderDTO provider) {
		dao.insertProvider(provider);
	}

	@Override
	public ProviderDTO getProvider(String user_id) {
		ProviderDTO provider = dao.selectProvider(user_id);
		return provider;
	}

	@Override
	public List<ProviderDTO> getProviderList() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
