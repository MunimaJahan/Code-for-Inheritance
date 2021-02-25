package generictypes;
import java.util.ArrayList;
import java.util.Collections;

public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<BankAccount> accounts=new ArrayList<>();
		accounts.add(new BankAccount("n1", 100));
		accounts.add(new BankAccount("n2", 200));
		accounts.add(new BankAccount("n3", 100));
		BankAccount btest=new BankAccount("n1", 100);
		//btest=accounts.get(0);
		Collections.sort(accounts);
		//Collections.sort(accounts);
		//System.out.println(average(accounts));
		for (BankAccount b: accounts) {
			System.out.println(b.getBalance());
			
		}

	}
	public static double average(ArrayList<BankAccount> objects)
	{
		if (objects.size() == 0) { return 0; }
		double sum = 0;
		for (BankAccount obj : objects)
		{
			sum = sum + obj.getBalance();
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
