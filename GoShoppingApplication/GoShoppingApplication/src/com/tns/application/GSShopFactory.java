package com.tns.application;

import com.tns.framework.NormalAcc;
import com.tns.framework.PrimeAcc;
import com.tns.framework.ShopFactory;


public class GSShopFactory implements ShopFactory 
{
	public GSPrimeAcc getNewPrimeAccount(int AccNo, String accNm, float charges, boolean isPrime) {
		
		 GSPrimeAcc gsprime=new GSPrimeAcc(AccNo, accNm, charges, isPrime);
		return gsprime;
	}
	 public GSNormalAcc getNewNormalAccount(int AccNo, String accNm, float charges, float deliveryCharges) {
		 GSNormalAcc gsnprime=new GSNormalAcc(AccNo,accNm,deliveryCharges,deliveryCharges);
		return gsnprime;
	}

	
}

