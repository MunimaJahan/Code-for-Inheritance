package prjInh;



import javax.swing.JOptionPane;

public class DemoInh {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p=new Person("Munima",20);
		Student s=new Student("jahan",22,1,"COMP");
		Student s2=new Student("Test",21,2,"COMP");
		Instructor i=new Instructor("Test2",22,101,3000);
		
		String n=JOptionPane.showInputDialog("Input the name");
		String a=JOptionPane.showInputDialog("Give the age value");
		int b=Integer.parseInt(a);
		FulltimeStudent fs=new FulltimeStudent(n,b,3,"COMP",3);
		
		System.out.println(p.getName());
		
		System.out.println(s.getName());
		System.out.println(s2.getName());
		System.out.println(i.getName());
		System.out.println(s.getDept());
		String name=fs.getName();
		
		System.out.println(name);
		if (name=="") { 
			JOptionPane.showMessageDialog(null, "No name given");
			
		}		
		else {
			JOptionPane.showMessageDialog(null, "The name of the student is "+fs.getName()); 
	}
		
}	

}
