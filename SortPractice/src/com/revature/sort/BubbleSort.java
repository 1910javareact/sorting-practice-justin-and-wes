package com.revature.sort;

public class BubbleSort {
	
	public static void sort(int[] arr) {
		
        int n = arr.length;
        int k;

        for (int m = 0; m < n; m++) {

            for (int i = 0; i < n - 1 ; i++) {
                k = 0;
                
                if (arr[i] > arr[m]) {
                	System.out.println("i " + i +"k " + k + "m " + m );
                    continue;  
                } 
                if (arr[i] < arr[m]){
                	System.out.println("i " + i +"k " + k + "m " + m );
                	swapNumbers(i, m, arr);
                	// Prints in descending order
                }
            }
        }
	}
	
	/*
	 * public static int[] bubbleSort(int[] array) {
	 * 
	 * int n = array.length; int k;
	 * 
	 * for (int m = n; m >= 0; m--) {
	 * 
	 * for (int i = 0; i < n - 1; i++) { k = i++; if (array[i] > array[k]) {
	 * swapNumbers(i, k, array); } } } return array; }
	 */

	 public static void swapNumbers(int i, int j, int[] array) {
	        int num;
	        num = array[i];
	        array[i] = array[j];
	        array[j] = num;

	    }
}
