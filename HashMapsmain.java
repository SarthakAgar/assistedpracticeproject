package interfacescodes;

import java.util.HashMap;

public class HashMapsmain {
public static void main(String[] args) {
	int a =10;
	int b =3;
	int c=78;
	HashMap<String,Integer> hmp= new HashMap<String,Integer>() ;
	hmp.put("a", 10);
	hmp.put("b", 3);
	hmp.put("c", 78);
	System.out.println(hmp);
	
	HashMap<String,String> fun= new HashMap<String,String>() ;
	fun.put("abc","bcd");
	fun.put("abd","gcd");
	fun.put("abh","icd");
	
	fun.remove("abd");
	System.out.println(fun);
	System.out.println(fun.containsValue("bcd"));
	System.out.println(fun.keySet());
	
	System.out.println(fun.values());
}
}
