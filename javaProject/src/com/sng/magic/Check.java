package com.sng.magic;

import java.util.Scanner;

public class Check {
	public String[][] check(String[][] magic_trump) {
		Scanner sc = new Scanner(System.in);

		String[] magic_card_arr = new String[21];
		int k = 0;
		char answer;

		System.out.println("������ �� ī�尡 (2)��° �࿡ �ֽ��ϱ�? (�´ٸ� YȤ�� y Ʋ���ٸ� NȤ�� n)");
		answer = sc.next().charAt(0);
		if (answer == 'Y' || answer == 'y') {
			for (int i = 0; i < 7; i++) {
				magic_card_arr[i] = magic_trump[0][k];
				k++;
			}
			k = 0;
			for (int i = 7; i < 14; i++) {
				magic_card_arr[i] = magic_trump[1][k];
				k++;
			}
			k = 0;
			for (int i = 14; i < 21; i++) {
				magic_card_arr[i] = magic_trump[2][k];
				k++;
			}
		} else {
			System.out.println("������ �� ī�尡 (1)��° �࿡ �ֽ��ϱ�?");
			answer = sc.next().charAt(0);
			if (answer == 'Y' || answer == 'y') {
				k = 0;
				for (int i = 0; i < 7; i++) {
					magic_card_arr[i] = magic_trump[1][k];
					k++;
				}
				k = 0;
				for (int i = 7; i < 14; i++) {
					magic_card_arr[i] = magic_trump[0][k];
					k++;
				}
				k = 0;
				for (int i = 14; i < 21; i++) {
					magic_card_arr[i] = magic_trump[2][k];
					k++;
				}
			} else {
				k = 0;
				for (int i = 0; i < 7; i++) {
					magic_card_arr[i] = magic_trump[0][k];
					k++;
				}
				k = 0;
				for (int i = 7; i < 14; i++) {
					magic_card_arr[i] = magic_trump[2][k];
					k++;
				}
				k = 0;
				for (int i = 14; i < 21; i++) {
					magic_card_arr[i] = magic_trump[1][k];
					k++;
				}
			}
		}
		k = 20;
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 3; j++) {
				magic_trump[j][i] = magic_card_arr[k];
				k--;
			}
		}

		return magic_trump;
	}
}
