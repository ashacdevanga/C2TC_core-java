package com.tns.framwwork;

public interface  BankFactory {
public abstract	SavingAcc getNewSavingAccount(int accNo, String accNm, float accBal, boolean isSalary); 
public abstract CurrentAcc getNewCurrentAccount(int accNo, String accNm, float accBal, float creditLimit);
}