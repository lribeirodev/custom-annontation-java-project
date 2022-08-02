package com.ribeiro.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.ribeiro.constants.ModeUtils;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)

public @interface StringUtils {
	ModeUtils mode() default ModeUtils.NONE;
	ModeUtils reverse() default ModeUtils.NONE;
}
