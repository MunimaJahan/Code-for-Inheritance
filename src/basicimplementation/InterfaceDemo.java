package basicimplementation;
import java.util.ArrayList;
import java.util.Collections;

public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<BankAccount> accounts=new ArrayList<BankAccount>();
		accounts.add(new BankAccount("d", 100));
		accounts.add(new BankAccount("a", 200));
		accounts.add(new BankAccount("c", 100));
		BankAccount btest=new BankAccount("n1", 100);
		//btest=accounts.get(0);
		AccBalanceComparator cmp=new AccBalanceComparator();
		Collections.sort(accounts);
		//Collections.sort(accounts, cmp);
		System.out.println(average(accounts));
		for (BankAccount b: accounts) {
			System.out.println(b.getName());
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
	
	
	/*public static double average(ArrayList<Country> objects)
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
