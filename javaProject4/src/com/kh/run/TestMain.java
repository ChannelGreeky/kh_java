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
		
		
		mgr.insertData(new Silver("È«±æµ¿","½Ç¹ö",1000));
		mgr.insertData(new Silver("±è¸»¶Ë","½Ç¹ö",2000));
		mgr.insertData(new Silver("¶Ë¶ËÀÌ","½Ç¹ö",3000));
		mgr.insertData(new Silver("°í±æ¶Ë","½Ç¹ö",4000));
		mgr.insertData(new Gold("±è°ñµå","°ñµå",1000));
		mgr.insertData(new Vip("±èºêÀÌ","Vip",1000)); //5% ÀÌÀÚÀ²
		mgr.insertData(new Vvip("±èÈ¸Àå","VVip",1000)); //10% ÀÌÀÚÀ²
		mgr.insertData(new Platinum("±èÅë·É","Pla",1000)); //10% ÀÌÀÚÀ²
		mgr.insertData(new Kh("±èÄÉÀÌ","KH",1000)); //50% ÀÌÀÚÀ²
		mgr.printData();

	}

}





