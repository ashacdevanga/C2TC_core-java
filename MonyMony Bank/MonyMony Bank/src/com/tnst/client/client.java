package com.tnst.client;
import com.tnst.application.MMBankFactory;
import com.tnst.application.MMCurrentAcc;
import com.tnst.application.MMSavingAcc;
public class client {

	public static void main(String[] args)
	{
		MMBankFactory a= new MMBankFactory();
		a.getNewSavingAccount(111, "ASHA1", 4000, true);
		a.getNewCurrentAccount(222, "ASHA2", 8000, 50000);
		
		
		MMSavingAcc b=new MMSavingAcc();
		b.getClass();
		b.getAccNo();
		b.getAccNm();
		b.getAccBal();
		b.withdraw(4000);
		b.toString();
		
		
		MMCurrentAcc c=new MMCurrentAcc();
		c.getClass();
		c.getAccNo();
		c.getAccNm();
		c.getAccBal();
		c.withdraw(50000);
		c.toString();
		
		
	}

}
