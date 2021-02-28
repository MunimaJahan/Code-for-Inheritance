package basicimplementation;

import java.util.Comparator;

import generictypes.BankAccount;

public class AccBalanceComparator implements Comparator<BankAccount>{

	@Override
	public int compare(BankAccount o1, BankAccount o2) {
		// TODO Auto-generated method stub
		return (int) (o1.getBalance()-o2.getBalance());
	}

}
