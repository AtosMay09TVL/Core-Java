import java.util.*;
public class Finding_Biggest {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner A=new Scanner(System.in);
		System.out.println("Enter Value 1 : ");
		a=A.nextInt();
		System.out.println("Enter Value 2 : ");
		b=A.nextInt();
		if(a>b)
		{
			System.out.println(" Value " +a+ " is bigger than Value "+b);
		}
		else
			System.out.println(" Value " +b+ " is bigger than Value "+a);
	}

}

