class TangleException extends Exception{
	private Tangle t;
	TangleException(Tangle t1){
		this.t = t1;
	}
	public String excepMessage() {
		String str = "not a Tangle";
		return str;
	}
}
class Tangle{
	double side1,side2,side3;
	Tangle(double s1,double s2,double s3) throws TangleException{
		if(s1+s2<+s3||s1+s3<=s2||s2+s3<=s1) {
			throw new TangleException(this);
		}
//		else {
		this.side1=s1;
		this.side2=s2;
		this.side3=s3;
//		}
}
	
	double getC(Tangle t) {
		return side1 + side2 +side3;
		
	}
}
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Tangle t = new Tangle(3,4,5);
//			Tangle t1 = new Tangle(1,2,6);
			System.out.println(t.getC(t));
		} catch (TangleException e) {
			// TODO Auto-generated catch block
			System.err.println(e.excepMessage());
		}
	}
}
