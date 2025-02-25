package kosa.mission;

import java.util.Scanner;

public class Mission01 {

	public static void main(String[] args) {
		//이름, 나이, 주소를 입력 받아 변수 초기화 후 출력
		//결과 >  이름 : 홍길등
		//		 나이 : 24
		//       주소 : 서울시 송파구 가락동
		
		info();
		
	}
	
	static void info() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("이름을 입력하시오.");
		String name = scan.nextLine();
		
		System.out.println("나이를 입력하시오.");
		int age = Integer.parseInt(scan.nextLine());
		
		System.out.println("주소를 입력하시오.");
		String addr = scan.nextLine();
		
		String ent = "\n";
		System.out.println("이름 : " + name + ent + "나이 : " + age + ent + "주소 : " + addr);
		
		scan.close();
	}

}
