import java.util.*;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[][] arr1;
     arr1=new int[3][4];
     int[][] arr3= {{ 10,20,30},{40,50,60}};
     
     Scanner in = new Scanner(System.in);
     for(int row=0;row<arr1.length;row++)
     {
    	 for(int column=0;column<arr1[row].length;column++)
    		 arr1[row][column]=in.nextInt();
    	 
     }
     for(int[] row:arr3)
     {
    	 for (int ele:row)
    	 {
    		 System.out.println(ele);
    	 }
     }
	}

}
