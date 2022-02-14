package com.tns.framwwork;

public  class SavingAcc  extends BankAcc{
 boolean isSalary;
 protected static   float MINBAL=50;


public SavingAcc(int accNo, String accNm, float accBal, boolean isSalary) {
	super(accNo, accNm, accBal);
	this.isSalary = isSalary;
}
 public void withdraw(float accBal)
 {
		System.out.println("Dear prime user ,your product charges are:" +accBal);

 }
@Override
public String toString() {
	return "SavingAcc [isSalary=" + isSalary + ", toString()=" + super.toString() + ", getClass()=" + getClass()
			+ ", hashCode()=" + hashCode() + "]";
}
}