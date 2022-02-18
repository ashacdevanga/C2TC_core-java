package com.tnst.framework;

public class NormalAcc extends ShopAcc
{
 protected static float deliveryCharge=50;

   public NormalAcc(int accNo, String accNm, float charge, float deliveryCharge) {
	super(accNo, accNm, charge);
	NormalAcc.deliveryCharge = deliveryCharge;
}

public void bookProduct(float deliveryCharge)
    {
    	System.out.println("charges are: "+deliveryCharge);
    }

@Override
public String toString() {
	return "NormalAcc [deliveryCharge=" + deliveryCharge + ", toString()=" + super.toString() + ", getClass()="
			+ getClass() + ", hashCode()=" + hashCode() + "]";
}

	

    
}
