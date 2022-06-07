package function;

import java.util.Scanner;

public class Calc_per {
 

	int roll_no,i;
	int[] sub=new int[5];
	String Student_name;
	public void accept() 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name");
		Student_name=sc.next();
		System.out.println("enter the roll no");
		roll_no=sc.nextInt();
		System.out.println("Enter 5 subject marks out of hundred: ");
		int i;
		for(i=0;i<5;i++) 
		{
			sub[i]=sc.nextInt();
		}
		calc();
		
	}
	public void calc() 
	{
		int total=0,per;
		for(i=0;i<5;i++)
		{
			total=total+sub[i];
	
		}
		per =total*100/500;
		System.out.println("student name is :"+Student_name);
		System.out.println("student roll is :"+roll_no);
		System.out.println("percentage is "+per);
	}
	
}
