package kosa.mission;

import java.util.Scanner;

public class Mission01 {

	public static void main(String[] args) {
		//�̸�, ����, �ּҸ� �Է� �޾� ���� �ʱ�ȭ �� ���
		//��� >  �̸� : ȫ���
		//		 ���� : 24
		//       �ּ� : ����� ���ı� ������
		
		info();
		
	}
	
	static void info() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�̸��� �Է��Ͻÿ�.");
		String name = scan.nextLine();
		
		System.out.println("���̸� �Է��Ͻÿ�.");
		int age = Integer.parseInt(scan.nextLine());
		
		System.out.println("�ּҸ� �Է��Ͻÿ�.");
		String addr = scan.nextLine();
		
		String ent = "\n";
		System.out.println("�̸� : " + name + ent + "���� : " + age + ent + "�ּ� : " + addr);
		
		scan.close();
	}

}
