package com.dev.App;

public class Arythmetic{
	
	public static Validator triangleValidator = (int a, int b, int c) -> {
		boolean b1 = a+b > c;
		boolean b2 = a+c > b;
		boolean b3 = b+c > a;
		
		return (b1 && b2 && b3) ? true : false;
	};
	
}
