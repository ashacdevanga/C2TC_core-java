package com.tns.Application;

import com.tns.framwwork.SavingAcc;

public class MMSavingAcc extends SavingAcc{
	
	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalary) {
		super(accNo, accNm, accBal, isSalary);
		// TODO Auto-generated constructor stub
	}


	
	
 public  void withdraw(float accBal, String cerditLimit) {
		System.out.println("Dear prime user ,your product charges are:" +accBal);
 }
	 
	


@Override
public String toString() {
	return "MMSavingAcc [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
			+ "]";
}




public void getAccNo() {
	// TODO Auto-generated method stub
	
}




public void getaccNm() {
	// TODO Auto-generated method stub
	
}}