package abstractclasses;

public class Rectangle implements Shape{
	private double length;
	private double width;
	private String name;
	
	public Rectangle(String name, double l,double w) {
		//super(name);
		length=l;
		width=w;
		this.name=name;
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
		double area=length*width;
		return area;
	}
	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name=name;
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	/*public void showFigure() {
		//PI=5;
		System.out.print("This is a Triangle");
		System.out.print("PI= "+PI);
	}*/
}
