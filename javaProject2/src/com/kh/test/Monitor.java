package com.kh.test;

public class Monitor {
	String modelName; // �𵨸�
	String productName; // ��ǰ��
	int price; // ����
	String color; // ����
	boolean powerSwitch = false; // true:on/false:off

	public void monitorInfoSetting(String _modelName, String _productName, int _price, String _color) {
		modelName = _modelName;
		productName = _productName;
		price = _price;
		color = _color;
	}

	public void monitorPrint(String str) {
		if (!powerSwitch) {
			System.out.println("����͸� �Ѽ���");
		} else {
			System.out.println("����� ���:" + str);
		}
	}

	public void monitorPowerOn() {
		if (powerSwitch == false) {
			System.out.println("����� On");
			powerSwitch = true;
		} else if (powerSwitch == true) {
			System.out.println("����Ͱ� �̹� �����ֽ��ϴ�.");
		}
	}

	public void monitorPowerOff() {
		if (powerSwitch == true) {
			System.out.println("����� Off");
			powerSwitch = false;
		} else if (powerSwitch == false) {
			System.out.println("����Ͱ� �̹� �����ֽ��ϴ�.");
		}
	}

	public void monitorInfoPrint() {
		System.out.println("==========����� ��� ����==========");
		System.out.println("�𵨸� \t ��ǰ�� \t ���� \t ����");
		System.out.println(modelName + "\t" + productName + "\t" + price + "\t" + color);
	}
}
