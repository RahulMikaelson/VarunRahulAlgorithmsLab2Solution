package com.gl.Lab2Q2;

public class Traveller_MoneyData {
	
	
	
public void  mergesort(int[]CrncyDnms, int left, int right ){
	if (left<right) {
		int mid = (left +right)/2;
		mergesort(CrncyDnms , left, mid);
		mergesort (CrncyDnms ,mid+1 , right );
		
		merge(CrncyDnms,left,mid,right);
		
	}
}




public void merge(int[] CrncyDnms, int left, int mid, int right) {
	int len1 =mid-left+1;
	int len2 = right -mid;
	
	int leftArr[]= new int [len1];
	int rightArr[]= new int[len2];
	
	for(int i=0;i<len1;i++)
			leftArr[i]=CrncyDnms[left+i];
	
	for(int j=0;j<len2;j++)
	rightArr[j]=CrncyDnms[mid+1+j];
	
	int i=0, j=0;
	int k =left;
	while ( i<len1 && j <len2) {
		if(leftArr[i]>=rightArr[j]) {
			CrncyDnms[k]=leftArr[i];
			i++;
		}else {
			CrncyDnms[k]=rightArr[j];
			j++;
			}
		k++;
		
	}
	while(i<len1){
	CrncyDnms[k]=leftArr[i];
	i++;
	k++;
	}
	while (j<len2) {
		CrncyDnms[k]=rightArr[j];
		j++;
		k++;
	}
}
public int calculation(int[] CrncyDnms, int Amount ) {
	return -1;
}
}
