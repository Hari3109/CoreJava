package Interface;

public class InterfaceEx1 {
	public static void main(String[] args) {
		driving(new BMW());
		System.out.println("=======");
		driving(new RangeRover());
	}
	static void driving(Drive d) {//he is driver , not worried abt the car
		d.steer();//as a driver never mind which car he drives 
		d.acceleration();
	}

}
interface Drive{
	int MAX_SPEED=200;//public static final int max_speed=200;
	void steer();//public abstract void steer();
	void acceleration();//public abstract void accelerator();
	
}
class BMW implements Drive{
	public void steer() {
		System.out.println("bmw car steering starts working");
		//MAX_SPEED++;(error)
	}
	public void acceleration() {
		System.out.println("accleration starts ");
	}
}
class RangeRover implements Drive{
	public void steer() {
		System.out.println("RangeRover car steering works");
	}
	public void acceleration () {
		System.out.println("RangeRover car accelrating");
	}
}