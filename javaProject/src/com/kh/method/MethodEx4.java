package com.kh.method;

public class MethodEx4 {
	public void start() {
		int arr[] = new int[] {10,20,30,40};
		
		valMethod(arr[0]);
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		refMethod(arr);
	}
	
	//Call by value
	public void valMethod(int data) {
		
		data = 999;
	}
	
	//Call by reference
	public void refMethod(int [] data) {
		data[0] = 999;
	}
	
}
