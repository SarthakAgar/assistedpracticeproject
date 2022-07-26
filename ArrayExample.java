package interfacescodes;

public class ArrayExample {
	public static void main(String[] args) {
		//1-D array
		int val[]= {1,2,3,4,5,6,7,8,9};
		int i;
		for(i=0;i<9;i++) {
			System.out.println(" array values are" +"\n"+val[i]);
		}
		int  val1[][]= {
				{1,2,3},{4,5},{7,8,9,0}};

		System.out.println("\nLength of row 1: " + val1[0].length);
		System.out.println("\nLength of row 2: " + val1[1].length);
		System.out.println("\nLength of row 3: " + val1[2].length);
		}
			
	}


