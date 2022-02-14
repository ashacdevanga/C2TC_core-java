package com.tns.client;
import com.tns.framwwork.BankFactory;
import com.tns.Application.MMBankFactory;
import com.tns.Application.MMCurrentAcc;
import com.tns.Application.MMSavingAcc;
import com.tns.framwwork.BankFactory;
import com.tns.framwwork.SavingAcc;
import com.tns.framwwork.CurrentAcc;
public class TNSClient {

	public static void main(String[] args) {
		MMBankFactory mmbankf=new MMBankFactory();
		mmbankf.getNewSavingAccount(112, "Nishi",1000, true);
		mmbankf.getNewCurrentAccount(111, "Ashi" , 1000,true);
		
		MMSavingAcc mmsa=new MMSavingAcc(0, null, 0, false);
		mmsa.getAccNo();
		mmsa.getaccNm();
		mmsa.deposite(1000);
		mmsa.toString();
		
		
		
		MMCurrentAcc mmca=new MMCurrentAcc (0, null, 0, 0);
		mmca.getAccNo();
		mmca.getAccNm();
		mmca.getaccBal();
		mmca.getcreditLimit();
		mmca.deposite(1000);
		mmca.toString();
	}

}

