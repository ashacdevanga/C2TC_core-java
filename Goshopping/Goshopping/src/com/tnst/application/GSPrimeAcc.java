package com.tnst.application;

import com.tnst.framework.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc
{
	public static final float Charges = 0;

	public GSPrimeAcc()
	{
		super(accNo, accNm, charge,isPrime);
		// TODO Auto-generated constructor stub
	}

	private static float getCharges() {
	 return Charges;
	}
	public void bookProduct(float charges) 
	{
		System.out.println("Dearprime user , your product charges are: "+charges );
	}

	@Override
	public String toString() {
		return "GSPrimeAcc [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}

	

	
}
