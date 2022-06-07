package function;

import java.util.Scanner;

public class Ret_Para {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
     accept();
	}
	public static void accept()
	{
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Enter the numbers");
		num=sc.nextInt();
		armstrong(num);
		evenodd(num);
		positive_neg(num);
	}
	public static int armstrong(int a) 
	{
		int temp,r ,s=0;
		temp=a;
		while(a>0){
			r=a%10;
			s=s+r*r*r;
			a=a/10;
		}

		 if(temp==s) {
			   System.out.println(temp+" is armstrong number");
		   }
		   else
			   System.out.println(temp+" is not a armstrong number");
		 return temp;
	}
	public static int evenodd(int temp) 
	{
		 if(temp%2==0)
         {
         	System.out.println(temp+" is even");
         }
         else
         	System.out.println(temp+" is odd");
		 return temp;
	}
	public static void positive_neg(int temp) {
		if(temp>=0) 
		{
		System.out.println(temp+" is a positive number");	
		}
		else
			System.out.println(temp+" is a negative number");
	}
	
	

}
