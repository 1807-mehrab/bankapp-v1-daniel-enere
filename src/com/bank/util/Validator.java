package com.bank.util;

import java.util.IllegalFormatException;

public class Validator {
	public static boolean SSNValidator(int SSN) throws IllegalFormatException {
		if (SSN < 99999999) {
			return false;
		} else {
			return true;
		}
	}
}
