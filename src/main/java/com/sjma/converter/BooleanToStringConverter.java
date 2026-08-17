package com.sjma.converter;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter
public class BooleanToStringConverter implements AttributeConverter<Boolean, String>{

	@Override
	public String convertToDatabaseColumn(Boolean attribute) {
		if (attribute ==  null) {
			return null;
		}
		return attribute ? "TRUE" : "FALSE";
	}

	@Override
	public Boolean convertToEntityAttribute(String dbData) {
		
		if (dbData == null) {
			return null;
		}
		return  "TRUE".equalsIgnoreCase(dbData);
	}




}
