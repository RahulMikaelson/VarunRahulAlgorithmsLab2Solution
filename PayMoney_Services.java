package com.gl.Lab2.Q1;

public class PayMoney_Services {
	public int timetaken(int[] transaction, int target ) {
		for(int i=0; i<transaction.length; i++) {
			if(transaction[i]==target || target<transaction[i])
				return i+1;
			else {
				target = target - transaction[i];
			}
		}
		return -1;
		}
	}
		