package Practice;

public class arraay {
   public static void main(String[]args) {
	   int nums[]=new int[4];
	   nums[0]=5;
	   nums[1]=7;
	   nums[2]=8;
	   nums[3]=3;
	   //nums[4]=5;
	   System.out.println(nums[3]);
	   for(int i=1;i<30;i++) {
		   System.out.println(i);
	   }
		 /* int no[]= {12,34,67,98};
		  int search=67;
		  boolean isFound=searchElement( no,search);
		  System.out.println(isFound);   
	}

 static boolean searchElement(int no[],int e) {
	 for(int i=0;i<no.length;i++) {
		 if(no[i]==e) {
			 return true;
		 }
		 
	 }
	 return false;
	 
 }
}*/
	 
     int no[]= {23,45,23,67,23};
     int search=23;
     int c=count(no,search);
    System.out.println(c);
   }
   static int count(int no[],int s) {
	   int count=0;
   
	   for(int i=0;i<no.length;i++) {
		   if(s==no[i]) {
			   count++;
		   }
		   //return count;
	   }
	   return count++;
   }
}