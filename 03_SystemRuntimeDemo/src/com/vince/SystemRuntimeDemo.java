package com.vince;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class SystemRuntimeDemo {

	public static void main(String[] args) {

		System.out.println("�����̨���");
		System.err.println("������");
		
		int[] num1 = {1,2,3,4,5,6,7,8};
		int[] num2 = new int[num1.length];
		//������Դ���飬Դ�������ʼλ�� ��Ŀ�����飬Ŀ���������ʼλ�� �����ȣ�
		System.arraycopy(num1, 0, num2, 0, num1.length);
		System.out.println(Arrays.toString(num2));
		
		
		System.out.println(System.currentTimeMillis());
		Date nowDate = new Date(System.currentTimeMillis());
		DateFormat df = new SimpleDateFormat("HH:mm:ss");
		String now = df.format(nowDate);
		System.out.println(now);
		//�˳�JVM
		//System.exit(0)��
		
		System.out.println(System.getProperty("java.version"));
		System.out.println(System.getProperty("java.home"));
		System.out.println(System.getProperty("os.name"));
		
		Runtime rt = Runtime.getRuntime();
		System.out.println("������������" + rt.availableProcessors()+" ��");
		System.out.println("Jvm���ڴ��� ��"+ rt.totalMemory()+" byte");
		System.out.println("Jvm�����ڴ����� "+ rt.freeMemory()+" byte");
		System.out.println("Jvm��������ڴ����� "+ rt.maxMemory()+" byte");

		//�ڵ����Ľ�����ִ��ָ�����ַ�������
		try {
			rt.exec("notepad"); //�򿪼Ǳʱ�
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//����C��C++��д�����
		//System.loadLibrary(libname) 
		
	}

}
