package Practice;
import java.util.*;

public class Vehicle {
String name;
Double price;
public Vehicle(String name,Double price) {
	this.name=name;
	this.price=price;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name=name;
}
public Double getPrice() {
	return price;
}
public void setPrice(Double price){
	this.price= price;
}

class VehicleImplementation{
	public Double averageCost(List<Vehicle>list) {
		Double avg=list.stream().mapToDouble(x->x.getPrice().average().getAsDouble());
		return avg;
	}
	public List<String>getVehicleList(List<Vehicle>list){
		return list.stream().filter(x->x.price(750008).map(x->x.name).collect(Collectors.toList()));
	}
	public double minPrice(List<Vehicle>list) {
		Double sum=list.stream().mapToDouble(x->x.price).min().orElse(0.0);
		return sum;
	}
}
}