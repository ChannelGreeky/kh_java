package com.kh.run;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		GenericTest2 gt1 = new GenericTest2<String, Integer>("Hello", 100);
//		GenericTest2 gt2 = new GenericTest2<Double, Character>(3.141592, 'A');
		
		//�ٿ�ĳ������ �̿��� ��ü ������ ó��
		AnimalMgr m1 = new AnimalMgr(new Tiger("�в�"));
		AnimalMgr m2 = new AnimalMgr(new Bear("�̾߿�"));
		
		System.out.println(((Tiger)m1.getData()).getHowl());
		System.out.println(((Bear)m2.getData()).getHowl());
		
		//Generic�� �̿��� ��ü ������ ó��
		AnimalMgr<Tiger> m3 = new AnimalMgr<Tiger>(new Tiger("�в�"));
		AnimalMgr<Bear> m4 = new AnimalMgr<Bear>(new Bear("�̾߿�"));
		
		System.out.println(m3.getData().getHowl());
		System.out.println(m4.getData().getHowl());
	}

}
