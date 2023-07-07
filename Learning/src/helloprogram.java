
public class helloprogram {
	

	public static void main(String[] args) {
		System.out.println("hello world");
		int num = 3;
		int num1=8;
		System.out.println(num+num1);
		System.out.println(num1/num);
		System.out.println(num*num1);
		System.out.println(num1%num);
		float u=6.8f;
		byte k=9;
		System.out.println(u*k);
		double d=789.545;
		System.out.println(d%u);
		char c= '8';
		c++;
		System.out.println(c);
		
		boolean y=true;
		System.out.println(y);
		double i=9e12;
		System.out.println(i);
		/*type Conversion and casting
		conversion of datatype from high to low there  won't be any issue but from low to high it will give u error that the variable int cannot be assigned to byte value to reduce this we have using casting concept 
		in case of byte its range is -128 to 128 right if we are assigning int value of 257 it is beyond the limit value of byte in this case here the concept of modulus comes that means it divide it and store that in percentage
		ex : 257%256 remainder is 1
		
		*/
		float f=5.6f;
		int x=(int)f;
		System.out.println(x);
		int q=267;
		byte r=(byte)q;
		System.out.println(r);
		/*
		 type promotion:
		 when a byte is multiplied with byte then the range of byte increses so java says hey we will promote u to next level ie integer
		 
		 */
		int num0=2;
//		num0=num0+2;
//		num0+=2;
		num0++;//increment (postincrement num++;)  {preincrement ++num;}
		num0--;//decrement
		System.out.println(num0);
		// post increment it will fetch the value of num first in a result it will print the starting assigned value itself at starting i.e 2 from above
//		pre increment it will first increment the value and then gives the result i.e 3 in above case 
		
	}
 
}
	