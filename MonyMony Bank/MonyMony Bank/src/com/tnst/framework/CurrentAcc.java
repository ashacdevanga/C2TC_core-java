package com.tnst.framework;

public abstract class CurrentAcc extends BanckAcc
{
protected static float creditLimit ;


public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
	super(accNo, accNm, accBal);
	CurrentAcc.creditLimit = creditLimit;
}

public void withdraw(float creditLimit) 
{
	System.out.println("your credit limit is: "+creditLimit+" acc bal is: "+accBal);
}

@Override
public String toString() {
	return "CurrentAcc [creditLimit=" + creditLimit + ", toString()=" + super.toString() + ", getClass()=" + getClass()
			+ ", hashCode()=" + hashCode() + "]";
}


}
