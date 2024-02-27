package bank;

import bank.client.Account;

public interface Movement {
	public void deposit(double value);
	public void withdrawal(double value);
	public void transfer(double value, Account accountDestiny);
	public void printExtract();
}
