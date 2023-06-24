package com.cg.jtest;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTestTest {
    
	@Test
	public void testAdd() {
		Calculator c=new Calculator();
		int result=c.add(7, 8);
		assertEquals(15,result);
		//fail("Not yet implemented");
	}
	public void testSub() {
		Calculator c=new Calculator();
		int result=c.sub(5,1);
		assertEquals(4,result);
	}
	
}
