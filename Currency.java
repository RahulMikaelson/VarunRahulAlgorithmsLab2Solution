package com.gl.Lab2Q2;

public class Currency {
	public void numOfDenominations(int[] CrncyDnms, int amount) {
		int notecounter[] = new int[CrncyDnms.length];
		for (int i = 0; i < CrncyDnms.length; i++) {
			if (amount >= CrncyDnms[i]) {
				notecounter[i] = amount /CrncyDnms[i];
				amount = amount - notecounter[i] * CrncyDnms[i];
			}
		}
		if (amount > 0)
			System.out.println("Exact amount cannot be given from dominations person having");
		else {
			System.out.println();
			System.out.println("Your payment approach to give minimum number of notes are -:");
			for (int i = 0; i < CrncyDnms.length; i++) {
				if (notecounter[i] != 0)
					System.out.println(notecounter[i] + " number of notes required of denomination Rs." + CrncyDnms[i]);
			}
		}
	}

	
	
}
