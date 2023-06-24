package com.cg.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
public class SetEx1 {
public static void main(String[] args) {
	/*
	 * HashSet-->wont permit duplicates
	 *        -->cannot guaranty the order of elements
	 */
	HashSet<String> set1=new HashSet<String>();
	boolean b1=set1.add("pani puri");//returns boolean
	set1.add("pizza");
	set1.add("Momo");
	boolean b2=set1.add("pani puri");//ignores
	System.out.println(set1);
	System.out.println(b1+" "+b2);
	/*
	 * TreeSet-->Wont permits duplicate
	 * -->in default arrange in sorted order
	 */
	TreeSet<String> set2=new TreeSet<String>();
	set2.add("chennai");
	set2.add("Bangalore");
	set2.add("pune");
	set2.add("chennai");
	set2.add("mumbai");
	System.out.println(set2);
	/*
	 * LinkedHashSet-->no duplicates
	 *              -->elements arranged in the insertion order
	 * 
	 */
	LinkedHashSet<String>set3=new LinkedHashSet<String>();
	set3.add("chennai");
	set3.add("Bangalore");
	set3.add("pune");
	set3.add("chennai");
	set3.add("mumbai");
	System.out.println(set3);
	
}
}
