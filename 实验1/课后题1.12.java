//Java���Գ�����ƿκ���1.12
package com.wry;
import java.util.Scanner;
public class TestCode {
	public static void main(String[] args) {
		double t,d,v;
		double hour=1,min=40,sec=35,mile=24;
		t=hour+min/60+sec/60/60;
		d=mile*1.6;
		v=d/t;
		System.out.printf("�ܲ���ƽ���ٶ�Ϊ %.2f ����/Сʱ", v);

	}
}