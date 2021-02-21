package prjShape;

public class Shape {
	protected String name;
	protected double area;
	
	public Shape(String name) {
		//System.out.println("Shape");
		this.name=name;
	}
	public final void setName(String s) {
		if(s=="" || s.length()>20) {
			System.out.println("Empty name");
		}
		else {
			name=s;
		}
	}
	public String getName() {
		return name;
	}
	public double getArea() {
		System.out.println("undefined shape");
		return area=0;
	}
}
