package simpleJavaProgrammes;

public class HChild implements H
{
	public void m1()
	{
		System.out.println("implementation of m1");
	}
	public void m2()
	{
		System.out.println("implementation of m2");
	}

	public static void main(String[] args) {
		HChild obj=new HChild();
		obj.m1();
		obj.m2();
		

	}

}
