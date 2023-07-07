
public class Arrayconcept {
//Array: it is used to store multiple value that are of similar data types arranged in continous memory
//	int num[]={5,6,7};
//	int num[]=new int[5];
	public static void main(String[] args) {
		int num[]= {1,5,8,0};
		int sum=0;
		for(int element:num) {
			sum+=element;
//			System.out.println(sum+=element);
		}
//		System.out.println(num[1]);
		System.out.println(sum);
//        num[2]=6;
        System.out.println(num[2]);
        System.out.println(sum);
       int nums[][]=new int[3][4]; 
       for(int i=0;i<3;i++) {
    	   for(int j=0;j<4;j++) {
    		   nums[i][j]=(int)(Math.random()*10);
    		   System.out.println(nums[i][j]+" : "+j);
    	   }
    	   System.out.println();
    	   for (int n[]:nums) {
    		   for(int m:n) {
    			   System.out.println(m);
    		   }
    	   }
       }
       
       
	}
//	multi dimenional array : it is array of array
//	 int nums[][]=new int[3][4];
//	enhance for loop: here in multi dimensional array 1 element will be 1 dimensional array in that so here we use enhance for loop  
//	jagged array : it is like we don't specify the  multi dimensional array size
//	int nums[][]=new int[3][];    (jagged)
//	nums[0]=new int[4];
//	nums[1]=new int[5];
//	nums[2]=new int[6];
//	drawbacks of array:
//	* size of array is fixed
//	*traversing consumes time
//	*objects of different types can't stored in a single string
}
