package com.tnst.application;

import com.tnst.framework.ShopFactory;

public class GSShopFactory implements ShopFactory
{
@Override
	public GSPrimeAcc getNewPrimeAccount(int AccNo, String accNm,float charges,boolean isPrime) 
	{
		GSPrimeAcc a= new GSPrimeAcc();
		return a;
	}
	public GSNormalAcc getNewNormalAccount(int AccNo,String accNm,float charges,int deliveryCharges ) 
	{
		GSNormalAcc b= new GSNormalAcc();
		return b;
	}
	
}
