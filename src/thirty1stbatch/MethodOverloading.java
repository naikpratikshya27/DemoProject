package thirty1stbatch;

public class MethodOverloading {
	
	public void add()
	{
		System.out.println("no arg method");
	}
	
	public void add(int x)
	{
		System.out.println("int arg method");
	}
	
	public void add(String s)
	{
		System.out.println("string arg method");
	}

	public static void main(String[] args) {
		MethodOverloading obj=new MethodOverloading();
		obj.add();
		obj.add(10);
		obj.add("hello");
		obj.add('z');//AP is Possible here

	}

}
