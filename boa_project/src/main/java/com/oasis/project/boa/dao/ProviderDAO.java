package com.oasis.project.boa.dao;

import com.oasis.project.boa.dto.ProviderDTO;

public interface ProviderDAO {
	ProviderDTO selectProvider(String user_id);
	void insertProvider(ProviderDTO provider);
}
