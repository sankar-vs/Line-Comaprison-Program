import java.util.Scanner;
public class LineComparison {
	public static void compareTo(double Line1, double Line2) {
		if ( Line1 > Line2 )
 	               System.out.println("Modelled Length of Line-1 is greater than the Length of Line-2");
                else
                       System.out.println("Modelled Length of Line-2 is greater than the Length of Line-1");
	}
	public static double calculateLength() {
		//Creating a Scanner Obj for multiple uses
                Scanner sc = new Scanner(System.in);
                //Asking User to enter Line co-ordinates
                System.out.println("Enter (x1,y1) co-ordinates: ");
                float x1 = sc.nextFloat(),y1 = sc.nextFloat();
                System.out.println("Enter (x2,y2) co-ordinates: ");
                float x2 = sc.nextFloat(),y2 = sc.nextFloat();

		//Calculating the Modelled Line Length
                double length = Math.sqrt( Math.pow( (x2 - x1),2) + Math.pow((y2 - y1),2 ) );
		return length;
	}


	public static void main(String[] args) {
                System.out.println("Modelling Line-1 based on (x,y) co-ordinates");
		
		double lengthLine1 = calculateLength();

		System.out.println("Modelling Line-2 based on (x,y) co-ordinates");
		//Calculating the Modelled Line-2 Length
		double lengthLine2 = calculateLength();

		//Checking Equality
		if ( lengthLine1 == lengthLine2 ) {
                        System.out.println("The two modelled lines are equal in Length.");
                }
                else {
                        System.out.println("The two modelled lines are un-equal in Length.");
			//Comparison of two line to find the greatest
			compareTo(lengthLine1,lengthLine2);
                }
		//Printing the Length of two Modelled Lines
                System.out.println("Length of the modelled Line-1: "+lengthLine1);
                System.out.println("Length of the modelled Line-2: "+lengthLine2);
        }
}
