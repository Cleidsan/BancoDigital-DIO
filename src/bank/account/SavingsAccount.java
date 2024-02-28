package bank.account;

import bank.Bank;
import bank.client.Account;
import bank.client.Client;

public class SavingsAccount extends Account{

	public SavingsAccount(Client client, Bank bank) {
		super(client,bank);
	}

	public void printExtract() {
		System.out.println("=== Print Savings Account ===");
		super.printExtract();
	}
}
