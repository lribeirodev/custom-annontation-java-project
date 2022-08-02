package com.ribeiro.handler;

import java.lang.reflect.Field;

import com.ribeiro.annotation.StringUtils;
import com.ribeiro.constants.ModeUtils;
import static com.ribeiro.constants.ModeUtils.REVERSE;

public class HandlerStringUtils {
	
	public void proccess(Object obj) {
		Field[] fields = obj.getClass().getDeclaredFields();
		for(Field field: fields) {
			if(field.isAnnotationPresent(StringUtils.class)) {
				ModeUtils value = field.getAnnotation(StringUtils.class).mode();
				Boolean reverse = field.getAnnotation(StringUtils.class).reverse().equals(REVERSE);
				modify(obj,field,value,reverse);
			}
		}
	}
	
	private void modify(Object obj,Field field, ModeUtils mode, Boolean reverse) {
		try {
			field.setAccessible(true);
			switch(mode) {
				case NAME:
					String v = (String) field.get(obj);
					field.set(obj, Boolean.TRUE.equals(reverse) ? reverseText(v) : v.toUpperCase());
					break;
				case AGE:
					Integer i = (Integer) field.get(obj);
					field.set(obj, i+1);
					break;
			default:
				break;
			}
		} catch (IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}
	}
	
	private String reverseText(String text) {
		return new StringBuilder(text)
				.reverse()
				.toString()
				.toUpperCase();
	}
	
}
