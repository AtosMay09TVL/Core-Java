import java.io.IOException;

import java.util.*;
public class MyException {

	public static void main(String[] args) {
		try
		{
			int a,b,c;
			Scanner A=new Scanner(System.in);
			System.out.println("Enter Value 1 : ");
			a=A.nextInt();
			System.out.println("Enter Value 2 : ");
			b=A.nextInt();
			c=a+b;
			System.out.println(" Addition is : "+c);
		}
		// TODO Auto-generated method stub
catch(Exception A)
		{
	System.out.println("Error Occured ");
		}	
	}
	
}
