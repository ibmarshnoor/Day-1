
public class Bike implements Vehicle{
	private int speed;
	private int gear;
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
		System.out.println("Bike speed:"+speed+" Gear:"+gear);
	}
    }
