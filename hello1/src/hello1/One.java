package hello1;

import java.util.Scanner;

public class One {
	static Scanner in = new Scanner(System.in);
	
//	��� helloJava
	public static void print() {
		System.out.println("hello,Java!");
	}
	public void add(float a,double b){
		System.out.println(a + b);
	}
//	���n�Ľ׳˺ʹη�
	public static void jiechen() {
		
		while(true)
		{
			System.out.println("������a��ֵ��");
			int a = in.nextInt();
			if(a <= 1||a >=10 ) 
			{
			System.out.println("������һ��ʮ֮�������");
			continue;
			}
			int c = 1;
			for(int i = 1; i <= a ;i++)
				c*=i;
			System.out.println("a�Ľ׳��ǣ�"+c);
			System.out.println("������n��ֵ��");
			int n = in.nextInt();
			System.out.println("a��n�η��ǣ�"+Math.pow(a, n));
			break;
		}
	}
//	float��double�ĺ�
	public static void sum() {
		float c = in.nextFloat();
		double d = in.nextDouble();
		System.out.printf("%.2f",c+d);
	}
//	���ؼ�����
	public static void BMIT() {
		System.out.println("������������(m)������(kg)��");
		double m = in.nextDouble();
		double n = in.nextDouble();
		double t = n/(m*m);
		if(t<18.5)
			System.out.println("ƫ��");
		if(t>=18.5&&t<=25)
			System.out.println("����");
		if(t>25&&t<40)
			System.out.println("ƫ��");
		if(t>=40)
			System.out.println("�ǳ���");
	}
//	����==��.equals()������
	public static void test1() {
		String s=new String("hello");
		String r=new String("hello");
		System.out.println(r == s);
		System.out.println(s.equals(r));
	}
//	����stringbuffer��stringbuilder������
	public static void test2() {
//		long sTime1 = System.currentTimeMillis();
		
		long sTime1 = System.nanoTime();
		StringBuilder s1 = new StringBuilder("java1");
		s1.append("hello").append("world");
		long eTime1 = System.nanoTime();
		long sTime2 = System.nanoTime();
		StringBuffer s2 = new StringBuffer("java2");
		s2.append("hello").append("world");
		long eTime2 = System.nanoTime();
		
//		System.out.println(sTime2);
//		System.out.println(eTime2);
//		System.out.println(sTime1);
//		System.out.println(eTime1);

		System.out.println("stringbuilder����ʱ�䣺"+(eTime1-sTime1));
		System.out.println("stringbuffer����ʱ�䣺"+(eTime2-sTime2));
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print();
//		jiechen();
//		sum();
//		BMIT();
//		test1();
		test2();
	}

}
