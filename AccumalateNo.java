package com.vittal;

public class AccumalateNo {

	public static void main(String[] args) {
		int num = 9999,r=0,sum=0;
		while(num !=0) {
			r = num % 10;
			num = num % 10;
			sum = sum + r;
			if(num==0) {
				if(sum >= 10) {
					num = sum;
					sum = 0;
				}
			}
		}
		System.out.println("sum----"+sum);
	

	}

}
