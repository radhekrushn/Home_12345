package com;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

public class first {
	
	@Test
	public void test1()
	{
		System.out.println("Running first test");
	}
	
	@Test
	public void test2()
	{
		System.out.println("running test2");
	}
	
	@Test
	public void test3()
	{
		System.out.println("runnint test3");
	}
	
	@Before
	public void beforeTest()
	{
		System.out.println("Runing before every test");
	}
	
	@AfterClass
	public static void afterTest()
	{
		System.out.println("runing after every test");
	}
	
	@Before
	public void beforelass()
	{
		System.out.println("Runing before class");
	}
	
	@AfterClass
	public static void afterClass()
	{
		System.out.println("runing after class");
	}

}
	
	
	
	
