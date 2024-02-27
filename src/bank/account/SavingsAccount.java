package bank.account;

import bank.client.Account;
import bank.client.Client;

public class SavingsAccount extends Account{

	public SavingsAccount(Client client) {
		super(client);
	}

	public void printExtract() {
		System.out.println("=== Print Savings Account ===");
		super.printExtract();
	}
}
