package com.aop.api.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 *
 * @author Md. Aslam Hossain
 * @Date Jun 1, 2022
 *
 */
@Aspect
@Component
public class EmployeeServiceAspect {
	@Before(value = "execution(* getEmployees()) && target(com.aop.api.serviceImpl.EmployeeServiceImpl))")
	public void beforeAdvice() {
		System.out.println("Before method:");
	}

	@After(value = "execution(* getEmployees()) && target(com.aop.api.serviceImpl.EmployeeServiceImpl))")
	public void afterAdvice() {
		System.out.println("After method:");
	}

	@AfterReturning(value = "execution(* getEmployees()) && target(com.aop.api.serviceImpl.EmployeeServiceImpl))")
	public void AfterReturningAdvice() {
		System.out.println("AfterReturningAdvice method:");
	}

	@AfterThrowing(value = "execution(* getEmployees()) && target(com.aop.api.serviceImpl.EmployeeServiceImpl))")
	public void AfterThrowingAdvice() {
		System.out.println("AfterThrowingAdvice method:");
	}

//	@Around(value = "execution(* getEmployees()) && target(com.aop.api.serviceImpl.EmployeeServiceImpl))")
//	public void AroundAdvice() {
//		System.out.println("AroundAdvice method:");
//	}

}
