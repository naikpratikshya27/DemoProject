package simpleJavaProgrammes;

public class DemoChild extends Demo {
	public void m1()
	{
		System.out.println("this is m1");
	}
	public void m2()
	{
		System.out.println("this is m2");
	}

	public static void main(String[] args) {
		DemoChild obj=new DemoChild();
		obj.m1();
		obj.m2();
		obj.add();

	}

}
