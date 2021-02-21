package prjInh;

public class Instructor extends Person{
	int employeeid;
	double salary;
	
	public Instructor(String n,int a, int eid,double s) {
		super(n,a);
		employeeid=eid;
		salary=s;
		
	}

}
