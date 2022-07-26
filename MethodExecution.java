package interfacescodes;

public class MethodExecution {
	public int addnumbers(int a,int b) {
		int c=a+b;
		return c;
	}

	public static void main(String[] args) {

		MethodExecution obj=new MethodExecution();
		int res= obj.addnumbers(10,3);
		System.out.println("addition result :"+res);
		}


}
