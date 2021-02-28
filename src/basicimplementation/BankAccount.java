package basicimplementation;


public class BankAccount implements Comparable<BankAccount>{
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
	@Override
	public int compareTo(BankAccount o) {
		// TODO Auto-generated method stub
		int dif=(int)(this.balance-o.getBalance());
		if (dif==0) {
			return name.compareTo(o.getName());
		}
		return dif;
	}

}
