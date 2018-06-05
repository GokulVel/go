package com.bin;

public class Even {
int s;
	
	public void isEven(int s)
	{
if(s%2==0) {
	System.out.println("true");
}
else
{
	System.out.println("false");
}
}
	public static void main(String args[])
	{
		Even n1=new Even();
		n1.isEven(7);
	}
}
