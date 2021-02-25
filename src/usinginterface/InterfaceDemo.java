package usinginterface;
import java.util.ArrayList;

public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList<BankAccount> accounts=new ArrayList<BankAccount>();
		ArrayList<Measurable> accounts=new ArrayList<Measurable>();
		accounts.add(new BankAccount("n1", 100));
		accounts.add(new BankAccount("n2", 200));
		accounts.add(new BankAccount("n3", 100));
		BankAccount btest=new BankAccount("n1", 100);
		
		ArrayList<Measurable> countries=new ArrayList<Measurable>();
		countries.add(new Country("C1",100));
		countries.add(new Country("C2",300));
		countries.add(new Country("C3",100));
		//btest=(BankAccount)accounts.get(2);
		
		//System.out.println("Average balance: "+average(accounts));
		//System.out.println("Average area: "+average(countries));
		
		for (Measurable b: accounts) {
			if (b.equals(btest)){ 
				System.out.println("Accounts are equal");
			}
			
		}

	}
	public static double average(ArrayList<Measurable> objects)
	{
		if (objects.size() == 0) { return 0; }
		double sum = 0;
		for (Measurable obj : objects)
		{
			sum = sum + obj.getMeasure();
		}
		return sum / objects.size();
	}

	
	/*
	public static double average(ArrayList<Country> objects)
	{
		if (objects.size() == 0) { return 0; }
	
		double sum = 0;
	
		for (Country obj : objects)
		{
	
		sum = sum + obj.getArea();
		}
		return sum / objects.size();

	}*/
	
}
