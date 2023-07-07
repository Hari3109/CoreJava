package LambdaExpressions;
interface sumCal{
	int sum(int a,int b);
}
public class sumOfIntegers  {
public static void main(String[] args) {
	sumCal sumc=(x,y)->x+y;
	int res=sumc.sum(5780,7853);
	System.out.println("Result:"+res);
}
}
