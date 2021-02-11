import java.util.Scanner;
public class LineComparison {

	private final double x1;
	private final double x2;
	private final double y1;
	private final double y2;

	public LineComparison( double x1, double y1, double x2, double y2 ) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
	public static void compareTo(double Line1, double Line2) {
		//Checking Equality
                if ( Line1 == Line2 ) {
                        System.out.println("The two modelled lines are equal in Length.");
                }
                else {
                	System.out.println("The two modelled lines are un-equal in Length.");
                        //Comparison of two line to find the greatest
			if ( Line1 > Line2 )
 	               		System.out.println("Modelled Length of Line-1 is greater than the Length of Line-2");
                	else
                        	System.out.println("Modelled Length of Line-2 is greater than the Length of Line-1");
		}
	}
	public static double calculateLength(double x1, double y1, double x2, double y2) {
	/*	//Creating a Scanner Obj for multiple uses
                Scanner sc = new Scanner(System.in);
                //Asking User to enter Line co-ordinates
                System.out.println("Enter (x1,y1) co-ordinates: ");
                float x1 = sc.nextFloat(),y1 = sc.nextFloat();
                System.out.println("Enter (x2,y2) co-ordinates: ");
                float x2 = sc.nextFloat(),y2 = sc.nextFloat();	*/

		//Calculating the Modelled Line Length
                double length = Math.sqrt( Math.pow( (x2 - x1),2) + Math.pow((y2 - y1),2 ) );
		return length;
	}


	public static void main(String[] args) {
                //System.out.println("Modelling Line-1 based on (x,y) co-ordinates");
		LineComparison line1 = new LineComparison(1,4,5,1);
		double lengthLine1 = calculateLength(line1.x1,line1.y1,line1.x2,line1.y2);

		LineComparison line2 = new LineComparison(5,1,1,4);
		double lengthLine2 = calculateLength(line2.x1,line2.y1,line2.x2,line2.y2);

		//Comparison of two line to find the greatest
		compareTo(lengthLine1,lengthLine2);

		//Printing the Length of two Modelled Lines
                System.out.println("Length of the modelled Line-1: "+lengthLine1);
                System.out.println("Length of the modelled Line-2: "+lengthLine2);
        }
}
