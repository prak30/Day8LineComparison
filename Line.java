
public class Line {
	Point p1, p2, p3, p4;

	public double getLengthOne() {
		return (double) Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));

	}

	public double getLengthTwo() {
		return (double) Math.sqrt(Math.pow(p3.x - p4.x, 2) + Math.pow(p3.y - p4.y, 2));
	}

	public void checkEquality(Double x, Double y) {
		if (x.equals(y)) {
			System.out.println("both lines equal");
		} else {
			System.out.println("both lines not equal");
		}
	}
		
		public void compareLines(Double x, Double y) {
			 int check = x.compareTo(y);
	         if (check > 0)
	         {
	        	 System.out.println("line1 is greater than line2" );
	         }
	         else if (check < 0)
	         {
	        	 System.out.println("line2 is greater than line 1" );
	         }
	         else
	         {
	        	 System.out.println("line1 equal to line2" );
	         }

		}
	}
	

