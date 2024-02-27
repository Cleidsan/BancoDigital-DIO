package bank.account;

import bank.client.Account;
import bank.client.Client;

public class CurrentAccount extends Account{
	public CurrentAccount(Client client) {
		super(client);
	}
	
	public void printExtract() {
		System.out.println("=== Print Current Account ===");
		super.printExtract();
	}
}
