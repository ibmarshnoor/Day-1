
public class Car implements Vehicle{
       private int gear;
       private int speed;
	@Override
	public void gear(int gear) {
		// TODO Auto-generated method stub
	      this.gear=gear;
	}
	@Override
	public void speed(int speed) {
		// TODO Auto-generated method stub
		this.speed=speed;
	}
	public void display() {
		System.out.println("Car Speed:"+speed+"Gear:"+gear);
	}
}
