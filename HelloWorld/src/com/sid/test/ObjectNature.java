/**
 * 
 */
package com.sid.test;

/**
 * @author user
 *
 */
public class ObjectNature {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Object a;
		a="Hello";
		System.out.println(a.getClass().getName());
		a=10;
		System.out.println(a.getClass().getName());
		a=10.0;
		System.out.println(a.getClass().getName());
		a=10f;
		System.out.println(a.getClass().getName());
		
	}

}
