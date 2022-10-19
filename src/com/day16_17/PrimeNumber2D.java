package com.day16_17;

public class PrimeNumber2D {
	 int[][] primeNoArray = new int[10][100];

	    public void primeNo() {
	        for(int i=2; i<1000; i++) {
	            int count = 0;
	            for(int j=2; j<=i; j++) {
	                if(i%j == 0) {
	                    count++;
	                }
	                if(count == 2) {
	                    break;
	                }
	            }
	            if(count==1) {
	                int index1 = i/100;
	                int index2 = i%100 -1 ;
	                primeNoArray[index1][index2] = i;
	            }
	        }
	    }

	    public void show() {
	        System.out.println("Row 1");
	        int rowNo = 1;
	        for(int[] list: primeNoArray) {
	            rowNo++;
	            for(int prime: list) {
	                if(prime == 0) {
	                    continue;
	                }
	                System.out.print(prime + " ");
	            }
	            System.out.println();
	            if(rowNo == 11) {
	                return;
	            }
	            System.out.println("Row " + rowNo);
	           
	        }
	    }
	    public static void main(String[] args) {
	        PrimeNumber2D primeNo = new PrimeNumber2D();
	        primeNo.primeNo();
	        primeNo.show();

	    }
}
