package interfacescodes;

public class StringEx {
	public static void main(String[] args) {
		// strings methods
		System.out.println("Strings Methods ");
		
		String sl=new String("Hello World Program");
		System.out.println(sl.length());
		String sub=new String("hello");
		System.out.println(sub.substring(2));
		String s1="Hi";
		String s2="Hi";
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.toLowerCase());
		String replace=s2.replace('H', 'B');
		System.out.println(replace);
		String x="Welcome to Java worLd";
		String y="WeLcOmE TO JaVa woRlD";
		System.out.println(x.equals(y));
            
		System.out.println("Creating StringBuffer");	
		StringBuffer s=new StringBuffer("Welcome to Java world!");
		s.append("Enjoy your e-learning");
		System.out.println(s);
		StringBuffer stb=new StringBuffer("java");
		stb.replace(0, 2, "JA");
		System.out.println(stb);
		System.out.println("Creating StringBuilder");
		StringBuilder stb2=new StringBuilder("Happy JAVA ");
		stb2.append("Learning");
		System.out.println(stb2);
		System.out.println(stb2.delete(0, 5));
		System.out.println(stb2.reverse());


		
	}
}
