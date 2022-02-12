package com.tns.client;

import com.tns.application.GSNormalAcc;
import com.tns.application.GSPrimeAcc;
import com.tns.application.GSShopFactory;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	GSShopFactory gssfactory=new  GSShopFactory();
	gssfactory.getNewPrimeAccount(123,"Asha",1000,true);
	gssfactory.getNewNormalAccount(111,"Arun",1000,50);

	 GSPrimeAcc gsprime=new GSPrimeAcc(0, null, 0, false);
	 gsprime.getAccNm();
	 gsprime.getAccNm();
	 gsprime.getCharges();
	 gsprime.bookProduct(1000);
	 gsprime.toString();
	 
	 GSNormalAcc gsnprime=new GSNormalAcc(0, null, 0, 0);
	 gsnprime.getAccNm();
	 gsnprime.getAccNm();
	 gsprime.getCharges();
	 gsnprime.getDeliveryCharges();
	 gsnprime.bookProduct(1000);
	 gsnprime.toString();
	 
	}

}
