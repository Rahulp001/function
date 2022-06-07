package function;

import java.util.Scanner;

public class Class_one {
        public static void main(String[] args) 
        {
        	Even_odd();
        }
        public static void great_num() 
        {
           int num1,num2;
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter two number :");
           num1=sc.nextInt();
           num2=sc.nextInt();
           if(num1>num2)
           {
        	   System.out.println(num1+" is greater");
           }
           else 
           {
        	   System.out.println(num2+" is greater");
           }
           
        }
        public static void sum_digit()
        {
        	int sum=0,digit, num ;
        	Scanner sc = new Scanner(System.in);
        	System.out.println("Enter the number");
        	num=sc.nextInt();
        	while(num>0) {
        		digit=num%10;
        		sum=sum+digit;
        		num=num/10;
        	}
        	System.out.println("sum of digit "+sum);
        	
        }
        public static void Even_odd() 
        {
        	int num1,num2;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter two number :");
            num1=sc.nextInt();
            num2=sc.nextInt();
            if(num1%2==0)
            {
            	System.out.println(num1+" is even");
            }
            else
            	System.out.println(num1+" is odd");
            if(num2%2==0)
            {
            	System.out.println(num2+" is even");
            }
            else
            	System.out.println(num2+" is odd");
        }
}
