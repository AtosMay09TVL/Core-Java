
import java.util.Scanner;
public class Details_Entry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,opt;
		String cus;
		Scanner A=new Scanner(System.in);
		System.out.println("Data Entry");
		System.out.println("************");
		System.out.println("Enter Customer name : ");
		cus=A.nextLine();
		System.out.println("Enter Value 2 : ");
		b=A.nextInt();
		System.out.println(" Select Options \n 1. Addition \n 2. Substraction \n 3. Multibilcation");
		System.out.println(" Enter Option : ");
		opt=A.nextInt();
	}
}
