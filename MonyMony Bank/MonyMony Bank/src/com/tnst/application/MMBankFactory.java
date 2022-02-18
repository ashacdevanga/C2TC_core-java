package com.tnst.application;

import com.tnst.framework.BankFactory;
import com.tnst.framework.CurrentAcc;
import com.tnst.framework.SavingAcc;

public class MMBankFactory implements BankFactory
{
	public MMSavingAcc getNewSavingAccount(int AccNo,String accNm,float accBal,boolean isSalaried)
	{
		MMSavingAcc a= new MMSavingAcc();
		return a;
	}
	public MMCurrentAcc getNewCurrentAccount(int AccNo,String accNm,float accBal,float creditLimit) {
		MMCurrentAcc b= new MMCurrentAcc();
		return b;
	}

	}
