package constructor;

public class mathops
{
    int a;
    int b;
	public mathops()
	{
	  a=50;
	  b=50;
	  System.out.println("This is construcror");
	 
	}
	public  void add()
	{
	  int add = a+b;
	  System.out.println(a+b);
	}
    public static void main(String[] args) 
	{
		mathops mo=new mathops();
		mo.add();
	}
}
		
		

	


