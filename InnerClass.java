package interfacescodes;

public class InnerClass {


		 private String msg="Welcome to Java"; 
		 
		 class Inner{  
		  void hello(){System.out.println(msg+", Let us start learning Inner Classes");}  
		 }  


		public static void main(String[] args) {

			InnerClass obj1=new InnerClass();
			InnerClass.Inner in=obj1.new Inner();  
			in.hello();  
		}
		}

