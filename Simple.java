package com.bin;

public class Simple {
	int Month;
	int Day;
	int Year;
	public void Gokul(int Month,int Day,int Year) 
	{
		this.Month=Month;
		this.Day=Day;
		this.Year=Year;
	}
	public int getMonth() {
		return Month;
	}
	public void setMonth(int month) {
		Month = month;
	}
	public int getDay() {
		return Day;
	}
	public void setDay(int day) {
		Day = day;
	}
	public int getYear() {
		return Year;
	}
	public void setYear(int year) {
		Year = year;
	}
	public void Display () {
		System.out.println("Month=" + Month + ", Day=" + Day + ", Year=" + Year);
	}
 public static void main(String[] args) {
	Simple ph=new Simple();
	ph.Gokul(6,7,1990);
    ph.Display();
 }
}

