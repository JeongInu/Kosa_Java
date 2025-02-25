package kosa.basic;

import java.util.Scanner;

public class VariableExam2 {

	public static void main(String[] args) {
		//키보드로부터 데이터 입력
//		System.out.println("첫번째");
//		System.out.println("두번째");
//		
//		System.out.print("1, ");
//		System.out.print("2, ");
//		System.out.println();
//		System.out.print("4, ");
		
		//키보드로부터 데이터 입력
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 입력 : ");
		int num = Integer.parseInt(sc.nextLine());
//		int num = sc.nextInt();
//		sc.nextLine();
		System.out.println("문자 입력 : ");
		String str = sc.nextLine();
		
		System.out.println(num);
		System.out.println(str);
		
		sc.close();
	}

}
