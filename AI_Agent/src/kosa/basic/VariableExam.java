package kosa.basic;

public class VariableExam {

	public static void main(String[] args) {
		//������ �����͸� ��� �׸�, ������ ���� �پ� ex)ȫ�浿, 100, 3.14, true
		//�⺻�� ������Ÿ��(primitive type)
		//byte,short,int,long => ������
		//float, double => �Ǽ���
		//char => ������ (����1��)
		//boolean => ����
		//String => ���ڿ� => ObjectType
		
		int num; //���� ���� => �޸� �Ҵ�
		int arr[]; //�迭 ���� : ObjectType
		
		num = 100;
		
		int num2 = 10; //�޼��� �ȿ� ����� ���� ���ú���(��������) => �ݵ�� �ʱ�ȭ �� ���
		System.out.println(num2);
		
		int num3 = 200; //���� ����, �ʱ�ȭ
		System.out.println("���� : " + num3);
		
		//���� ���� �� ���ǻ���
		//������ : Ư������ x, ���ڷ� ���� x, ����� x, �ҹ���
		//�⺻ ���ͷ� : "":String, true:boolean, 10:int, 3.14:double
		
		float num4 = 3.14f;
		
		//casting(����ȯ) : ����
		//byte < short < int < long < float < double < String
		//int <==> char
		double b = 3.14;
		int c = (int) b; //���� ����ȯ
		System.out.println(c); //������ �ս� �߻�
		
		double e = c; //�Ϲ��� ����ȯ
		System.out.println(e);
		
		long num5 = 100L;
		
		int num6 = 010;
		System.out.println(num6);
	}

}
