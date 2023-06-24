package com.cg.Icompass;
import java.util.*;
public class Mobile {
HashMap<String,ArrayList<String>>mobile=new HashMap<>();
public String addMobile(String company,String model) {
	ArrayList<String>list=null;
	if(mobile.containsKey(company)) {
		list=mobile.get(company);
	}
	else {
		list=new ArrayList<String>();
	}
	list.add(model);
	mobile.put(company, list);
	return "model added succefully";
}
public ArrayList<String>getModel(String company){
	if(mobile.containsKey(company)) {
		return mobile.get(company);
	}
	else {
		return null;
	}
}
public String buyMobile(String company,String model) {
	if(mobile.containsKey(company)) {
		ArrayList<String>list=mobile.get(company);
		boolean flag=false;
		for(String s:list) {
			if(s.equals(model)) {
				list.remove(s);
				flag=true;
				break;
			}
		}
		mobile.put(company, list);
		if(flag)
			return "mobile sold succefully";
		else
			return"item noy available";
	}
}
}
