package test1;
public class User {
	private String name;
	private String department;
	User(String n,String d){
		this.name = n;
		this.department = d;
	}
	
	public String getName(){
		return this.name;
	}
	public String getDepart() {
		return this.department;
	}
	public void setName(String n) {
		this.name = n;
	}
	public void setDepart(String d) {
		this.department = d;
	}
	public String toString() {
		return "User'name is" + this.name + "User'department is " + this.department;
	}
	public boolean equals(Object o) {
		if(o instanceof User) {
			User r = (User)o;
			if(this.name.equals(r.name)) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User a[] = {new User("xiaoming","shanghai"),new User("xiaohong","beijing"),
				new User("dabai","tianjin")};
		for(User i:a) {
			i.setDepart("shengyang");
		}
		System.out.println(a[0].getName());
		 System.out.println(a[1].getDepart());
		 System.out.println(a[0].equals(a[1]));
	}
	 

}
