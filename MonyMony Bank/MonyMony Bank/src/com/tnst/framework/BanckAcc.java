package com.tnst.framework;

public abstract class BanckAcc
{
 protected static int accNo;
 protected static String accNm;
 protected static float accBal;
 

public BanckAcc(int accNo, String accNm, float accBal) {
	super();
	this.accNo = accNo;
	this.accNm = accNm;
	this.accBal = accBal;
}

public static int getAccNo() {
	return accNo;
}

public static void setAccNo(int accNo) {
	BanckAcc.accNo = accNo;
}

public static String getAccNm() {
	return accNm;
}

public static void setAccNm(String accNm) {
	BanckAcc.accNm = accNm;
}

public static float getAccBal() {
	return accBal;
}

public static void setAccBal(float accBal) {
	BanckAcc.accBal = accBal;
}

public void withdraw(float accBal)
{
	System.out.println(" acc bal is: "+accBal);
}
public void deposite(float accBal)
{
System.out.println("acc bal after withdraw: "+accBal);
}
@Override
public String toString() {
	return "BanckAcc [accNo=" + accNo + ", accNm=" + accNm + ", accBal=" + accBal + ", getClass()=" + getClass()
			+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}



}


