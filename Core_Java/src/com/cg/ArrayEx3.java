package com.cg;

public class ArrayEx3 {
	public static void main(String[] args) {
		int nums[]= {12,34,45,67,89,23};
		int search=100;
		boolean isFound=searchElement(nums, search);
		System.out.println(isFound);
	}
	
	static boolean searchElement(int nums[],int e) {
		for(int i=0;i<nums.length;i++) {
			if(nums[i]==e) {
				return true;
			}
		}
		return false;
	}

}
