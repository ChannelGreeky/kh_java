package com.kh.array;

public class ArrayEx1 {
	public void start() {
		int arr[] = new int[] {100, 200, 300, 400, 500}; //���� ���� �迭�� ���۷���
		int index = 0;
		
		System.out.println(arr[index++]);
		System.out.println(arr[index++]);
		System.out.println(arr[index++]);
		System.out.println(arr[index++]);
		System.out.println(arr[index]);
		
		System.out.println(index);
		System.out.println("�迭 ũ��:"+arr.length);
	}
}
