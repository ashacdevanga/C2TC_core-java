package com.tns.Application;
import com.tns.framwwork.BankFactory;
public class MMBankFactory {
	
	public MMSavingAcc getNewSavingAccount(int accNo, String accNm, float accBal, boolean isSalary) {
		MMSavingAcc mmsa=new MMSavingAcc(accNo, accNm, accBal, isSalary);
		return mmsa;
	}
		
	
	public MMCurrentAcc getNewCurrentAccount(int accNo, String accNm, float accBal, boolean b) {
		MMCurrentAcc mmca=new MMCurrentAcc (0, null, 0, 0);
		return mmca;
	}
	
}