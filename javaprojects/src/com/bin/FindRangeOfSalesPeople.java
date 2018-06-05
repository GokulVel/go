package com.bin;

public class FindRangeOfSalesPeople {
	public void calcWeeklySalary(int salesAmount[]) {
		int a=0,c=0,c1=0,c2=0,c3=0,c4=0,c5=0,c6=0,c7=0,c8=0;
		for(int i=0;i<salesAmount.length;i++)
		{
			a=salesAmount[i];
			int b=(int)(a*0.09);
			b+=200;
			System.out.println("WeeklySalary of emp"+i+" : +b");
			if((200<b)&&(b<299))
				c++;
			if((300<b)&&(b<399))
				c1++;
			if((400<b)&&(b<499))
				c2++;
			if((500<b)&&(b<599))
				c3++;
			if((600<b)&&(b<699))
				c4++;
			if((700<b)&&(b<799))
				c5++;
			if((800<b)&&(b<899))
				c6++;
			if((900<b)&&(b<999))
				c7++;
			if(b>1000)
				c8++;
			}
		System.out.println("NO OF EMPS in 200-299 "+c);
		System.out.println("NO OF EMPS in 300-399 "+c1);
		System.out.println("NO OF EMPS in 400-499 "+c2);
		System.out.println("NO OF EMPS in 500-599 "+c3);
		System.out.println("NO OF EMPS in 600-699 "+c4);
		System.out.println("NO OF EMPS in 700-799 "+c5);
		System.out.println("NO OF EMPS in 800-899 "+c6);
		System.out.println("NO OF EMPS in 900-999 "+c7);
		System.out.println("NO OF EMPS in above 1000 "+c8);
		}
	public static void main(String [] args) {
		FindRangeOfSalesPeople sales=new FindRangeOfSalesPeople();
		int salesAmount[]= {2000,6000,3000,1000,4000};
		sales.calcWeeklySalary(salesAmount);
		
	}

}


