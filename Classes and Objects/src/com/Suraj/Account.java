package com.Suraj;

import java.util.Date;

public class Account {
	
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	
	public Account (int id, double balance, double annualInterestRate)
	{
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
		
		dateCreated = new Date();
	}

	public boolean withdraw (double amount)
	{
		if (balance <= amount)
			return false;
		balance = balance - amount;
		return true;
	}
	
	public void deposit (double amount)
	{
		balance = balance + amount;
	}
	
	public int getid()
	{
		return id;
	}
	public void setid(int id)
	{
		this.id = id;
	}
	
	public double getbalance()
	{
		return balance;
	}
	public void setbalance(double balance)
	{
		this.balance = balance;
	}
	
	public double getannualInterestRate()
	{
		return annualInterestRate;
	}
	public void setannualInterestRate(double annualInterestRate)
	{
		this.annualInterestRate = annualInterestRate;
	}
	
	public Date getdateCreated()
	{
		return dateCreated;
	}
	
}
