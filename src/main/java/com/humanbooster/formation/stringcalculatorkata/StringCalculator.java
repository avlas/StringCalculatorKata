package com.humanbooster.formation.stringcalculatorkata;

public class StringCalculator {
	/**
	 * Addition of numbers
	 * 
	 * @param numbers
	 * @return the sum of numbers
	 */
	public int add (String numbers) {
		int sum = 0;

		if (!numbers.isEmpty()) {
			String[] splitedNumbers = numbers.split(",");
			for (String number : splitedNumbers) {
				sum += Integer.parseInt(number);
			}
		}

		return sum;
	}

}
