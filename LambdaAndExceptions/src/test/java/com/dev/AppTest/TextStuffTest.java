package com.dev.AppTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import com.dev.App.TextStuff;
import com.dev.App.TooLongException;

public class TextStuffTest {
	
	@Test
	void testIfThrowsException() {
		//given
		StringBuilder text = new StringBuilder();
		for(int i=0; i<300; i++)
			text.append("x");
		
		//then
		assertThrows(TooLongException.class, () -> {
			TextStuff.getFirst30Letters.perform(text.toString());
		});
	}
	
	@Test
	void testTextUnder30Letters() throws TooLongException {
		//given
		StringBuilder text = new StringBuilder();
		for(int i=0; i<25; i++)
			text.append("x");
		
		//when
		int expectedLength = 25;
		
		//then
		assertEquals(expectedLength, TextStuff.getFirst30Letters.perform(text.toString()).length());
	}
	
	@Test
	void testTextAbove30Letters() throws TooLongException {
		//given
		StringBuilder text = new StringBuilder();
		for(int i=0; i<60; i++)
			text.append("x");
		
		//when
		int expectedLength = 30;
		
		//then
		assertEquals(expectedLength, TextStuff.getFirst30Letters.perform(text.toString()).length());
	}
	
	@Test
	void testTitle1() throws TooLongException {
		//given
		String title = "some title example.";
		
		//when
		String expectedTitle = "Some title example.";
		
		//then
		assertEquals(expectedTitle, TextStuff.modifyTitle.perform(title));
	}
	
	@Test
	void testTitle2() throws TooLongException {
		//given
		String title = "some title example";
		
		//when
		String expectedTitle = "Some title example.";
		
		//then
		assertEquals(expectedTitle, TextStuff.modifyTitle.perform(title));
	}
	
}
