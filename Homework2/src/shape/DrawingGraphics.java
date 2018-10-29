package shape;

public class DrawingGraphics{
		//测试主函数
		public static void main(String[] args) {
			//分别创建圆，矩形，三角形对象
			GeometricObject c = new Circle(10);
			GeometricObject t = new Triangle(3, 4, 5);
			GeometricObject r = new Rectangle(5, 6);
			
			//分别测试各个方法：toString(),面积，周长计算
			System.out.println(c);
			System.out.println("the area of the circle is:"+c.getArea());
			System.out.println("the perimerter of the circle is:"+c.getPerimerter()+"\n");
			
			System.out.println(t);
			System.out.println("the area of the triangle:"+t.getArea());
			System.out.println("the perimerter of the triangle is:"+t.getPerimerter()+"\n");
			
			System.out.println(r);
			System.out.println("the area of the triangle:"+r.getArea());
			System.out.println("the perimerter of the circle is:"+r.getPerimerter());
	}
}

//抽象类
abstract class GeometricObject{
	public abstract String toString();	//重写toSting
	public abstract double getArea();	//计算面积抽象方法
	public abstract double getPerimerter();		//计算周长抽象方法
}

//具体派生类
class Circle extends GeometricObject{
	private double radius;
	public Circle(double r) {
		this.radius = r;
	}

	//具体实现抽象方法
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