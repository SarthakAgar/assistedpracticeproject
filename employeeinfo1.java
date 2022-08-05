package interfacescodes;

public class employeeinfo1 {
	int empid;
	String empname;

	employeeinfo1(int i,String n)
	{
	empid=i;
	empname=n;
	}

	void display() {
	System.out.println(empid+" "+empname);
	}
}


