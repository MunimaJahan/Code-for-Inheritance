package basicimplementation;


public class BankAccount {
	private double balance;
	private String name;
	
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

}
