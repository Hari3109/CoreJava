enum Status{
//	 we can define enum in which all are constants and it is predefined
	Running,rejected,pending,succesed;
//	everthing in java is class
//	here we are creating enum objects so we can call them directly 
//	thode are called as named constants
}
public class Enums {
public static void main(String[] args) {
	int i=5;
	Status s=Status.Running;
	System.out.println(s.ordinal());
	Status[] y=Status.values();
	for(Status ele:y) {
	System.out.println(ele+" : " +ele.ordinal());
	}
//	all values in status are numbered from 0 we can also use that by calling ordinal key word
//	here the place where the running is placed is at 0 so it will give zero as output
//	to get all the values we can declare that as status.value
//	since status of value returns Array we have to change the type as Array
	if(s==Status.succesed) {
		System.out.println("all good");
	}
	else if(s==Status.pending) {
		System.out.println("need to approved");
	}
	else if(s==Status.Running) {
		System.out.println("Running fine");
	}
	else {
		System.out.println("Got rejected");
	}
	switch(s){
	case Running:
		System.out.println("Running fine");
		break;
		//in this way we can use switch statement also
	}
}
}
