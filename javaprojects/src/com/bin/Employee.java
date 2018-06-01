package com.bin;

public class Employee {
	String Firstname;
	 String Secondname;
	 double monthlysalary;
	 public String getFirstname(String a)
	 {
		 
	     Firstname="Firstname is"+a;
		 return Firstname;
	 }

	public void setFirstname(String firstname) {
		Firstname = firstname;
	}
	public String getSecondname(String b) {
		Secondname="scondname is"+b;
		return Secondname;
	}
	public void setSecondname(String secondname) {
		Secondname = secondname;
	}
	public double getMonthlysalary(double i) {
		if(i>0) {
			double salary=10*i;
			double sal=salary;
			double yearly=(salary/10)+sal;
			double yearlysalary=yearly;
			return yearlysalary;
		}
		else
		{
			return 0;
		}
	}
	public void setMonthlysalary(double monthlysalary) {
		this.monthlysalary = monthlysalary;
	}
	public static void main(String a[])
	{
		Employee e1=new Employee();
		Employee e2=new Employee();
		String f1=e1.getFirstname("Arun");
		System.out.println(f1);
		String f2=e2.getFirstname("Siva");
		System.out.println(f2);
		String s1=e1.getSecondname("Gokul");
		System.out.println(s1);
		String s2=e2.getSecondname("Balajim");
		double m1=e1.getMonthlysalary(20000.0);
		System.out.println(s2);
		double m2=e2.getMonthlysalary(25000.0);
		System.out.println(m1);
		
		
		
		
		
		System.out.println(m2);
	}	
	}

