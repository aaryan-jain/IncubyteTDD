package com.aaryan.crafting;

public class Calculator {
		public int Add(String numbers) {
			
			int sum = 0;
			
			if(!numbers.isEmpty()) {			
				String arr[] = numbers.split(",");
				//int arr1[] = new int[arr.length];
				for(int i = 0; i < arr.length; i++) {
					sum = sum + Integer.parseInt(arr[i]);
				}
			}
			
			return sum;
			
		}
		
	
}
