package com.oasis.project.boa.constant;

public class CodeMapperValue {
	private String code;
	private String title;
	
	public CodeMapperValue(CodeMapperType type) {
		code = type.getCode();
		title = type.getTitle();
	}
	
	public String getCode() { return code; }
	public String getTitle() { return title; }
}
