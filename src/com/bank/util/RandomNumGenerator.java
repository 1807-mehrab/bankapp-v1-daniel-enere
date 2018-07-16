package com.bank.util;

public class RandomNumGenerator {
	
	public RandomNumGenerator() {
		
	}
	
	public static int generateSixDigitNum() {
		int sixDigitNum = 0;
		
		for (int j = 0; j < 100; j++) {
			sixDigitNum = (int)(Math.random()*10000000);
			if (sixDigitNum > 99999 && sixDigitNum < 1000000) {
				return sixDigitNum;
			}
		}
		
		return sixDigitNum;
	}
	
	public static long generateNineDigitNum() {
		long sixDigitNum = 0;
		
		for (int j = 0; j < 100; j++) {
			sixDigitNum = (long)(Math.random()*1000000000+11);
			if (sixDigitNum > 99999999 && sixDigitNum < 1000000000) {
				return sixDigitNum;
			}
		}
		
		return sixDigitNum;
	}

}
