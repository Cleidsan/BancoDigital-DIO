package bank.account;

import bank.Bank;
import bank.client.Account;
import bank.client.Client;

public class CurrentAccount extends Account {
	public CurrentAccount(Client client, Bank bank) {
		super(client, bank);
	}

	public void printExtract() {
		System.out.println("=== Print Current Account ===");
		super.printExtract();
	}
}
