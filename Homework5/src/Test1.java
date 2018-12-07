import org.omg.CORBA.UserException;

class User{
	int id;
	String name;
	User(int i,String s) throws UserExpection{
		if(s.isEmpty()) {
			throw new UserExpection(this);
		}
		this.id = i;
		this.name = s;
	}
	public String toString() {
		return this.name;
	}
}
class Generic<T>{
	private T f;
	public void setF(T f) {
		this.f = f;
	}
	public T getF() {
		return f;
	}
}
class UserExpection extends Exception{
	private User u;
	public UserExpection(User u1) {
		this.u = u1;
	}
	public String excepMessage() {
		String str = "name can't be Empty";
		System.err.println(str);
		return str;
	}
}
public class Test1 {
	public static void main(String[] args) throws UserExpection{
		try {
		Generic<User> user1 = new Generic<User>();
		user1.setF(new User(1,""));
		System.out.println(user1.getF());
		}catch(UserExpection e)
		{
			System.out.println(e.excepMessage());
		}
		}
}
