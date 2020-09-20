package com.kh.array;

public class ArrayEx4 {
	public void arrcopy() {
		//¾èÀº º¹»ç
		int[] arr1 = new int[] {1, 2, 3, 4};
		int[] arr2 = arr1;
		
		//±íÀº º¹»ç
		int[] arr3 = new int[5];
		System.arraycopy(arr1, 0, arr3, 0, arr1.length);
		int[] arr4 = arr1.clone();
	}
	
	public void start() {
		int [][] arr = new int[5][5];
		int k = 1;
		
		for(int i=0; i<5; i++) {
			for(int j=4; j>-1; j--) {
				arr[i][j] = k++;
			}
		}
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.printf("%5d", arr[i][j]);
			}
			System.out.println();
		}
	}
}
