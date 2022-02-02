package com.aaryan.crafting;

import java.util.ArrayList;

public class Calculator {
		public int Add(String numbers) throws Exception {
			
			int sum = 0;
			
			if(!numbers.isEmpty()) {			
				String arr[] = numbers.split("\n");
//				int x = 0;
//				for(String s : arr) System.out.println(++x + " " + s);
//				System.out.println(arr.length);
				ArrayList <Integer> arr1 = new ArrayList<>();
				
				String delim = ",";
				
				if(arr[0].contains("//")) delim = arr[0].split("//")[1];
				
				for(int i = 0; i < arr.length; i++) {
					String temp[] = arr[i].split(delim);
					for(int j =0; j< temp.length; j++) {
						if(Integer.parseInt(temp[j]) < 0) {
							throw new Exception("negatives not allowed " + temp[j]);
						} else {
							arr1.add(Integer.parseInt(temp[j]));
						}
					}
				}
				
				
				for(int i = 0; i < arr1.size(); i++) {
					sum = sum + arr1.get(i);
//					System.out.println(arr1.get(i) + " " + sum);
				}
			}
			
			return sum;
			
		}
		
	
		
}
