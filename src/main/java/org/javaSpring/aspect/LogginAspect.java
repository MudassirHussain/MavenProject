package org.javaSpring.aspect;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;


@Aspect
public class LogginAspect {

	@Before("allcirclemethods()") 
	public void LoggingAdvice(JoinPoint joinPoint){
		
	}//if getters is called joinPoint will have the information if setters is called the jointPoint will have the information
	
	@AfterReturning(pointcut="args(name)",returning="retunString")
	public void stringArgumentMethods(String name,String retString){
		System.out.println("A method that takes string argument is called . the values is "+name +"the output values is "+retString);
	}
	
	@AfterThrowing("args(name)")
	public void ExceptionAdvice(String name){
		System.out.println("A exception has been thrown");
	}
	
	
	@Pointcut("execution(public * get*())")
	public void allGetters(){}
		
	@Pointcut("within(org.AOP.model.Circle)")
	public void allcirclemethods(){}

	
	
}
  





