/**
 * 
 */
package com.humanbooster.formation.stringcalculatorkata;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StringCalculatorTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {

	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void givenEmptyString_whenAdd_thenZero() {
		StringCalculator calculator = new StringCalculator();
		assertEquals(0, calculator.add(""));
	}
}
