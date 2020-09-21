package com.sng.magic;

public class Print {
	public void print(String[][] arr) {
		for (int i = 0; i < 3; i++) {
			System.out.print("(" + (i + 1) + ")  ");
			for (int j = 0; j < 7; j++) {
				System.out.printf("%-5s", arr[i][j]);
			}
			System.out.println();
			System.out.println();
		}
	}
}
