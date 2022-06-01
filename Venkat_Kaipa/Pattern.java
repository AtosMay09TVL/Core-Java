package datatype;

import java.util.Scanner;

public class PatternName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Name : ");
		String str=sc.nextLine();
		//String[] ch=str.split("");
		char[] ch=str.toCharArray();
		for(int i=0;i<=ch.length;i++) {
			for (int j=0;j<i;j++) {
				System.out.print(ch[j]);
				
				
			}
			System.out.println("");
		}

	}

}
