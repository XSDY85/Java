package com.Suraj;

public class MainAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account testAccount = new Account(1122, 21000, 4.5);
		
		if(testAccount.withdraw(25000))
			System.out.println(" Withdraw successful");
		else
			System.out.println(" withdraw unsuccessful");
		
		testAccount.deposit(3000);
		
		System.out.println(testAccount.getid()+ " "+ testAccount.getbalance()
								+ " "+ testAccount.getannualInterestRate()
								+ " "+ testAccount.getdateCreated());
		
				
	}

}
