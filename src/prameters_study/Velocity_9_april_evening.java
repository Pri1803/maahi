package prameters_study;

public class Velocity_9_april_evening {

	public static void main(String[] args)
	{
		Velocity_9_april_evening si=new Velocity_9_april_evening();
		si.studentinfo();
		si.studentinfo("priyanka gupta", 21, 'F', 143, 62.98f, 1);
		si.studentinfo("rajesh", 18, 'M', 123, 76.2f, 12);
		si.add();
		//si.studentinfo(null, 0, 0, 0, 0, 0);
		
		
		si.sub(10, 5);
		Result sm=new Result();
		sm.studentmarks();
		sm.studentmarks(67, 87, 89);
	

	}
	
	public void studentinfo()//without parameter
	{
		String name;
		name="priyanka gupta";
				
		int age;
		age=21;
				
		char gender;
		gender='f';
		
		int height;
		height=183;
		
		float weight;
		weight=56.89f;
		
		int rollnum;
		rollnum=1;
		
		System.out.println("*******************");
		System.out.println("My name is "+name);
		System.out.println("My Age is "+age);
		System.out.println("My Gender is "+gender);
		System.out.println("My height is "+height + "cm");
		System.out.println("My weight is "+weight);
		System.out.println("My roll number is "+rollnum);
		System.out.println("************************");
		
	}
		
		public void studentinfo(String name, int age, char gender, int height, float weight, int rollnum)//with parameter
		
		{
			System.out.println("*******************");
			System.out.println("My name is "+name);
			System.out.println("My Age is "+age);
			System.out.println("My Gender is "+gender);
			System.out.println("My height is "+height);
			System.out.println("My weight is "+weight);
			System.out.println("My roll number is "+rollnum);
			System.out.println("************************");
			
		  
		}
		
		
		public void add()
		{
			int a = 12;
			int b = 10;
			
			int c=a+b;
			
			System.out.println(c);			
			
		}
		
		public void sub(int d, int e) 
		{
		 int f=d-e;
		 
		 System.out.println(d+"-"+e+"="+f);
			
		}
		
	}


