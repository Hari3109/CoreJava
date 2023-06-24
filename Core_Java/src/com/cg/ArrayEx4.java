package com.cg;

public class ArrayEx4 {
	public static void main(String[] args) {
		int nums[]= {12,45,67,45,30,27};
		int search=45;
		int c=count(nums,search);
		System.out.println(c);
    }
static int count(int nums[],int no) {
	int count=0;
	for(int i=0;i<nums.length;i++){ 
		if(no==nums[i]) {
			count++;
		}
		//return count;
	}
	return count++;
}
}

