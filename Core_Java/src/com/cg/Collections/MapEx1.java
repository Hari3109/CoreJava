package com.cg.Collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapEx1 {
public static void main(String[] args) {
	HashMap<String,String>map1=new HashMap<String,String>();
	map1.put("E-101","Hari" );
	map1.put("E-102","Harry" );
	map1.put("E-103","Beulah" );
	map1.put("E-104","mama" );
	System.out.println(map1);
	map1.put("E-102", "Harry s"); //overwrites
	System.out.println(map1);
	String name=map1.get("E-101");
	System.out.println(name);
	System.out.println(map1.containsKey("E-102"));
	System.out.println(map1.containsValue("mama"));
	
	TreeMap<String,String>map2=new TreeMap<String,String>();
	map2.put("E-101","Hari" );
	map2.put("E-102","Harry" );
	map2.put("E-103","Beulah" );
	map2.put("E-104","mama" );
	System.out.println(map2);
	map2.put("E-102", "Harry s"); //overwrites
	System.out.println(map2);
	String n=map2.get("E-101");
	System.out.println(n);
	System.out.println(map2.containsKey("E-102"));
	System.out.println(map2.containsValue("mama"));
	
	LinkedHashMap<String,String>map3=new LinkedHashMap<String,String>();
	map3.put("E-101","Hari" );
	map3.put("E-102","Harry" );
	map3.put("E-103","Beulah" );
	map3.put("E-104","mama" );
	System.out.println(map3);
	map3.put("E-102", "Harry s"); //overwrites
	System.out.println(map3);
	String na=map3.get("E-101");
	System.out.println(na);
	System.out.println(map3.containsKey("E-102"));
	System.out.println(map3.containsValue("mama"));
	
	Set<String>keys=map1.keySet(); //return set value
	System.out.println("----employee ids----");
	for(String empId:keys) {
		System.out.println(empId);
	}
	Collection<String>nameList=map1.values();
	System.out.println("----employee nmaes--");
	for(String nam:nameList) {
		System.out.println(nam);
	}
	System.out.println("---Id---Names----");
	Set<Entry<String,String>>records=map1.entrySet();
			for(Entry<String,String>row:records) {
				
				System.out.println(row.getKey()+"   "+row.getValue());
				
			}
}
}
