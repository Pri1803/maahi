package constructor;

public class Constructor_without_parameter
{
	int a;
	int b;
	int sum;
	
	public Constructor_without_parameter()
	{
		System.out.println("this is constructor method");
		a=40;
		b=40;
		sum=a+b;
		System.out.println("sum1 is "+sum);
		
	}
	

	public static void main(String[] args)
	{
		Constructor_without_parameter a=new Constructor_without_parameter();
		a.practice();

	}
	
	public void practice()
	{
		a=10;
		b=12;
		sum=a+b;
		System.out.println("sum2 is "+sum);
		
	}

}
