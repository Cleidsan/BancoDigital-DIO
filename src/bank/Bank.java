package bank;

import java.util.List;

import bank.client.Account;

public class Bank {
	public String nome;
	public List<Account> accounts;
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
