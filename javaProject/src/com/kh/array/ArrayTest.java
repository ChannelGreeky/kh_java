package com.kh.array;

import java.util.Scanner;

public class ArrayTest {
	//1������
	public void practice() {
		int[] arr = new int[100];
		
		for(int i=0; i<100; i++) {
			arr[i] += i+1;
			System.out.println("arr["+i+"]:"+arr[i]);
		}
	}
	//2������	
	public void practice2() {
		String[] fruit = new String[]{"����", "�ٳ���", "Ű��", "���", "�ٳ���"};
		
		for(int i=4; i<5; i++) {
			System.out.println("�迭["+i+"]:"+fruit[i]);
		}
	}
	//3������
	public void practice3() {
		Scanner scan01 = new Scanner(System.in);
		String[] subject = new String[] {"��������", "��������", "��������", "�հ�"};
		int[] score = new int[4];
		
		for(int i=0; i<3; i++) {
			System.out.print(subject[i]+" �Է�:");
			score[i] = scan01.nextInt();
			
			score[3] += score[i];
		}
		for(int i=0; i<4; i++) {
			System.out.println(subject[i]+":"+score[i]);
		}
	}
	//3������ ����
	public void practice3_1() {
		Scanner scan01 = new Scanner(System.in);
		int[] score = new int[5];
		int sum=0;
		for(int i=0; i<5; i++) {
			System.out.print((i+1)+"��° �л��� ���� �Է�:");
			score[i] = scan01.nextInt();
		}
		System.out.println("<<�Է��� �л����� ����>>");
		for(int i=0; i<5; i++) {
			System.out.print(score[i]+" ");
			sum += score[i];
		}
		System.out.println("");
		System.out.println("�л����� �� �հ�:"+sum);
		System.out.println("�л����� ��� ����:"+(sum / (float)score.length));
	}
	//4������
	public void practice4() {
		Scanner scan01 = new Scanner(System.in);
		char[] arr = new char[5];

		for(int i=0; i<5; i++) {
			System.out.print("�Է�"+(i+1)+":");
			arr[i] = scan01.next().charAt(0);
		}
		for(int i=0; i<5; i++) {
			System.out.print(arr[i]);
		}
	}
	//5������
	public void practice5() {
		Scanner scan01 = new Scanner(System.in);
		char[] arr = new char[5];

		for(int i=0; i<5; i++) {
			System.out.print("�Է�"+(i+1)+":");
			arr[i] = scan01.next().charAt(0);
		}
		for(int i=0; i<5; i+=3) {
			System.out.println((i+1)+"��°:"+arr[i]);
		}
	}
	//6������
	public void practice6() {
		Scanner scan01 = new Scanner(System.in);
		int[] arr = new int[5];

		for(int i=0; i<5; i++) {
			System.out.print("�Է�"+(i+1)+":");
			arr[i] = scan01.nextInt();
		}
		System.out.println("3��° 5��°�� ��:"+(arr[2]+arr[4]));
	}
	//7������
	public void practice7() {
		Scanner scan01 = new Scanner(System.in);
		float[] weight = new float[5];
		float sum=0;
		float avg;
		for(int i=0; i<5; i++) {
			System.out.print((i+1)+"��° �ο� ������ �Է�:");
			weight[i] = scan01.nextFloat();
		}
		System.out.println("<<�Է��� �ο����� ������>>");
		for(int i=0; i<5; i++) {
			System.out.print(weight[i]+" ");
			sum += weight[i];
		}
		avg = sum / weight.length;
		System.out.println("");
		System.out.println("�ο����� ������ �� �հ�:"+String.format("%.1f", sum));
		//System.out.println("�ο����� ��� ������:"+String.format("%.1f", avg));
		System.out.printf("�ο����� ��� ������:%.2f", avg);
	}
	//8������
	public void practice8() {
		Scanner scan01 = new Scanner(System.in);
		int[] arr = new int[5];
		
		for(int i=0; i<5; i++) {
			System.out.print("�Է�"+(i+1)+":");
			arr[i] = scan01.nextInt();
		}
		//��������
		for(int i = 0; i < arr.length; i++) {
	        for(int j = 0 ; j < arr.length - i - 1 ; j++) {
	            if(arr[j] > arr[j+1]) {
	                int temp = arr[j+1];
	                arr[j+1] = arr[j];
	                arr[j] = temp;
	            }
	        }
	    }
		System.out.println("<<���İ��>>");
		for(int i=0; i<5; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	//9������
	public void practice10() {
		Scanner scan01 = new Scanner(System.in);
		System.out.print("���ڿ� �Է�:");
		String str1 = scan01.next();
		String[] str2 = str1.split("");
		
		System.out.print("ã�� ���� �Է�:");
		char search = scan01.next().charAt(0);
		
		int count=0;
		
		for(int i=0; i<str2.length; i++) {

			if(str2[i].charAt(0) == search) {
				count++;
			}
		}
		System.out.println(search+"�� ����:"+count+"��");
	}
	
	public void practice11() {
		Scanner scan01 = new Scanner(System.in);
		System.out.print("��ȭ��ȣ �Է�:");
		String str1 = scan01.next();
	}
}
