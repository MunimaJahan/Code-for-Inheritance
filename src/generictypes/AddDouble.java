package generictypes;

public class AddDouble implements addTwoVar <BankAccount> {
	
	

	@Override
	public BankAccount getVal(BankAccount t1, BankAccount t2) {
		// TODO Auto-generated method stub
		t1.setBalance(t1.getBalance()+t2.getBalance());
		return t1;
	}

}
