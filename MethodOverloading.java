package interfacescodes;

public class MethodOverloading {
	public void area(double l,double b)
    {
         System.out.println("Area of Rectangle : "+(l*b));
    }
    public void area(int r) 
    {
         System.out.println("Area of Circle : "+(3.14*r*r));
    }

    public static void main(String args[])
   {

    	MethodOverloading obj1=new MethodOverloading();
       obj1.area(3.5,4.2);
       obj1.area(10);  
   }
}


