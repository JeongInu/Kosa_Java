package kosa.mission;

import java.util.Scanner;

public class Mission02 {

	public static void main(String[] args) {
		//성적관리 구현
		//국어, 영어, 수학 점수 입력 받고
		//총점과 평균 출력 (단, 평균은 실수형)
		score();
		
	}
	
	static void score() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("국어 점수를 입력하시오.");
		int kor = scan.nextInt();
		
		System.out.println("영어 점수를 입력하시오.");
		int eng = scan.nextInt();
		
		System.out.println("수학 점수를 입력하시오.");
		int math = scan.nextInt();
		
		int total = kor + eng + math;
		//double avg = total / 3.0; 
		int avg = (int) (total / 3.0); 
		
		System.out.println("당신의 총점은 " + total + "점이고, 평균은 " + avg + "점 입니다.");
		
		scan.close();
	}

}
