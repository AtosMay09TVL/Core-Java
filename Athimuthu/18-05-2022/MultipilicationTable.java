import java.util.Scanner;

public class Multiplication_Table {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a,b,c,opt,i;
		Scanner A=new Scanner(System.in);
		System.out.println("Multiplication table");
		System.out.println("********************");
try {
		System.out.println("Enter Start Value  : ");
		a=A.nextInt();
		System.out.println("Enter End Value  : ");
		b=A.nextInt();
		System.out.println("Enter Muliplying Value  : ");
		c=A.nextInt();
	
		
		{
		
		if(a>0 && b>0 && c>0 ) {
		
		
				for(i=a;i<=b;i++)
					{
					opt=a*c;	
					System.out.println(+a+" * "+c+" = "+opt);
					a++;
					}
		}
		}
	}
	catch(Exception O)
{ 
		System.out.println("Error Occured");
		}
		
		
}
}
