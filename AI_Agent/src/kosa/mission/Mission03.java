package kosa.mission;

import java.util.Scanner;

public class Mission03 {

	public static void main(String[] args) {
		//임의의 정수값에 대해 전체 자리수 중 짝수, 홀수의 갯수를 구하자.
		//5자리수 ex)12345
		//짝수의 갯수 : 2개
		//홀수의 갯수 : 3개
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
		
		System.out.println("짝수 : " + even + "개, 홀수 : " + odd + "개");
		
	}

}
