package basicimplementation;

public class Country {
	private String name;
	private double area;
	
	public Country(String n, double b) {
		name=n;
		area=b;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}

}
