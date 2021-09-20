package com.gl.Lab2.Q1;

import java.util.Scanner;
public class PayMoneyDriverClass {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the Size of Transaction");
	int size = scan.nextInt();
	System.out.println("Enter the Value of Each Transaction");
	int[] transaction = new int[size];
	for(int i=0; i<size ;i++)
	{
	transaction[i]=scan.nextInt();
	}
	System.out.println("Enter Total no of targets that are needs to be Achieved");
	int Ttargets = scan.nextInt();
	int[] Ttarr = new int[Ttargets];
	for(int i=0; i<Ttargets;i++) {
		Ttarr[i]=i+1;
		System.out.println("Enter The Value of Target "+Ttarr[i]);
		int target = scan.nextInt();
		PayMoney_Services obj = new PayMoney_Services();
		int res = obj.timetaken(transaction, target);
	if(res == -1) {
				System.out.println("Target is Not Achived");
				System.out.println("--------------------------------------");
			}
			else {
				System.out.println("Target "+Ttarr[i]+" is Achived after " +res+" transaction");
				System.out.println("--------------------------------------");
			}
	
	}
	scan.close();
}
}
