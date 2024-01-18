package thirty1stbatch;

public class StaticVar {
	static int y=50; //static variable

	public static void main(String[] args)
	{
		System.out.println(y);//directly
		System.out.println(StaticVar.y);//by class ref
	}

}
