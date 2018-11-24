package test1;

import java.util.Vector;

public class UserManager {
	private Vector<User> users= new Vector<User>();
//	Vector<User> users;
	public boolean addUser(User u) {
		return users.add(u);
	}
	public void deleteUser(User a) {
		users.remove(a);
	}
	public String indexOf(User a) {
		return a.getName();
	}
	public boolean isExist(String n) {
		for(User u:users) {
			if(u.getName().equals(n)) {
				return true;
			}
		}
		return false;
	}
	public void display() {
		for(User i:users) {
			System.out.println(i);
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserManager users = new UserManager();
		users.addUser(new User("xiaoming","beijing"));
		users.addUser(new User("xiaohong","nanjing"));
		users.addUser(new User("xiaofang","dongjing"));
		users.addUser(new User("tangseng","xijing"));
		System.out.println(users.isExist("xiaoming"));
		System.out.println(users.isExist("xiaofang"));
		System.out.println(users.isExist("xia"));
		users.display();
		
		
	}

}
