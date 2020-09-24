package com.kh.run;

import com.kh.point.controller.PntMgr;
import com.kh.point.vo.Gold;
import com.kh.point.vo.Silver;
import com.kh.point.vo.Vip;

public class TestMain {

	public static void main(String[] args) {
		PntMgr mgr = new PntMgr();
		
		mgr.insertData(new Silver("È«±æµ¿","½Ç¹ö",1000));
		mgr.insertData(new Silver("±è¸»¶Ë","½Ç¹ö",2000));
		mgr.insertData(new Silver("¶Ë¶ËÀÌ","½Ç¹ö",3000));
		mgr.insertData(new Silver("°í±æµ¿","½Ç¹ö",4000));
		mgr.insertData(new Gold("±èÈ²±Ý","°ñµå",1000));
		mgr.insertData(new Vip("±èºêÀÌ","VIP",1000));
		mgr.printData();
	}

}
