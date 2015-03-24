package org.javaSpring;

import org.springframework.beans.BeansException;

public class BeanPostProcessor implements org.springframework.beans.factory.config.BeanPostProcessor{

	public Object postProcessAfterInitialization(Object bean, String beanname) throws BeansException {

		System.out.println("in after init method name is"+beanname);
		return bean;
	}

	public Object postProcessBeforeInitialization(Object bean, String beanname) throws BeansException {

		System.out.println("in before init method name is"+beanname);
		return bean;
	}

	
}
