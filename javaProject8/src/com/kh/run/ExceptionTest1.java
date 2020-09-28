package com.kh.run;

public class ExceptionTest1 {
	public void start() {
		int a = 10;
		int b = 5;
		
		try {
			int result = div(a,b);
			System.out.println(a+"/"+b+"="+result);
		} catch (ExceptionTest3 e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	// ����� ���� Exception
	public int div (int su1, int su2) throws ExceptionTest3 {
		
		if(su1 == 0 || su2 == 0) {
			throw new ExceptionTest3("0�� �ȵ˴ϴ�.");
		}
		return su1/su2;
	}

}
