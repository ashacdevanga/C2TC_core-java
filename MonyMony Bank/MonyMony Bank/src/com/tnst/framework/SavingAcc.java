package com.tnst.framework;

public abstract class SavingAcc extends BanckAcc
{

protected static boolean isSalary;
private static final float MINBAL=0;


public SavingAcc(int accNo, String accNm, float accBal, boolean isSalary) {
	super(accNo, accNm, accBal);
	this.isSalary = isSalary;
}


public void withdraw(float accBal) 
{
System.out.println("your bal is: "+accBal);
}


@Override
public String toString() {
	return "SavingAcc [isSalary=" + isSalary + ", toString()=" + super.toString() + ", getClass()=" + getClass()
			+ ", hashCode()=" + hashCode() + "]";
}


}
