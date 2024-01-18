package thirty1stbatch;

public class InstanceVar
{
	int x=10; //Instance Variable
	public void m1()
	{
		System.out.println(x);
	}

	public static void main(String[] args)
	{
		InstanceVar obj=new InstanceVar();
		System.out.println(obj.x);
		obj.m1();

	}

}
