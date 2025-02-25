package kosa.basic;

public class VariableExam {

	public static void main(String[] args) {
		//변수는 데이터를 담는 그릇, 데이터 종류 다양 ex)홍길동, 100, 3.14, true
		//기본형 데이터타입(primitive type)
		//byte,short,int,long => 정수형
		//float, double => 실수형
		//char => 문자형 (문자1개)
		//boolean => 논리형
		//String => 문자열 => ObjectType
		
		int num; //변수 선언 => 메모리 할당
		int arr[]; //배열 선언 : ObjectType
		
		num = 100;
		
		int num2 = 10; //메서드 안에 선언된 변수 로컬변수(지역변수) => 반드시 초기화 후 사용
		System.out.println(num2);
		
		int num3 = 200; //변수 선언, 초기화
		System.out.println("숫자 : " + num3);
		
		//변수 선언 시 유의사항
		//변수명 : 특수문자 x, 숫자로 시작 x, 예약어 x, 소문자
		//기본 리터럴 : "":String, true:boolean, 10:int, 3.14:double
		
		float num4 = 3.14f;
		
		//casting(형변환) : 기준
		//byte < short < int < long < float < double < String
		//int <==> char
		double b = 3.14;
		int c = (int) b; //강제 형변환
		System.out.println(c); //데이터 손실 발생
		
		double e = c; //암묵적 형변환
		System.out.println(e);
		
		long num5 = 100L;
		
		int num6 = 010;
		System.out.println(num6);
	}

}
