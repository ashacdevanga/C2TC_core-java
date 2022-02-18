package com.tnst.application;

import com.tnst.framework.SavingAcc;

public class MMSavingAcc extends SavingAcc
{
	public MMSavingAcc() {
		super(accNo, accNm, accBal, isSalary);
		// TODO Auto-generated constructor stub
	}

	private static final float MINBAL=0;
	
	public void withdraw(float accBal) 
	{
		System.out.println("your acc bal is: "+accBal+"min bal is: "+MINBAL);
	}

	@Override
	public String toString() {
		return "MMSavingAcc [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}

	
	}


