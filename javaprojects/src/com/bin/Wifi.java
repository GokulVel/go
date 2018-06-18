package com.bin;

import java.util.Scanner;

public class Wifi 
{
	private static Scanner scan;

	public static void main(String args[])
	 {
		 scan = new Scanner(System.in);
		 System.out.println("Enter the last name");
		 String lastName=scan.next();
		 System.out.println("Enter the room number");
		int roomNo=scan.nextInt();
		 String str1=lastName;
		 if(roomNo>99&&roomNo<=999)
		 {
		char c1 = str1.charAt(str1.length()-1);
		int first=roomNo%10;
		int div=roomNo/10;
		int second=div%10;
		int third=div/10;
		int sum=first+second+third;
		if(sum>9)
		{
			 int a=sum%10;
			sum=a/10;
			sum=sum+a;
		}
		if((sum%2!=0))
		{
			sum--;
		}
		char[] symbol= new char[]{')','!','@','#','$','%','^','&','*','('};
		System.out.println(c1+""+second+""+symbol[second]+""+sum);
	
 }	else
	{
System.out.println("not in range.type between 100 to 999");
	}			
				
				
	 }
				
	}

	

	