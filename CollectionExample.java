package interfacescodes;
import java.util.*;

public class CollectionExample {
	public static void main(String[] args) {
		//creating arraylist
		System.out.println("ArrayList");
		ArrayList<String> name=new ArrayList<String>();   
	      name.add("suresh");//
	      name.add("ramesh");    
	      name.add("sarthak");
	      System.out.println(name); 
	      //creating vector
	      System.out.println("\n");
	      System.out.println("Vector");
	      Vector<Integer> vec = new Vector();
	      vec.addElement(15); 
	      vec.addElement(20);
	      vec.addElement(25);
	      System.out.println(vec);
	       //creating hashset
	       System.out.println("\n");
	       System.out.println("HashSet");
	       HashSet<Integer> set=new HashSet<Integer>();  
	       set.add(1001);  
	       set.add(999);  
	       set.add(102);
	       set.add(106);
	       System.out.println(set);
	       
	       //creating linkedhashset
	       System.out.println("\n");
	       System.out.println("LinkedHashSet");
	       LinkedHashSet<Integer> set2=new LinkedHashSet<Integer>();  
	       set2.add(105);  
	       set2.add(106);  
	       set2.add(108);
	       set2.add(110);	       
	       System.out.println(set2);
	      	} 



}


