package hello1;

import java.util.Scanner;

public class One {
	static Scanner in = new Scanner(System.in);
	
//	输出 helloJava
	public static void print() {
		System.out.println("hello,Java!");
	}
	public void add(float a,double b){
		System.out.println(a + b);
	}
//	输出n的阶乘和次方
	public static void jiechen() {
		
		while(true)
		{
			System.out.println("请输入a的值：");
			int a = in.nextInt();
			if(a <= 1||a >=10 ) 
			{
			System.out.println("请输入一到十之间的整数");
			continue;
			}
			int c = 1;
			for(int i = 1; i <= a ;i++)
				c*=i;
			System.out.println("a的阶乘是："+c);
			System.out.println("请输入n的值：");
			int n = in.nextInt();
			System.out.println("a的n次方是："+Math.pow(a, n));
			break;
		}
	}
//	float和double的和
	public static void sum() {
		float c = in.nextFloat();
		double d = in.nextDouble();
		System.out.printf("%.2f",c+d);
	}
//	体重计算器
	public static void BMIT() {
		System.out.println("请输入你的身高(m)，体重(kg)：");
		double m = in.nextDouble();
		double n = in.nextDouble();
		double t = n/(m*m);
		if(t<18.5)
			System.out.println("偏瘦");
		if(t>=18.5&&t<=25)
			System.out.println("正常");
		if(t>25&&t<40)
			System.out.println("偏胖");
		if(t>=40)
			System.out.println("非常胖");
	}
//	测试==和.equals()的区别
	public static void test1() {
		String s=new String("hello");
		String r=new String("hello");
		System.out.println(r == s);
		System.out.println(s.equals(r));
	}
//	测试stringbuffer和stringbuilder的区别
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

		System.out.println("stringbuilder运行时间："+(eTime1-sTime1));
		System.out.println("stringbuffer运行时间："+(eTime2-sTime2));
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
