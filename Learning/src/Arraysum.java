
public class Arraysum {
public static void main(String[] args) {
	int[] arr= {2,4,7,8};
	int sum=calculateSum(arr);
	System.out.println("sum of elements in array:" +sum);
}

private static int calculateSum(int[] arr) {
	int sum=0;
	for(int element:arr) {
		sum+=element;
	}
	return sum;
}
}
