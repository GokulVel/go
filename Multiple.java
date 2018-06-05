package com.bin;

public class Multiple {
	int s1;
	int s2;
	
	public void isMultiple(int s1,int s2)
	{
if(s1%s2==0) {
	System.out.println("true");
}
else
{
	System.out.println("false");
}
}
	public static void main(String args[])
	{
		Multiple n1=new Multiple();
		n1.isMultiple(6,3);
	}
}
