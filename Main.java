

public class Main {
public static void main(String[] args) {
	
		Point p1 = new Point();
		p1.x = 2;
		p1.y = 4;
		Point p2 = new Point();
		p2.x = 4;
		p2.y = 8;
		Point p3 = new Point();
		p3.x = 2;
		p3.y = 6;
		Point p4 = new Point();
		p4.x = 4;
		p4.y = 8;
		
		Line l1 = new Line();
		l1.p1 = p1;
		l1.p2 = p2;
		Line l2 = new Line();
		l2.p3 = p3;
		l2.p4 = p4;
		
		Double x = l1.getLengthOne();
		System.out.println("length of Line1 " +x);
		Double y = l2.getLengthTwo();
		System.out.println("length of Line2 " +y);
		if(x.equals(y))
		{
			System.out.println("both lines equal");
		}
		else
		{
			System.out.println("both lines not equal");
		}
		
		
	}

}
