package com.sid.test;

import java.util.Stack;

public class StringExample {
 public static void main(String[] args) {
	 String input = new String(); 
	 //input="(+546)";
	 input="(*2(-73)6)";
	 char[] cArray = input.toCharArray();
	 System.out.println("Array Length"+cArray.length);
	 Stack<Integer> val = new Stack<Integer>();
	 Stack<Character> ops = new Stack<Character>();
	 int ab = 0;
	 char oper = 0;
	 // By analysing the inputs i can find only digits,
	 //arithmetic operators and open and close braces
	 for(int i=0; i<cArray.length;i++){
		 
		 if(cArray[i]>='0'&&cArray[i]<='9'){
		// if i is also a integer then we need to store all these values in a variable
			 StringBuffer sbuf= new StringBuffer();
			 /*while(i<cArray.length&& cArray[i]>='0'&& cArray[i]<='9')
				 sbuf.append(cArray[i++]);*/
			 	sbuf.append(cArray[i]);
				 System.out.println(cArray[i]);
				 val.push(Integer.parseInt(sbuf.toString()));
		 }
		 // current value of i is open brace then i am adding in separate stack
		 else if(cArray[i]=='('){
			 //ops.push(cArray[i]);
			 System.out.println("do nothing");
		 }else if(cArray[i]==')'){
			 System.out.println(cArray[i]);
			 //System.out.println(val.pop());
			 //System.out.println(val.pop());
			  //ab=
					  val.push(logic(ops.pop(),val.pop(),val.pop()));
			 //System.out.println(ab);
			 
		 }else if (cArray[i]=='+'||cArray[i]=='-'||cArray[i]=='*'||cArray[i]=='/') {
			
			 //oper=cArray[i];
			 ops.push(cArray[i]);
		}
	 }
	 
	 val.push(logic(oper, val.pop(), val.pop()));
	 System.out.println(val);
	 System.out.println(ops);
	 System.out.println(val.pop());
 }

private static int logic(Character op, Integer b, Integer a) {
	// TODO Auto-generated method stub
	System.out.println("input ::"+ op+"::"+ a+"::"+ b);
		if(op=='+'){
			return a+b;
		}
		if(op=='+'){
			return a+b;
		}
		if(op=='-'){
			return a-b;
		}
		if(op=='*'){
			return a*b;
		}
		if(op=='/'){
			return a/b;
		}
	
		return 0;
	}
}
