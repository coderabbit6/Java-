
public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//LambdaTest
		MyNumber num;
//		num = ()->343.4;
		MyNumber num2 = n->{
			int results = 1;
			for(int i = 1;i<=n;i++) {
				results *=i; 
			}
			return results;
		};
		System.out.println("the results is " + num2.fun(4));
//		System.out.println(num.getValue());
	}
}
interface MyNumber{
//	double getValue();
	int fun(int n);
}