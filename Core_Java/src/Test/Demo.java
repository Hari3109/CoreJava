package Test;

public class Demo {
	public static void main(String[] args) {
		//create a array which hold 5 customer objects
		Customer Customer[]=new Customer[5];
		//just  a creation of an array not the creation of Customer object
	    Customer c1= new Customer(101,"Hari");
	    Customer[0]=c1;
	    Customer[1]=new Customer(102,"Harry");
	    Customer[2]= new Customer(103,"dev");
	    Customer[3]=new Customer(104,"santhu");
	    Customer[4]=new Customer(105,"priya");
	    //try to iterate
	    System.out.println("-----Cust list-----");
	    for(Customer C:Customer) {
	    	System.out.println(C.getCustId()+" "+C.getCustName());
	    	
	    }
	    
		
	}

}
class Customer{
	private int custId;
	private String custName;
	public Customer() {
		System.out.println("Customer Default");
	}
	
	public Customer(int custId, String custName) {
		super();
		this.custId = custId;
		this.custName = custName;
	}

	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	
}