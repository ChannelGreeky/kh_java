package com.kh.run;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		GenericTest2 gt1 = new GenericTest2<String, Integer>("Hello", 100);
//		GenericTest2 gt2 = new GenericTest2<Double, Character>(3.141592, 'A');
		
		//다운캐스팅을 이용한 객체 다형성 처리
		AnimalMgr m1 = new AnimalMgr(new Tiger("꽥꽥"));
		AnimalMgr m2 = new AnimalMgr(new Bear("미야우"));
		
		System.out.println(((Tiger)m1.getData()).getHowl());
		System.out.println(((Bear)m2.getData()).getHowl());
		
		//Generic을 이용한 객체 다형성 처리
		AnimalMgr<Tiger> m3 = new AnimalMgr<Tiger>(new Tiger("꽥꽥"));
		AnimalMgr<Bear> m4 = new AnimalMgr<Bear>(new Bear("미야우"));
		
		System.out.println(m3.getData().getHowl());
		System.out.println(m4.getData().getHowl());
	}

}
