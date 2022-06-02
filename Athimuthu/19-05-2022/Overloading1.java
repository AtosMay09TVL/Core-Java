

	
	class fun{
	//Adding  integer values	
	void calculate( int value1,  int value2 )
		{
			
			int res=value1+value2;
			System.out.println("first method "+res);
			
		}
    //Adding  double values	
	double calculate( double value3,  double value4 )
		{
		 double res1=value3+value4;
		System.out.println("Second method " +res1);
		}
		}
public class Overloading1 {

	public static void main(String[] args) {
		// Main Function
		int a=10,b=15;
		double c=10.5, d=15.5;
		fun aa=new fun();
		aa.calculate(a,b);
		aa.calculate(c,d);
	}
}


