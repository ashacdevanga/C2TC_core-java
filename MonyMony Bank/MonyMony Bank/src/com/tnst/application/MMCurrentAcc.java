package com.tnst.application;

import com.tnst.framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc
{
	

	public MMCurrentAcc() {
		super(accNo, accNm, accBal, creditLimit);
		// TODO Auto-generated constructor stub
	}

	public void withdraw(float creditLimit) 
	{
		System.out.println("your credit limit is: "+creditLimit+" your acc bal is: "+accBal);
	}

	@Override
	public String toString() {
		return "MMCurrentAcc [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
}
