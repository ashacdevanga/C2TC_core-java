
package com.tns.framwwork;

public class CurrentAcc extends BankAcc {

	protected static float creditLimit;


public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
	super(accNo, accNm, accBal);
	CurrentAcc.creditLimit = creditLimit;
}
public void withdraw(float accBal) {
	 System.out.println("The Dear normal user your charges are:"+accBal+" with delivery charges is:" +creditLimit);
	 
	
}
@Override
public String toString() {
	return "CurrentAcc [creditLimit=" + creditLimit + ", toString()=" + super.toString() + ", getClass()=" + getClass()
			+ ", hashCode()=" + hashCode() + "]";
}
}
