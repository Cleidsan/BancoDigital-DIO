import java.util.Locale;
import java.util.Scanner;

import bank.account.CurrentAccount;
import bank.account.SavingsAccount;
import bank.client.Account;
import bank.client.Client;

public class CashMachineATM {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in).useLocale(Locale.US);

		System.out.println("Type your name");
		String name = tec.next();
		System.out.println("Type how much want deposit");
		double blc = tec.nextDouble();
		Client client = new Client();
		client.setNome(name);

		Account ca = new CurrentAccount(client);
		Account sa = new SavingsAccount(client);

		ca.deposit(blc);
		ca.printExtract();
		sa.printExtract();

		System.out.println("Do you want to make a transfer? " + "[S/N]");
		String option = tec.next().toLowerCase();
		if (option.equals("s")) {
			System.out.println("How much do you want to transfer?");
			double transferEnter = tec.nextDouble();
			ca.transfer(transferEnter, sa);

			ca.printExtract();
			sa.printExtract();
		}

		System.out.println("Do you want to withdraw? " + "[S/N]");
		String optionWD = tec.next();
		if (optionWD.equals("s")) {
			System.out.println("Do you want to withdraw? " + "\n1 - Current Account " + "\n2 - Savings Account");
			int optionAc = tec.nextInt();
			System.out.println("How much do you want to withdraw?");
			double valueWD = tec.nextDouble();
			if (optionAc == 1) {
				ca.withdrawal(valueWD);
				ca.printExtract();
			} else {
				sa.withdrawal(valueWD);
				sa.printExtract();
			}
		}

	}

}
