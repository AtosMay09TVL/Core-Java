package Atos;

import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		int[]arr1;  int arr2[];
		arr1=new int[5];
		int[]arr3= {10,20,30,40,50};
		Scanner in=new Scanner(System.in);
		for(int index=0;index<arr1.length;index++) {
			arr1[index]=in.nextInt();
		}
		for(int val:arr3){
			System.out.println(val);
			
		}
			
		}
	}


