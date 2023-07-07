 class Computer{
	public void playMusic() {
		System.out.println("play Music");
	}
	public String getPen(int cost) {
		if(cost<10) {
			System.out.println("no such pen");
		}else {
			System.out.println("give pen:"+cost);
		}
//		System.out.println("give pen:"+cost);
		return "pen";
	}
}
public class ObjectCom {
public static void main(String[] args) {
	Computer com = new Computer();
	com.playMusic();
	com.getPen(20);
}
}
