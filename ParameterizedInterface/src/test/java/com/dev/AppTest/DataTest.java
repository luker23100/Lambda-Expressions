package com.dev.AppTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.dev.App.Data;

public class DataTest {
	
	@Test
	void numberOfKTest() {
		//given
		String word = "Kajak dryfuje przy krzakach";
		
		//when
		int expectedNumberOfK = 4;
		
		//then
		assertEquals(expectedNumberOfK, Integer.parseInt(Data.howManyK.start(word)));
	}
	
	@Test
	void fillingArrayTest() {
		//given
		int n = 12;
		
		//when
		int expectedValueOn8 = 8;
		
		//then
		assertEquals(expectedValueOn8, Data.fillArray.start(n)[8]);
	}
	
}
