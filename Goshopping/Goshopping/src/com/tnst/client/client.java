package com.tnst.client;

import com.tnst.application.*;
import com.tnst.framework.*;
public class client {
	public static void main(String[] args) {
	 
		GSShopFactory a= new GSShopFactory();
		a.getNewPrimeAccount(120, "ASHA", 1000, true);
		a.getNewNormalAccount(111, "ASHA1", 1000, 50);
		
	
		GSPrimeAcc gps= new GSPrimeAcc();
		gps.getClass();
		gps.getAccNo();
		gps.getAccNm();
		gps.getCharge();
		gps.bookProduct(1000);
		gps.toString();
		
		GSNormalAcc c= new GSNormalAcc();
		c.getClass();
		c.getAccNo();
		c.getAccNm();
		c.getCharge();
		c.bookProduct(1000);
		c.toString();
	}

}
