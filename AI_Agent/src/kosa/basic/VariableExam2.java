package kosa.basic;

import java.util.Scanner;

public class VariableExam2 {

	public static void main(String[] args) {
		//Ű����κ��� ������ �Է�
//		System.out.println("ù��°");
//		System.out.println("�ι�°");
//		
//		System.out.print("1, ");
//		System.out.print("2, ");
//		System.out.println();
//		System.out.print("4, ");
		
		//Ű����κ��� ������ �Է�
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� �Է� : ");
		int num = Integer.parseInt(sc.nextLine());
//		int num = sc.nextInt();
//		sc.nextLine();
		System.out.println("���� �Է� : ");
		String str = sc.nextLine();
		
		System.out.println(num);
		System.out.println(str);
		
		sc.close();
	}

}
