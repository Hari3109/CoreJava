package com.cg.Collections;
import java.util.ArrayList;
import java.util.Collections;
public class SortingListEx1 {
	public static void main(String[] args) {
		ArrayList<String>list1=new ArrayList<String>();
         list1.add("Biryani");
         list1.add("ice cream");
         list1.add("cake");
         list1.add("coffe");
         list1.add("Donut");
         System.out.println("----without sorting---");
         System.out.println(list1);
         Collections.sort(list1);
         System.out.println("----after sorting--");
         System.out.println(list1);
         Collections.reverse(list1);
         System.out.println("-----reverse order-----");
         System.out.println(list1);
    

}
}