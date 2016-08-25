package com.sid.test;

public class TestingHello {

	public static void main(String[] args) {
		String input="aaaaccccbbbbddd";
		String result="";
		System.out.println(input);
		for(int i=0; i<input.length();i++){
			if(!(result.contains(String.valueOf(input.charAt(i))))){
				result= result.concat(String.valueOf(input.charAt(i)));
			}
		}
		System.out.println(result);
	 // above is inefficient methods
		
		StringBuffer sb = new StringBuffer();
		char inp[]=input.toCharArray();
		for(int i=0; i<inp.length-1;i++){
			if(inp[i]==inp[i+1]){
				
			}
		}
	}
}
