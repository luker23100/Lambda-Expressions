package com.dev.App;

public class TextStuff {
	public static TextUtils<String> getFirst30Letters = (String text) -> {
		if(text.length() > 255)
			throw new TooLongException();
		else
			return text.length() < 30 ? text : text.substring(0, 30);
	};
	
	public static TextUtils<String> modifyTitle = (String title) -> {
		char[] letters = title.toCharArray();
		letters[0] = Character.toUpperCase(letters[0]);
		
		return (letters[letters.length-1] != '.') ? String.valueOf(letters) + "." : String.valueOf(letters);
	};
}
