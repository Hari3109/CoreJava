package com.cg.oops.part6;

public class OverridingEx5 {
	public static void main(String[] args) {
		new MoreFun();
	}

}
class Fun{
	public Fun() {
		havingFun();
	}
	void havingFun() {
		System.out.println("having fun.....");
	}
}
class MoreFun extends Fun{
	void havingFun() {
		System.out.println("having more and more fun........");
	}
}