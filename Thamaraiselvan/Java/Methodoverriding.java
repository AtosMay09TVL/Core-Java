// Java Program for Method Overriding
class Parent {
 
    
    void Print()
    {
 
        
        System.out.println("parent class");
    }
}
 

class subclass1 extends Parent {
 
    
    void Print() { System.out.println("Childclass"); }
}
 
class subclass2 extends Parent {
 
    
    void Print()
    {
 
        System.out.println("Childclass2");
    }
}
 

class Thamarai {
 
    
    public static void main(String[] args)
    {
 
        
        Parent a;
 
        
 
        a = new subclass1();
        a.Print();
 
        a = new subclass2();
        a.Print();
    }
}
