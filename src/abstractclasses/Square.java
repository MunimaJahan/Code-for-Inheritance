package abstractclasses;

public class Square extends Rectangle implements Figure{
	
	public Square(String name, double length) {
		super(name,length,length);
		//System.out.println("Square");
	}
	public void showFigure() {
		//PI=5;
		System.out.print("This is a Triangle");
		System.out.print("PI= "+PI);
	}

}
