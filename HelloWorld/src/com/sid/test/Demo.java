package com.sid.test;

import java.util.Stack;

public class Demo {
public static void main(String[] args) {
	System.out.println("Helloo");
	Stack<Integer> sb = new Stack<Integer>();
	sb.push(5);
	sb.push(6);
	sb.push(4);
	System.out.println(sb);
	System.out.println(sb.pop());
	System.out.println(sb.pop());
	System.out.println(sb.pop());
}
}
