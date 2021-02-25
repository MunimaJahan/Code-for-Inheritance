package generictypes;

public class BankAccount implements Comparable<BankAccount>,Measurable<BankAccount>{
	private double balance;
	private String name;
	private double interest;
	
	public BankAccount(String n, double b) {
		name=n;
		balance=b;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	/*
	public boolean equals(Object o) {
	    if (o != null) {
	      if (o instanceof BankAccount) {
	    	  BankAccount other = (BankAccount) o;
	        if (this.getName() == other.getName() &&
	          this.getBalance() == other.getBalance()) {
	            return true;
	          }
	      }
	    }
	    return false;
	  }*/
	@Override
	public int compareTo(BankAccount other) {
		// TODO Auto-generated method stub
		BankAccount o=(BankAccount)other;
		return Double.compare(balance,o.getBalance());
	}
	public double getInterest() {
		return interest;
	}
	public void setInterest(double interest) {
		this.interest = interest;
	}
	@Override
	public double getMeasure(BankAccount t) {
		// TODO Auto-generated method stub
		return t.getBalance()+t.getInterest();
	}

}
