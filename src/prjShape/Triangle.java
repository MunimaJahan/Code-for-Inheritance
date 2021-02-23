package prjShape;

public class Triangle extends Shape {
	double base;
	double height;
	public Triangle(double b, double h, String n) {
		super(n);
		base=b;
		height=h;
		//name=n;
		
	}
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 0.5*base*height;
	}

}
