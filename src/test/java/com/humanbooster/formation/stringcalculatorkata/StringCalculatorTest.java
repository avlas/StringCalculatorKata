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
	public void givenNoNumber_whenAdd_thenZero() {
		StringCalculator calculator = new StringCalculator();
		assertEquals(0, calculator.add(""));
	}
	
	@Test
	public void givenOneNumber_whenAdd_thenOne() {
		StringCalculator calculator = new StringCalculator();
		assertEquals(1, calculator.add("1"));
	}
	
	@Test
	public void givenTwoNumbers_whenAdd_thenThree() {
		StringCalculator calculator = new StringCalculator();
		assertEquals(3, calculator.add("1,2"));
	}
	
	@Test
	public void givenUnknownNumbers_whenAdd_thenSum() {
		StringCalculator calculator = new StringCalculator();
		assertEquals(17, calculator.add("1,2,5,9"));
	}
}
