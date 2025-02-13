/*
 * Copyright 2015-2024 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v2.0 which
 * accompanies this distribution and is available at
 *
 * http://www.eclipse.org/legal/epl-v20.html
 */

package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CalculatorTests {

	@Test
	@DisplayName("1 + 1 = 2")
	void addsTwoNumbers() {
		Calculator calculator = new Calculator();
		assertEquals(2, calculator.add(1, 1), "1 + 1 should equal 2");
	}

	@ParameterizedTest(name = "{0} + {1} = {2}")
	@CsvSource({
			"0,    1,   1",
			"1,    2,   3",
			"49,  51, 100",
			"1,  100, 101"
	})
	void add(int first, int second, int expectedResult) {
		Calculator calculator = new Calculator();
		assertEquals(expectedResult, calculator.add(first, second),
				() -> first + " + " + second + " should equal " + expectedResult);
	}

	@Test
	@DisplayName("5 - 2 = 3")
	void subtractTwoNumbers() {
		Calculator calculator = new Calculator();
		assertEquals(3, calculator.subtract(5, 2), "5 - 2 should equal 3");
	}

	@Test
	@DisplayName("7 * 2 = 14")
	void multiplicationTwoNumbers() {
		Calculator calculator = new Calculator();
		assertEquals(14, calculator.multiplication(7, 2), "7 * 2 should equal 14");
	}

	@Test
	@DisplayName("10 / 5 = 2")
	void divisionTwoNumbers() {
		Calculator calculator = new Calculator();
		assertEquals(2, calculator.division(10, 5), "10 / 5 should equal 2");
	}

	
}
