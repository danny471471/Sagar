package com.sid.test;

import java.util.Stack;

public class Example {

	public static void main(String[] args) {
		
		Stack<Integer> sb = new Stack<Integer>();
	sb.push(5);
	sb.push(6);
	sb.push(4);
	System.out.println(sb);
	System.out.println(sb.pop());
	System.out.println(sb.pop());
	System.out.println(sb.pop());
		//int input[]={0,1,1,0,2,1,2,1,0};
		//System.out.println(input);
		
		/*int a=input[0];
		int outputA[] =new int[input.length];
		int outputB[] =new int[input.length];
		int outputC[] =new int[input.length];
		System.out.println("lenth of Input array"+input.length);
		int j=0;
		for(int i=0; i<input.length-1; i++){
			if(a>input[i+1]){
				System.out.println("Greater"+input[i+1]);
				outputA[i]=input[i+1];
				
			}else if(a<input[i+1]){
				System.out.println("Lesser"+j+"::"+input[i+1]);
				outputB[j]=input[i+1];
				j++;
				
			}else{
				System.out.println("Equals"+input[i+1]);
				outputC[i]=input[i+1];
			}
		}
		for(int i=0; i<outputB.length;i++)
		System.out.println("OUTTPUTB ::"+outputB[i]);*/
		
		/*int low=0;
		int high=input.length-1;
		int mid =0;
		int temp;
		while(mid<=high){
			
			switch(input[mid]){
			
			case 0: temp=input[low];
					input[low]=input[mid];
					input[mid]=temp;
					mid++;
					low++;
					break;
			
			case 1:mid++;
			 break;
				
			case 2: temp= input[mid];
			input[mid]=input[high];
			input[high]=temp;
			high--;
			break;
			}
		}
		for(int i=0;i<input.length;i++)
		System.out.println(input[i]);*/
		
		int a[]={1,5,3,4,7,9};
		int pivot=a[a.length-1];
		int temp;
		System.out.println(pivot);
		for(int i=a.length-1; i>0;i--){
			for(int j=0; j<a.length-1; j++){
				if(a[i]>a[j]){
				 temp=a[i];
				 a[i]=a[j];
				 a[j]=temp;
				}
			}
			
		}
		
		for(int i=0; i<a.length;i++){
			System.out.println(a[i]);
		}
		
		
	}
	
	
}
