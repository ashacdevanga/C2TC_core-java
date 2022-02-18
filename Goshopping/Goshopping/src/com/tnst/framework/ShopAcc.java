package com.tnst.framework;

public class ShopAcc
{
 protected static int accNo;
 protected static String accNm;
 protected static float charge;
 
    public ShopAcc(int accNo, String accNm, float charge)
    {
	super();
	this.accNo = accNo;
	this.accNm = accNm;
	this.charge = charge;
}
    
	public static int getAccNo() {
		return accNo;
	}

	public static void setAccNo(int accNo) {
		ShopAcc.accNo = accNo;
	}

	public static String getAccNm() {
		return accNm;
	}

	public static void setAccNm(String accNm) {
		ShopAcc.accNm = accNm;
	}

	public static float getCharge() {
		return charge;
	}

	public static void setCharge(float charge) {
		ShopAcc.charge = charge;
	}

	public void bookProduct(float charge)
    {
    	System.out.println("Product booked and charges are : "+charge);
    }
    public void items(float charge) 
    {
    	System.out.println("Items delivered with charges : "+charge);
    }
	@Override
	public String toString() {
		return "ShopAcc [accNo=" + accNo + ", accNm=" + accNm + ", charge=" + charge + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	

    
}
