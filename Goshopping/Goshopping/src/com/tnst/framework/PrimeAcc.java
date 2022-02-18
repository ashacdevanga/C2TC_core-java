package com.tnst.framework;

public class PrimeAcc extends ShopAcc
{
 public PrimeAcc(int accNo, String accNm, float charge, boolean isPrime2) {
		super(accNo, accNm, charge);
		this.setPrime(isPrime);
		// TODO Auto-generated constructor stub
	}

private void setPrime(boolean isPrime2) {
	// TODO Auto-generated method stub
	
}

public static boolean isPrime;
 protected static final float delivaryCharges=0;

  public void bookProduct(float charges)
   {
	   System.out.println("charges are: "+charges);
   }

@Override
public String toString() {
	return "PrimeAcc [isPrime=" + isPrime + ", toString()=" + super.toString() + ", getClass()=" + getClass()
			+ ", hashCode()=" + hashCode() + "]";
}

   
}
