
public class Main {
public static void main(String[] args) {
	
		Point p1 = new Point();
		p1.x = 4;
		p1.y = 2;
		Point p2 = new Point();
		p2.x = 5;
		p2.y = 7;
		
		Line l1 = new Line();
		l1.p1 = p1;
		l1.p2 = p2;
		
		float x = l1.getLength();
		System.out.println("length" +x);
		
		
	}

}
