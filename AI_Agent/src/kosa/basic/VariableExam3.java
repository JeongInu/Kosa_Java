package kosa.basic;

public class VariableExam3 {

	public static void main(String[] args) {
		int num;
		
		if(1==1) {
			num = 100;
		}
		
		System.out.println(num);
		
		//형변환(암묵적, 강제)
		//int <==> char
		char ch = 'A';
		System.out.println((int)ch);
		
		for(int i=65;i<91;i++) {
			System.out.print((char)i + " ");
		}
		
		System.out.println();
		
		//int(기본형) <==> String(Object)
		String num3 = "100";
		int num4 = Integer.parseInt(num3);
		int result = num4 + 100;
		System.out.println(result);
		
		int num5 = 10;
		String num6 = String.valueOf(num5); //"10"
		String num7 = num5 + ""; //"10"
		
		String str = 7 + "7" + 7; //"777"
		
		boolean bool = false;
		
		//% => 나머지 연산자
		System.out.println((10%3));
		
		for(int i=1;i<=100;i++) {
			if(!((i%2==0)||(i%3==0))) {
				System.out.print(i+ " ");
			}
		}
		
		System.out.println();
		
		//복합대입 연산자
		int n = 0;
		//n = n + 1;
		//n += 1;
		n++; //증감자
		System.out.println(n);
		
		int x = 10;
		int y = 0;
		
		y = x++;
		//y = ++x;
		
		System.out.println("x : " + x); //11
		System.out.println("y : " + y); //10
		
		double d = 3.14 + 1;
		System.out.println(d);
		if(d==4.14) {
			System.out.println("맞다");
		}else {
			System.out.println("틀리다");
		}
		
		int b = 40;
		int c = 120;
		int max = (b>c)?b:c;
		System.out.println(max);
		
	}

}
