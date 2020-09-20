package com.sng.magic;

public class Shuffle {
	public String[][] shuffle(String[][] magic_trump){
		
		String temp;
		
		int col=0, row=0;
		//Ä«µå ¼ÅÇÃ
		for(int i=0; i<100; i++) {
			temp=magic_trump[(int)(Math.random()*7)][(int)(Math.random()*3)];
		}
		
		return magic_trump;
	}
}
