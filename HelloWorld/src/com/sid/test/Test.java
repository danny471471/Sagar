package com.sid.test;

public class Test {

	public static void main(String[] args) {
		
		Integer a=100,b=100;
		Integer i=400,j=400;
		if(a==b){
			System.out.println("Inisde if");
		}else{
			System.out.println("Hii");
		}
		
		if(i==j){
			System.out.println("inside i");
		}else{
			System.out.println("inisde eksja");
		}
		
		Long m=100l,n=100l;
		Long x=400l,y=400l;
		
		if(m==n){
			System.out.println("insiddwdhsj");
		}else{
			System.out.println("hwedwfe");
		}
		
		if(x==y){
			System.out.println("frfewfregr");
		}else{
			System.out.println("pidfoiperoerpiet");
		}
		
		String d="hello";
		String f= new String("hello");
		if(d==f){
			System.out.println("before string intern");
		}
		f=f.intern();
		if(d==f){
			System.out.println("after String intern");
		}
		//helloWorldIStartedMyJob
		String g = new String("he");
		System.out.println(g.codePointAt(0));
		System.out.println(g.codePointBefore(1));
		
		System.out.println(System.getenv());
		System.out.println(System.getSecurityManager());
		System.out.println(System.getProperties());
		System.out.println(System.nanoTime());
		
	}
}
