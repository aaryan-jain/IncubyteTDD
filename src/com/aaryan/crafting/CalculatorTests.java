package com.aaryan.crafting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTests {
	Calculator c = new Calculator();
	
	@Test
	void testThatNeedsToBePassed() {
		assertEquals(0,c.Add(""), "Test passed");
		assertEquals(5, c.Add("0,5"));
		assertEquals(5, c.Add("5,0"));
		assertEquals(13, c.Add("6,7"));
	}

}
