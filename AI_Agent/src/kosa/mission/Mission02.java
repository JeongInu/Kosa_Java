package kosa.mission;

import java.util.Scanner;

public class Mission02 {

	public static void main(String[] args) {
		//�������� ����
		//����, ����, ���� ���� �Է� �ް�
		//������ ��� ��� (��, ����� �Ǽ���)
		score();
		
	}
	
	static void score() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("���� ������ �Է��Ͻÿ�.");
		int kor = scan.nextInt();
		
		System.out.println("���� ������ �Է��Ͻÿ�.");
		int eng = scan.nextInt();
		
		System.out.println("���� ������ �Է��Ͻÿ�.");
		int math = scan.nextInt();
		
		int total = kor + eng + math;
		//double avg = total / 3.0; 
		int avg = (int) (total / 3.0); 
		
		System.out.println("����� ������ " + total + "���̰�, ����� " + avg + "�� �Դϴ�.");
		
		scan.close();
	}

}
