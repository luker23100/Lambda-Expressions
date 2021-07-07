package com.dev.App;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ArythmeticTest {
	
	@Test
	void invalidTriangleTest() {
		//given
		int a = 5;
		int b = 8;
		int c = 20;
		
		//then
		assertFalse(Arythmetic.triangleValidator.validate(a, b, c));
	}
	
	@Test
	void validTriangleTest() {
		//given
		int a = 6;
		int b = 4;
		int c = 8;
		
		//then
		assertTrue(Arythmetic.triangleValidator.validate(a, b, c));
	}
	
	@Test
	void validMultiplesOfFive() {
		//given
		int a = 10;
		int b = 15;
		int c = 85;
		
		//then
		assertTrue(Arythmetic.areMultiplesOfFive.validate(a, b, c));
	}
	
	@Test
	void invalidMultiplesOfFive() {
		//given
		int a = 10;
		int b = 34;
		int c = 85;
		
		//then
		assertFalse(Arythmetic.areMultiplesOfFive.validate(a, b, c));
	}
	
}
