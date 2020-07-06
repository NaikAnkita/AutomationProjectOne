package com.qa.test;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class DemoTest {
	
	@Test
	public void sum() {
		System.out.println("SUM");
		int a = 10;
		int b = 20;
		Assert.assertEquals(30, a+b);
		}
	
	@Test
	public void Sub() {
		System.out.println("SUB");
		int a = 30;
		int b = 20;
		Assert.assertEquals(10, a-b);
		}
	
	@Test
	public void Mul() {
		System.out.println("MUL");
		int a = 10;
		int b = 20;
		Assert.assertEquals(200, a*b);
		}
	
	@Test
	public void Div() {
		System.out.println("DIV");
		int a = 20;
		int b = 5;
		Assert.assertEquals(4, a/b);
		}
	
	
}
