package array;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr1;
		int[][] arr2;
		arr1=new int [3][4];
		int[][] arr3 = {{10,20,30,40},{50,60,70,80}};
		Scanner sc =new Scanner(System.in);
		for(int r=0;r<arr1.length;r++) {
			for(int c=0;c<arr1[r].length;c++) {
				arr1[r][c]=sc.nextInt();
			
			for(int[] r1:arr3) {
				for(int ele:r1) {
					System.out.println(ele);
				}
			}
		}

	}

}
}
