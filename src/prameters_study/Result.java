package prameters_study;

public class Result{
	
	

	public void  studentmarks()//without parameter
	{
		String sub1;
		sub1="physics";
				
		String sub2;
		sub2="chemistry";
		
		String sub3;
		sub3="math";
		
		System.out.println("===============");
		System.out.println("Physics marks:- "+sub1);
		System.out.println("chemistry marks:- "+sub2);
		System.out.println("math marks:- "+sub3);
		System.out.println("=================");
		
	}
		
		
	
	
	public void studentmarks(int sub1, int sub2, int sub3)//with parameter
	
	{
		System.out.println("===============");
		System.out.println("Physics marks:- "+sub1);
		System.out.println("chemistry marks:- "+sub2);
		System.out.println("math marks:- "+sub3);
		System.out.println("=================");
		
	}
	
}


