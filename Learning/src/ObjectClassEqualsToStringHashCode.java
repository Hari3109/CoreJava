import java.util.Objects;

class Laptop{
	 String model;
	 int price;
	 public String toString() {
		 return model+" : "+price;
	 }
	@Override
	public int hashCode() {
		return Objects.hash(model, price);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Laptop other = (Laptop) obj;
		return Objects.equals(model, other.model) && price == other.price;
	}
	 
}
public class ObjectClassEqualsToStringHashCode {
public static void main(String[] args) {
	Laptop l=new Laptop();
	l.model="Mac";
	l.price=100000;
	System.out.println(l);
	Laptop e= new Laptop();
	e.model="Mac";
	e.price=100000;
	System.out.println(e);
	boolean result= e.equals(l);
	System.out.println(result);// this statement even though the values of the object is same we are getting output as false for this reason we need hashcode equals which is inbuilt
}
}
