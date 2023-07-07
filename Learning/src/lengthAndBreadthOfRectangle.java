class Area{
   int area;
	public int calArea(int l,int b){
		area=l*b;
		return area;
	}
}
public class lengthAndBreadthOfRectangle {
public static void main(String[] args) {
	Area a =new Area();
	System.out.println(a.calArea(20,30));
}
}
