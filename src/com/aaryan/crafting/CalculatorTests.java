package com.aaryan.crafting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTests {
	Calculator c = new Calculator();

	@Test
	void testThatNeedsToBePassed() {
		try {
			assertEquals(0, c.Add(""), "Test passed");
			assertEquals(5, c.Add("0,5"));
			assertEquals(7, c.Add("7,0"));
			assertEquals(13, c.Add("6,7"));
			assertEquals(10, c.Add("1\n2,3,4"));
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	@Test
	void testThatNeedsToBePassed2() {
		try {
			assertEquals(4, c.Add("4"));
			assertEquals("negatives not allowed -1", c.Add("-1"));
			// assertEquals(0, c.Add("5,4,-9"));

		} catch (Exception e) {
			System.out.println(e);
		}

	}

	@Test
	void testThatNeedsToBePassed3() {
		try {

			// assertEquals("negatives not allowed -1", c.Add("-1"));
			assertEquals(0, c.Add("5,4,-9"));

		} catch (Exception e) {
			System.out.println(e);
		}

	}

	@Test
	void testThatNeedsToBePassed4() {
		try {

			assertEquals(3, c.Add("//;\n1;2"));

		} catch (Exception e) {
			System.out.println(e);
		}

	}
	
	@Test
	void testThatNeedsToBePassed5() {
		try {

			assertEquals("negatives not allowed ", c.Add("//-\n1--2"));

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
