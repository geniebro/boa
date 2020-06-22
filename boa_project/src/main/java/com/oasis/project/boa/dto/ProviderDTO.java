package com.oasis.project.boa.dto;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProviderDTO {
	private int seq          ;
	private String name         ;
	private String user_id      ;
	private String location     ;
	private String license_num  ;
	private String shop_duration;
	private int worker_num   ;
	private String contact_num  ;
	private String service_list ;
	private Date join_date    ;
	private Date update_date  ;
	
}
