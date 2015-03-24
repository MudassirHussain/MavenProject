package org.AOP;

import org.AOP.ShapeService.ShapeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AspMain {

	public static void main(String[] args) {

		ApplicationContext Context=new ClassPathXmlApplicationContext("SpringAOP.xml");
		//ShapeService shapeService=(ShapeService)Context.getBean("shapeService");
		ShapeService shapeService=Context.getBean("shapeService",ShapeService.class);
		shapeService.getCircle().setName("dummy name");
		System.out.println(shapeService.getCircle().getName());
	}

}
