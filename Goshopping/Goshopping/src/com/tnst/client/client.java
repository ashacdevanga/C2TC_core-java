package com.tnst.client;

import com.tnst.application.*;
import com.tnst.framework.*;
public class client {
	public static void main(String[] args) {
	 
		GSShopFactory a= new GSShopFactory();
		a.getNewPrimeAccount(120, "suhas", 1000, true);
		a.getNewNormalAccount(111, "suhas1", 1000, 50);
		
	
		GSPrimeAcc b= new GSPrimeAcc();
		b.getClass();
		b.getAccNo();
		b.getAccNm();
		b.getCharge();
		b.bookProduct(1000);
		b.toString();
		
		GSNormalAcc c= new GSNormalAcc();
		c.getClass();
		c.getAccNo();
		c.getAccNm();
		c.getCharge();
		c.bookProduct(1000);
		c.toString();
	}

}
