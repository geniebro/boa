package com.oasis.project.boa.constant;

public enum ShopCareerType implements CodeMapperType {
	Month_6("6개월미만"),
	Year_1("1년미만"),
	Year_2("2년미만"),
	Year_5("5년미만"),
	Over_5("5년이상");
	
//	@Autowired
//	private EnumMapper enumMapper;
	
	private String title;
	ShopCareerType(String title){ 
		this.title = title; 
//		enumMapper.put(title, ShopCareerType.class);
	}
	
	@Override
	public String getCode() {
		// TODO Auto-generated method stub
		return name();
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return title;
	}
	
}
