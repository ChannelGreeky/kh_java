package com.kh.array;

import java.util.Scanner;

public class ArrayTest {
	//1번문제
	public void practice() {
		int[] arr = new int[100];
		
		for(int i=0; i<100; i++) {
			arr[i] += i+1;
			System.out.println("arr["+i+"]:"+arr[i]);
		}
	}
	//2번문제	
	public void practice2() {
		String[] fruit = new String[]{"딸기", "바나나", "키위", "사과", "바나나"};
		
		for(int i=4; i<5; i++) {
			System.out.println("배열["+i+"]:"+fruit[i]);
		}
	}
	//3번문제
	public void practice3() {
		Scanner scan01 = new Scanner(System.in);
		String[] subject = new String[] {"국어점수", "수학점수", "영어점수", "합계"};
		int[] score = new int[4];
		
		for(int i=0; i<3; i++) {
			System.out.print(subject[i]+" 입력:");
			score[i] = scan01.nextInt();
			
			score[3] += score[i];
		}
		for(int i=0; i<4; i++) {
			System.out.println(subject[i]+":"+score[i]);
		}
	}
	//3번문제 응용
	public void practice3_1() {
		Scanner scan01 = new Scanner(System.in);
		int[] score = new int[5];
		int sum=0;
		for(int i=0; i<5; i++) {
			System.out.print((i+1)+"번째 학생의 성적 입력:");
			score[i] = scan01.nextInt();
		}
		System.out.println("<<입력한 학생들의 성적>>");
		for(int i=0; i<5; i++) {
			System.out.print(score[i]+" ");
			sum += score[i];
		}
		System.out.println("");
		System.out.println("학생들의 총 합계:"+sum);
		System.out.println("학생들의 평균 점수:"+(sum / (float)score.length));
	}
	//4번문제
	public void practice4() {
		Scanner scan01 = new Scanner(System.in);
		char[] arr = new char[5];

		for(int i=0; i<5; i++) {
			System.out.print("입력"+(i+1)+":");
			arr[i] = scan01.next().charAt(0);
		}
		for(int i=0; i<5; i++) {
			System.out.print(arr[i]);
		}
	}
	//5번문제
	public void practice5() {
		Scanner scan01 = new Scanner(System.in);
		char[] arr = new char[5];

		for(int i=0; i<5; i++) {
			System.out.print("입력"+(i+1)+":");
			arr[i] = scan01.next().charAt(0);
		}
		for(int i=0; i<5; i+=3) {
			System.out.println((i+1)+"번째:"+arr[i]);
		}
	}
	//6번문제
	public void practice6() {
		Scanner scan01 = new Scanner(System.in);
		int[] arr = new int[5];

		for(int i=0; i<5; i++) {
			System.out.print("입력"+(i+1)+":");
			arr[i] = scan01.nextInt();
		}
		System.out.println("3번째 5번째의 합:"+(arr[2]+arr[4]));
	}
	//7번문제
	public void practice7() {
		Scanner scan01 = new Scanner(System.in);
		float[] weight = new float[5];
		float sum=0;
		float avg;
		for(int i=0; i<5; i++) {
			System.out.print((i+1)+"번째 인원 몸무게 입력:");
			weight[i] = scan01.nextFloat();
		}
		System.out.println("<<입력한 인원들의 몸무게>>");
		for(int i=0; i<5; i++) {
			System.out.print(weight[i]+" ");
			sum += weight[i];
		}
		avg = sum / weight.length;
		System.out.println("");
		System.out.println("인원들의 몸무게 총 합계:"+String.format("%.1f", sum));
		//System.out.println("인원들의 평균 몸무게:"+String.format("%.1f", avg));
		System.out.printf("인원들의 평균 몸무게:%.2f", avg);
	}
	//8번문제
	public void practice8() {
		Scanner scan01 = new Scanner(System.in);
		int[] arr = new int[5];
		
		for(int i=0; i<5; i++) {
			System.out.print("입력"+(i+1)+":");
			arr[i] = scan01.nextInt();
		}
		//버블정렬
		for(int i = 0; i < arr.length; i++) {
	        for(int j = 0 ; j < arr.length - i - 1 ; j++) {
	            if(arr[j] > arr[j+1]) {
	                int temp = arr[j+1];
	                arr[j+1] = arr[j];
	                arr[j] = temp;
	            }
	        }
	    }
		System.out.println("<<정렬결과>>");
		for(int i=0; i<5; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	//9번문제
	public void practice10() {
		Scanner scan01 = new Scanner(System.in);
		System.out.print("문자열 입력:");
		String str1 = scan01.next();
		String[] str2 = str1.split("");
		
		System.out.print("찾을 문자 입력:");
		char search = scan01.next().charAt(0);
		
		int count=0;
		
		for(int i=0; i<str2.length; i++) {

			if(str2[i].charAt(0) == search) {
				count++;
			}
		}
		System.out.println(search+"의 개수:"+count+"개");
	}
	
	public void practice11() {
		Scanner scan01 = new Scanner(System.in);
		System.out.print("전화번호 입력:");
		String str1 = scan01.next();
	}
}
