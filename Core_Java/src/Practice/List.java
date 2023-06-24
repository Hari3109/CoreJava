package Practice;

import java.util.ArrayList;

public class List {
public static void main(String[] args) {
    ArrayList<String>list1=new ArrayList<String>();
    list1.add("harry");
    list1.add("santhu");
    list1.add("Ammu");
    System.out.println(list1);
    list1.remove("harry");
    System.out.println(list1);
    list1.add(0,"dev");
    System.out.println(list1);
    boolean isFound=list1.contains("Ammu");
    System.out.println(isFound);
    isFound=list1.contains("harry");
    System.out.println(isFound);
}
}
