package com.sid.test;

public class PassByValue {

	public static void main(String[] args) {
		String str;
		StringBuffer sb;
		StringBuilder sd;
		str="hello";
		System.out.println(str);
		changeIt(str);
		System.out.println(str);
 }
	public static void changeIt(String st){
		st=st+"world";
	}
}
