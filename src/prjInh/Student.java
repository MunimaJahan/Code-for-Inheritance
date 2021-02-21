package prjInh;

public class Student extends Person{
	private int id;
	private String department;
	
	public Student(String n,int age, int id, String dpt) {
		super(n,age);
		this.id=id;
		department=dpt;
		//name=n;
		//this.age=age;
		
	}
	public String getDept() {
		return department;
	}

}
