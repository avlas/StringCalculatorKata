/**
 * 
 */
package com.humanbooster.formation.stringcalculatorkata;

import static org.junit.Assert.*;
import org.junit.Test;

public class StringCalculatorTest {

	@Test
	public void givenNoNumber_whenAdd_thenZero() {
		assertEquals(0, StringCalculator.add(""));
	}

	@Test
	public void givenOneNumber_whenAdd_thenOne() {
		assertEquals(1, StringCalculator.add("1"));
	}

	@Test
	public void givenTwoNumbers_whenAdd_thenThree() {
		assertEquals(3, StringCalculator.add("1,2"));
	}

	@Test
	public void givenUnknownNumbers_whenAdd_thenSum() {
		assertEquals(17, StringCalculator.add("1,2,5,9"));
	}

	@Test
	public void givenNewLinesBetweenNumbers_whenAdd_thenSum() {
		assertEquals(6, StringCalculator.add("1,2\n3"));
		assertEquals(42, StringCalculator.add("1,2,3\n25,4\n7"));
		assertEquals(8, StringCalculator.add("1,2\n5"));
	}

	@Test
	public void givenDelimiters_whenAdd_thenSum() {
		assertEquals(4, StringCalculator.add("//;\n1;3"));
		assertEquals(26, StringCalculator.add("//toto\n1toto3toto22"));
		assertEquals(11, StringCalculator.add("//	\n1	3	7"));
	}

	@Test(expected = IllegalArgumentException.class)
	public void givenNegatives_whenAdd_thenRuntimeException() {
		StringCalculator.add("1,2,-3");
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void givenDelimiterAndNegatives_whenAdd_thenRuntimeException() {
		StringCalculator.add("//toto\n1toto-3toto22");
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void givenTabDelimiterAndNegatives_whenAdd_thenRuntimeException() {
		StringCalculator.add("//	\n1	-3	-7");
	}
}
