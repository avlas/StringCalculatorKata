package com.humanbooster.formation.stringcalculatorkata;

import java.util.ArrayList;
import java.util.List;

public class StringCalculator {
	/**
	 * Addition of numbers
	 * 
	 * @param numbers
	 * @return the sum of numbers
	 */
	public static int add(String numbers) {
		int sum = 0;
		// return 0 if the string is empty
		if (!numbers.isEmpty()) {
			// set the default separators
			String separator = ",|\n";

			// set the custom separator if given
			if (numbers.startsWith("//")) {
				separator = separatorSelector(numbers);

				// remove the separator from the string
				numbers = numbers.substring(numbers.indexOf('\n') + 1);
			}

			// count values from the string
			sum = sum(numbers, separator);
		}
		return sum;
	}

	private static String separatorSelector(String string) {
		String[] valuesInString = string.split("//|\n");
		return valuesInString[1];
	}

	private static int sum(String numbers, String separator) {
		int sum = 0;

		// split the string with the separator
		String[] valuesInString = numbers.split(separator);

		triggerExceptionForNegatives(valuesInString);

		for (String value : valuesInString) {
			sum += Integer.valueOf(value);
		}
		return sum;
	}

	private static void triggerExceptionForNegatives(String[] valuesInString) {
		// save the negative values of the string
		List<String> negatives = new ArrayList<>();
		for (String value : valuesInString) {
			if (Integer.parseInt(value) < 0) {
				negatives.add(value);
			}
		}

		// trigger an exception if there is negatives in the string
		if (!negatives.isEmpty()) {
			throw new IllegalArgumentException("Negatives not allowed: " + negatives.toString());
		}
	}

}
