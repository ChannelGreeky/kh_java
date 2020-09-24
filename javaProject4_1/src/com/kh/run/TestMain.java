package com.kh.run;

import com.kh.point.controller.PntMgr;
import com.kh.point.vo.Gold;
import com.kh.point.vo.Silver;
import com.kh.point.vo.Vip;

public class TestMain {

	public static void main(String[] args) {
		PntMgr mgr = new PntMgr();
		
		mgr.insertData(new Silver("ȫ�浿","�ǹ�",1000));
		mgr.insertData(new Silver("�踻��","�ǹ�",2000));
		mgr.insertData(new Silver("�˶���","�ǹ�",3000));
		mgr.insertData(new Silver("��浿","�ǹ�",4000));
		mgr.insertData(new Gold("��Ȳ��","���",1000));
		mgr.insertData(new Vip("�����","VIP",1000));
		mgr.printData();
	}

}
