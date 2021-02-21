package prjShape;

public class Rectangle extends Shape{
	private double length;
	private double width;
	
	public Rectangle(String name, double l,double w) {
		super(name);
		length=l;
		width=w;
		//System.out.println("Rectangle");
	}
	public void setLength(double length) {
		this.length=length;
		
	}
	public double getLength() {
		return length;
	}
	public void setWidth(double w) {
		this.width=w;
		
	}
	public double getWidth() {
		return width;
	}
	//method overriding
	public double getArea() {
		area=length*width;
		return area;
	}
}
