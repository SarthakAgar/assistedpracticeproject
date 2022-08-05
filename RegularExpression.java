package interfacescodes;
import java.util.regex.*;
public class RegularExpression {
	

	

	public static void main(String[] args) {
		String pattern = "[c-j]+";
		String pattern1 ="[2-4]+";
		String pattern2 = "[A-H]+";
		String check = "Regular Expressions";
		String check1="hello world";
		String check2="h1e2l3l4o5";
		String check3="JAVA WORLD";
		
		Pattern p = Pattern.compile(pattern);
		Pattern p1 = Pattern.compile(pattern1);
		Pattern p2 = Pattern.compile(pattern2);
		Matcher c = p.matcher(check);
		Matcher c1 = p.matcher(check1);
		Matcher c2 = p1.matcher(check2);
		Matcher c3 = p2.matcher(check3);
		
		
		while (c.find())
	      	System.out.println( check.substring( c.start(), c.end() ) );
		while (c1.find())
	      	System.out.println( check1.substring( c1.start(), c1.end() ) );
		while (c2.find())
	      	System.out.println( check2.substring( c2.start(), c2.end() ) );
		while (c3.find())
	      	System.out.println( check3.substring( c3.start(), c3.end() ) );
		}
	}


