package test2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.HashMap;

public class Geo {
	abstract static class GeometricObject{
		public abstract String toString();	//重写toSting
		public abstract double getArea();	//计算面积抽象方法
		public abstract double getPerimerter();		//计算周长抽象方法
	}

	//具体派生类
	public static class Circle extends GeometricObject{
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

	public static class Rectangle extends GeometricObject{
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

	public static class Triangle extends GeometricObject{
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
	public static class Geohash implements Serializable{
		HashMap<String,GeometricObject> geo = new HashMap<String,GeometricObject>();
		public void addGeo(String s,GeometricObject o) {
			geo.put(s, o);
			System.out.println(s + " is adding");
		}
		public void rmGeo(String s) {
			geo.remove(s);
			System.out.println(s + " is del");
		}
		public int get_size() {
			return geo.size();
		}
		public String toString() {
			return geo.keySet()+ "?";
		}
	}
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Geohash geo = new Geohash();
		geo.addGeo("Circle1", new Circle(3));
		geo.addGeo("Circle2", new Circle(2));
		geo.addGeo("Rectangle1", new Rectangle(2,3));
		geo.addGeo("Rectangle2", new Rectangle(4,5));
		geo.addGeo("Triangle1", new Triangle(3,4,5));
		geo.addGeo("Triangle2", new Triangle(5,12,13));
		System.out.println(geo.get_size());
		geo.rmGeo("Triangle1");
		geo.rmGeo("Circle1");
		System.out.println(geo.get_size());
        OutputStream op = new FileOutputStream("./a.txt");
        ObjectOutputStream ops = new ObjectOutputStream(op);
        ops.writeObject(geo);
        ops.close();
        InputStream in = new FileInputStream("a.txt");
        ObjectInputStream os = new ObjectInputStream(in);
        Geohash g = (Geohash)os.readObject();
        System.out.println(g);
	}
	}
