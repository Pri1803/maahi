package constructor;

public class constructor_with_parameter

{
	int a=90;
	int b=20;
	int c=20;

	public constructor_with_parameter(int x,int y)
	{
		a=x;
		b=y;
	}
	
	public constructor_with_parameter(int x,int y,int z)
	{
	  a=x;
	  b=y;
	  c=z;
	}
	

	public static void main(String[] args)
	{
		constructor_with_parameter sum=new constructor_with_parameter(20, 50);
		sum.practice1();
		constructor_with_parameter sum1=new constructor_with_parameter(10, 10, 0);
		sum1.practice1();
		System.out.println("global varirable "+sum.a);
		System.out.println("global variable "+sum1.a);
		

	}
	
	public void practice1()
	{
		int add=a+b+c;
		System.out.println("Add is "+add);
	}

}
