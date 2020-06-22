package com.oasis.project.boa.constant;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EnumMapper {
	public EnumMapper() {}
	
	private Map<String, List<CodeMapperValue>> factory = new LinkedHashMap<>();
	
	public List<CodeMapperValue> get(String key){
		return factory.get(key);
	}
	public void put(String key, Class<? extends CodeMapperType> e) {
		factory.put(key, toEnumValues(e));
	}
	private List<CodeMapperValue> toEnumValues(Class<? extends CodeMapperType> e){
		return Arrays.stream(e.getEnumConstants())
				.map(CodeMapperValue::new)
				.collect(Collectors.toList());
	}
}
