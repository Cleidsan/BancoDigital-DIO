package bank.client;

import bank.Movement;

public class Account implements Movement{

	private static final int  AGENCY_STANDARD = 1;
	private static  int SEQUENTIAL = 1;
	
	private int agency;
	private int number;
	private double balance;
	protected Client client;
	
	public Account(Client client) {
		this.agency = Account.AGENCY_STANDARD;
		this.number = SEQUENTIAL++;
		this.client = client;
		
	}
	public double getBalance() {
		return balance;
	}

	public int getAgency() {
		return agency;
	}

	public int getNumber() {
		return number;
	}
	

	@Override // Method to deposit the money
	public void deposit(double value) {
		this.balance += value;
	}

	@Override // Method to withdrawal the money
	public void withdrawal(double value) {
		this.balance -= value;
	}

	@Override // Method to transfer the money
	public void transfer(double value, Account accountDestiny) {
		this.withdrawal(value);
		accountDestiny.deposit(value);
	}

	@Override // Method to print the extract
	public void printExtract() {
		System.out.println(String.format("Titular: %s", this.client.getNome()));
		System.out.println(String.format("Agency: %d", this.agency));
		System.out.println(String.format("Number: %d", this.number));
		System.out.println(String.format("Balance: %.2f", this.balance));
	}


}
