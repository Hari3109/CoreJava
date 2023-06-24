package com.cg.array;

public class test {
	    public static void main(String[] args) {
	        int[] array = {-2, 3, 0, -5, 8, -1};
	        int count = 0;
	        
	        for (int i = 0; i < array.length; i++) {
	            if (array[i] < 0) {
	                count++;
	            }
	        }
	        
	        System.out.println("The count of negative numbers in the array is: " + count);
	    }
	}
