package kosa.mission;

import java.util.Scanner;

public class Mission03 {

	public static void main(String[] args) {
		//������ �������� ���� ��ü �ڸ��� �� ¦��, Ȧ���� ������ ������.
		//5�ڸ��� ex)12345
		//¦���� ���� : 2��
		//Ȧ���� ���� : 3��
		cnt();
	}
	
	static void cnt() {
		
		int num = 12345;
		
		int num1 = num/10000;
		num = num % 10000;
		
		int num2 = num / 1000;
		num = num % 1000;
		
		int num3 = num / 100;
		num = num % 100;
		
		int num4 = num / 10;
		num = num % 10;
		
		int even = 0;
		int odd = 0;
		
		even += (num % 2 == 0) ? 1 : 0;
		even += (num1 % 2 == 0) ? 1 : 0;
		even += (num2 % 2 == 0) ? 1 : 0;
		even += (num3 % 2 == 0) ? 1 : 0;
		even += (num4 % 2 == 0) ? 1 : 0;
		
		odd = 5 - even;
		
		System.out.println("¦�� : " + even + "��, Ȧ�� : " + odd + "��");
		
	}

}
