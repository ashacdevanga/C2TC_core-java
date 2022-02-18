package com.tnst.application;

import com.tnst.framework.NormalAcc;

public class GSNormalAcc extends NormalAcc
{

	public GSNormalAcc(int accNo, String accNm, float charge, float deliveryCharge) {
		super(accNo, accNm, charge, deliveryCharge);
		// TODO Auto-generated constructor stub
	}
	public GSNormalAcc() {
		super(accNo, accNm, deliveryCharge, deliveryCharge);
		
	}

	public void bookProduct(float charge)
	{
	System.out.println("dear normal user, Your Charges are: "+charge+" with delivary charge is: "+deliveryCharge);
	}

	@Override
	public String toString() {
		return "GSNormalAcc [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
}
