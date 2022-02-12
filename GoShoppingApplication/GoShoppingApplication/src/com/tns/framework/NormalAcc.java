package com.tns.framework;

public  class NormalAcc extends ShopAcc
{

	protected static float deliveryCharge=50;
	
	
	
	public NormalAcc(int accNo, String accNm, float charges, float deliveryCharge) {
		super(accNo, accNm, charges);
		NormalAcc.deliveryCharge = deliveryCharge;
	}
	public void bookProduct(float deliveryCharge)
	{
		System.out.println("The Dear normal user your charges are:"+charges+" with delivery charges is:" +deliveryCharge);
	}
	
	@Override
	public String toString() {
		return "NormalAcc [deliveryCharge=" + deliveryCharge + ", accNo=" + accNo + ", accNm=" + getAccNm() + ", charges="
				+ charges + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
	
	
}
