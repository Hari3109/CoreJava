package CodingChallenge;
import java.util.ArrayList;
public class Challenge20 {
public static void main(String[] args) {
//	removing elements of arraylist
    ArrayList<Integer>a=new ArrayList<>();
    a.add(10);
    a.add(2);
    a.add(20);
    a.add(2);
    a.add(30);
    a.add(2);
    a.remove(1);
    a.remove(4);
    System.out.println(a);
//    Arraylist provides two types of methods removes value at the index it is int type
//    remove method with object directly remove the specified element in the arralist
}
}
