package com.gl.Lab2Q2;

import java.util.Scanner;

public class Traveller_DriverClass {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Total Number of Denominations Required :");
	int size= scan.nextInt() ;
	//
	//Assigning values to the Denomination Array
	//
	System.out.println("Enter the Value of Each Denomination :");
	int[] CrncyDnms = new int[size];
	for(int i=0; i<size; i++) {
		CrncyDnms[i]=scan.nextInt();
	}
	//
	//Taking Input Amount From User
	//
	System.out.println("Enter the Amount you want to pay :");
	int Amount = scan.nextInt();
	//
	//Amount to paid using Denominations
	//
	//System.out.println("In order to Give minimum no of notes, Use :");
	Traveller_MoneyData obj = new Traveller_MoneyData();
	obj.mergesort(CrncyDnms, 0, CrncyDnms.length-1);
	Currency obj1 =new Currency();
	obj1.numOfDenominations(CrncyDnms, Amount);
	scan.close();
			}
}
