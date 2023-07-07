
public class Revesearray {
public static void main(String[] args) {
	int[] array= {2,4,5,7};
	System.out.println("original array");
	printArray(array);
	reverseArray(array);
	System.out.println("Reversed array");
	printArray(array);
	
}

private static void reverseArray(int[] array) {
	int start=0;
	int end=array.length-1;
	while(start<end) {
		int temp=array[start];
		array[start]=array[end];
		array[end]=temp;
		start++;
		end--;
	}
	
}

private static void printArray(int[] array) {
	for(int element:array) {
		System.out.println(element+ "");
		
	}
	System.out.println();
	
}
}
