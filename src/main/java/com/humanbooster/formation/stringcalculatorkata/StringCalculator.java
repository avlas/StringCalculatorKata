package com.humanbooster.formation.stringcalculatorkata;

import java.util.ArrayList;
import java.util.List;

public class StringCalculator {
	
	/**
	 * Addition of numbers
	 * 
	 * @param input
	 * @return the sum of numbers, else 0 if empty input
	 */
	public static int add(String input) {
		int sum = 0;

		if (!input.isEmpty()) {
			// Default delimiters : , or \n
			String separator = ",|\n";		
			
			if (input.startsWith("//")) {
				separator = getCustomSeparator(input);

				// remove the separator from the string
				input = input.substring(input.indexOf('\n') + 1);
			}
			sum = sum(input, separator);
		}
		return sum;
	}

	/**
	 * Retrieve the custom separator
	 * 
	 * @param string
	 * @return
	 */
	private static String getCustomSeparator(String string) {
		String[] valuesInString = string.split("//|\n");
		return valuesInString[1];
	}

	/**
	 * Count values of the string
	 * 
	 * @param valuesInString
	 */
	private static int sum(String input, String separator) {
		int sum = 0;
		int maxLimit = 1000;
		
		String[] onlyValues = input.split(separator);

		triggerExceptionIfNegatives(onlyValues);

		for (String valueStr : onlyValues) {
			int value = Integer.parseInt(valueStr);
			if (value < maxLimit) {
				sum += Integer.valueOf(value);
			}			
		}
		return sum;
	}

	/**
	 * Trigger an exception if there are negatives in the string
	 * 
	 * @param onlyValues
	 */
	private static void triggerExceptionIfNegatives(String[] onlyValues) {
		List<String> negatives = new ArrayList<>();
		for (String value : onlyValues) {			
			if ( Integer.parseInt(value) < 0) {
				negatives.add(value);
			} 
		}

		if (!negatives.isEmpty()) {
			throw new IllegalArgumentException("Negatives not allowed: " + negatives.toString());
		}
	}

}
