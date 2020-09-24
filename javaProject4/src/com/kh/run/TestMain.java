package com.kh.run;

import com.kh.point.controller.PntMgr;
import com.kh.point.vo.Gold;
import com.kh.point.vo.Kh;
import com.kh.point.vo.Platinum;
import com.kh.point.vo.Silver;
import com.kh.point.vo.Vip;
import com.kh.point.vo.Vvip;

public class TestMain {

	public static void main(String[] args) {
		PntMgr mgr = new PntMgr();
		
		
		mgr.insertData(new Silver("ȫ�浿","�ǹ�",1000));
		mgr.insertData(new Silver("�踻��","�ǹ�",2000));
		mgr.insertData(new Silver("�˶���","�ǹ�",3000));
		mgr.insertData(new Silver("����","�ǹ�",4000));
		mgr.insertData(new Gold("����","���",1000));
		mgr.insertData(new Vip("�����","Vip",1000)); //5% ������
		mgr.insertData(new Vvip("��ȸ��","VVip",1000)); //10% ������
		mgr.insertData(new Platinum("�����","Pla",1000)); //10% ������
		mgr.insertData(new Kh("������","KH",1000)); //50% ������
		mgr.printData();

	}

}





