public class Car {
	String model;
	double speed;
	
	public Car() {
	}
	public boolean start() {
		return true;
	}
	public void accelerate() {
	}
	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car();
		
		car1.speed = 20.0;
		car2.speed = 30.0;
		System.out.println(car1.speed);
		System.out.println(car2.speed);
	}
}
		
