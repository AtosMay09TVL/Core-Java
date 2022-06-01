import java.util.*;
public class Simple_Calculator {

	public static void main(String[] args) {
		//Simple Calculator
		int a,b,opt;
		Scanner A=new Scanner(System.in);
		System.out.println("Calculations");
		System.out.println("************");
		System.out.println("Enter Value 1 : ");
		a=A.nextInt();
		System.out.println("Enter Value 2 : ");
		b=A.nextInt();
		System.out.println(" Select Options \n 1. Addition \n 2. Substraction \n 3. Multibilcation");
		System.out.println(" Enter Option : ");
		opt=A.nextInt();
		switch(opt)
		{
		case 1:
			System.out.println("Addition = "+(a+b));
			break;
		case 2:
			System.out.println("Substraction = "+(a-b));
			break;
		case 3:
			System.out.println("Multibilcation = "+(a*b));
			break;
			default:
				System.out.println("You Entered Wrong Details");
				
		
		}
		
		

	}

}
