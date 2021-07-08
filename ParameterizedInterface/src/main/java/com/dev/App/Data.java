package com.dev.App;

public class Data {
	
	public static Manager<String> howManyK = (String word) -> {
		char[] letters = word.toCharArray();
		int numberOfK = 0;
		
		for(Character ch : letters)
			if(ch == 'k' || ch == 'K')
				numberOfK++;
		
		return String.valueOf(numberOfK);
	};
	
	public static Manager2<Integer, int[]> fillArray = (Integer n) -> {
		int[] table = new int[n+1];
		
		for(int i=0; i<=n; i++)
			table[i] = i;
		
		return table;
	};
	
}
