package Practice;

import java.util.ArrayList;

public class Site {
private int siteId;
private int carLimit;
private ArrayList<Car>cars=new ArrayList<>();
public int getSiteId() {
	return siteId;
}
public void setSiteId(int siteId) {
	this.siteId=siteId;
}
public int getCarLimit() {
	return carLimit;
}
public void setCarLimit(int carLimit) {
	this.carLimit=carLimit;
}
public Site(int siteId,int carLimit) {
	this.siteId=siteId;
	this.carLimit=carLimit;
	}

public String addCar(Car car) {
	if(cars.size()<carLimit) {
		cars.add(car);
		return "car Added";
	}else {
		return "site is full";
	}
}

public int getCarByType(String carType) {
	int count=0;
	for(Car c:cars) {
		if(c.getType().equalsIgnoreCase(carType)) {
			count++;
		}
	}
	if(count==0) {
		return -1;
	}
	return count;
}
public String removeCarById(int id) {
	for(int i=0;i<cars.size();i++) {
		if(cars.get(i).getcardId()==id) {
			cars.remove(i);
			return "car out";
		}
	}
	return "no car found";
}
}
class Car{
	private int cardId;
	private String carName;
	private String type;
	public Car(int carId,String carName,String type) {
		this.cardId=carId;
		this.carName=carName;
		this.type=type;
	}
	public int getcardId() {
		return cardId;
	}
	public void setcardId(int cardId) {
		this.cardId=cardId;
	}
	public String getcarName() {
		return carName;
	}
	public void setcarName(String carName) {
		this.carName=carName;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type=type;
	}
}
