package com.kh.array;

public class ArrayEx1 {
	public void start() {
		int arr[] = new int[] {100, 200, 300, 400, 500}; //좌측 항은 배열의 레퍼런스
		int index = 0;
		
		System.out.println(arr[index++]);
		System.out.println(arr[index++]);
		System.out.println(arr[index++]);
		System.out.println(arr[index++]);
		System.out.println(arr[index]);
		
		System.out.println(index);
		System.out.println("배열 크기:"+arr.length);
	}
}
