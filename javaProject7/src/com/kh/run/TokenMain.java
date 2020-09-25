package com.kh.run;

import java.util.StringTokenizer;

public class TokenMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "J a v a P r o g r a m";
		StringBuffer sb= new StringBuffer();
		
		StringTokenizer st = new StringTokenizer(str, " ");
		
		char[] ch = new char[st.countTokens()];

//		int i = 0;
//		while(st.hasMoreTokens()) {
//			ch[i]=st.nextToken().charAt(0);
//			if((97 <= ch[i] && ch[i] <= 122)) {
//				ch[i] = (char) (ch[i]-32);
//			}
//			i++;
//		}
		
//		for(i=0; i<ch.length; i++) {
//			System.out.print(ch[i]);
//		}
		
		for(int i=0; st.hasMoreTokens(); i++) {
			ch[i]=st.nextToken().charAt(0);
			if(('a' <= ch[i] && ch[i] <= 'z')) {
				ch[i] -= 32;
			}
			sb.append(ch[i]); // 문자 배열을 문자열로만들기
			System.out.print(ch[i]);
		}
		
		System.out.println("\n"+sb);
	}
}
