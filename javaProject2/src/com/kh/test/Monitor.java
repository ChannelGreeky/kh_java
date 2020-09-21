package com.kh.test;

public class Monitor {
	String modelName; // 모델명
	String productName; // 제품명
	int price; // 가격
	String color; // 색상
	boolean powerSwitch = false; // true:on/false:off

	public void monitorInfoSetting(String _modelName, String _productName, int _price, String _color) {
		modelName = _modelName;
		productName = _productName;
		price = _price;
		color = _color;
	}

	public void monitorPrint(String str) {
		if (!powerSwitch) {
			System.out.println("모니터를 켜세요");
		} else {
			System.out.println("모니터 출력:" + str);
		}
	}

	public void monitorPowerOn() {
		if (powerSwitch == false) {
			System.out.println("모니터 On");
			powerSwitch = true;
		} else if (powerSwitch == true) {
			System.out.println("모니터가 이미 켜져있습니다.");
		}
	}

	public void monitorPowerOff() {
		if (powerSwitch == true) {
			System.out.println("모니터 Off");
			powerSwitch = false;
		} else if (powerSwitch == false) {
			System.out.println("모니터가 이미 꺼져있습니다.");
		}
	}

	public void monitorInfoPrint() {
		System.out.println("==========모니터 사양 정보==========");
		System.out.println("모델명 \t 제품명 \t 가격 \t 색상");
		System.out.println(modelName + "\t" + productName + "\t" + price + "\t" + color);
	}
}
