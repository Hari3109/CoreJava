package Abstract;

abstract class Vehicle {
	Vehicle(){
		
	}

abstract void move();

}
 abstract class FourWheeler extends Vehicle{
	FourWheeler(){
		
	}
}
class Car extends FourWheeler{
	void move() {
		
	}
}