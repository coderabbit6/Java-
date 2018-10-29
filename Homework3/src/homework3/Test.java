package homework3;

import java.util.Comparator;

public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GeometricObject geo[] = {new Circle(1),new Circle(2),
				new Circle(5),new Circle(4),new Circle(8),
				new Rectangle(1,4),new Triangle(3, 4, 5)};	//�����������
		java.util.Arrays.sort(geo,new AreaComparator());		//����Ƚ���
		System.out.println("The descending order of the area :");
		for(int i =0;i<geo.length;i++) {
						
			System.out.println(geo[i]);
			
		}
		Circle r1 = new Circle(4);
		Circle r2 = new Circle(5);
		r1.compareTo(r2);	

	}
}
	interface Comparable{		//����ӿ���
		
			int compareTo(Object o);
			
			//������0������
	}
	abstract class GeometricObject{
		
		public abstract String toString();	//��дtoSting
		public abstract double getArea();	//����������󷽷�
		public abstract double getPerimerter();		//�����ܳ����󷽷�
		
	}

	class AreaComparator implements Comparator<GeometricObject>{	//�̳нӿ���
		@Override
		public int compare(GeometricObject o1, GeometricObject o2) {	//��дcompare����
			if(o1.equals(o2)) {
				return 0;
			}
			else if(o1.getArea()<o2.getArea()) {
				return 1;
			}
			else
			return -1;
		}
	}
	//����������
	class Circle extends GeometricObject implements Comparable{
		private double radius;
		public int compareTo(Object o) {
			double r1 = this.radius;
			double r2 = ((Circle)o).radius;
//			System.out.println("what");
			if(r1 == r2) {
				System.out.println("ͼ����ͬ");
				return 1;
			}
			else
				System.out.println("ͼ�β���ͬ");
				return 0;
			}
		public Circle(double r) {
			this.radius = r;
		}

		//����ʵ�ֳ��󷽷�
		@Override
		public double getArea() {
			return Math.PI*radius*radius;
		}

		@Override
		public double getPerimerter() {
			return 2*Math.PI*radius;
		}

		@Override
		public String toString() {
			return "this is a circle,it's radius is :" + radius;
		}
	}

	class Rectangle extends GeometricObject{
		private double length;
		private double width;
		public Rectangle(double l,double w) {
			this.length = l;
			this.width = w;
		}
		@Override
		public String toString() {
			return "this is a Rectangle,it's length is:" + length + " width is:"+ width;
		}

		@Override
		public double getArea() {
			return length*width;
		}

		@Override
		public double getPerimerter() {
			return 2*(length+width);
		}
	}

	class Triangle extends GeometricObject{
		private double side1,side2,side3;
		public Triangle(double s1,double s2,double s3) {
			this.side1 = s1;
			this.side2 = s2;
			this.side3 = s3;
		}
		@Override
		public String toString() {
			return "this is a triangle,it's sides are :" + side1 + " ," + side2 + " ," + side3;
		}

		@Override
		public double getArea() {
			double p = (side1 + side2+ side3)*0.5;
			return Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
		}

		@Override
		public double getPerimerter() {
			return side1 + side2 + side3;
		}

}