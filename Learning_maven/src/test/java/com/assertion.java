package com;

import static org.junit.Assert.*;

import org.junit.Test;

public class assertion {
	
	@Test
	public void test()
	{
		//int a = 20;
		//int b = 10;
		//assertEquals(b, a);
		//assertNotEquals(a, b);
		//assertTrue(a>b);
		//assertFalse(a<b);
		//assertNull(a);
		//assertNotNull(a);
		
		
		Integer i = new Integer(10);
		Integer j = new Integer(10);
		
		//assertEquals(i, j);
		//assertSame(i, j);
		
		
		int a[] = {10,20,30,40,50,70};
		int b[] = {10,20,30,40,50,80};
		
		//assertArrayEquals(a, b);
		assertNotEquals(a, b);
	}
	
	

}
