package Thamarai;

public class Student {
String name;
int phy;
int che;
int maths;

void details()
{
	System.out.println("name:"+this.name);
	this.marks();
	this.percentage();
}

void marks()
{
	System.out.println("physics:"+this.phy);
	System.out.println("chemistry:"+this.che);
	System.out.println("maths:"+this.maths);
}
void percentage()
{
	int total=this.phy+this.che+this.maths;
	float perc=total/300.0f*100.0f;
	System.out.println("percentage:"+perc);
}
public static void main(String[] args) {
	Student s1=new Student();
	s1.name="vijay";
	s1.phy=90;s1.che=90;s1.maths=90;
	Student s2=new Student();
	s2.name="sai";
	s2.phy=95;s2.che=95;s2.maths=95;
	s1.details();
	s2.details();
	
	
	
	
}

	
	
}





