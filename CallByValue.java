package interfacescodes;

public class CallByValue {
	int num=10;

int operation(int num) {
	num =num*10/100;
	return(num);
}

public static void main(String args[]) {
	CallByValue obj = new CallByValue();
	System.out.println("Before operation value of data is "+obj.num);
	obj.operation(100);
	System.out.println("After operation value of data is "+obj.num);
	}


}
