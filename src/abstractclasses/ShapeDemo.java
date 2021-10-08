package abstractclasses;

import java.util.ArrayList;

public class ShapeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Testing github
		ArrayList<Shape> shapelist=new ArrayList<>();
		//ArrayList<Square> sqlist=new ArrayList<Square>();
		Shape s;
		//s=new Shape("undefined");
		String st="";
		Rectangle r1=new Rectangle("rectangle",7,5);
		Rectangle r2=new Rectangle("rectangle",8,5);
		Square sq1=new Square("square",5);
		Square sq2=new Square("square",6);
		Square sq3=new Square("square",7);
		sq3.showFigure();
		
		shapelist.add(r2);
		shapelist.add(sq1);
		//r=s;
		
		//Late binding or dynamic binding 
		//s=r;
		//s=sq;
		//shapelist.add(s);
		/*shapelist.add(r1);
		shapelist.add(r2);
		shapelist.add(sq1);
		shapelist.add(sq2);
		shapelist.add(sq3);
		*/
		for(Shape i:shapelist) {
			
			System.out.println("The area of "+i.getName()+" is "+i.getArea());
				
		}
		//System.out.println("The area of "+s.getName()+" is "+s.getArea());
		//System.out.println("The area of "+r.getName()+" is "+r.getArea());
	//	System.out.println("The area of "+sq.getName()+" is "+sq.getArea());
	
		
	}

}
