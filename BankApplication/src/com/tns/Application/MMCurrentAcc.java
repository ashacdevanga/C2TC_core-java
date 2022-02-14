package com.tns.Application;

import com.tns.framwwork.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc {
	public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal, creditLimit);
		// TODO Auto-generated constructor stub
	}
public void withdraw(float accBal){
	System.out.println("The Dear normal user your charges are:"+accBal+" with delivery charges is:" +creditLimit);
	 	}

@Override
public String toString() {
	return "MMCurrentAcc [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
			+ "]";
}
public void getAccNo() {
	// TODO Auto-generated method stub
	
}
public void getAccNm() {
	// TODO Auto-generated method stub
	
}
public void getaccBal() {
	// TODO Auto-generated method stub
	
}
public void getcreditLimit() {
	// TODO Auto-generated method stub
	
}
}
