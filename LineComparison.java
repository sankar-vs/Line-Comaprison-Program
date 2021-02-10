import java.util.Scanner;
public class LineComparison {
	public static void compareTo(double Line1, double Line2) {
		if ( Line1 > Line2 )
 	               System.out.println("Modelled Length of Line-1 is greater than the Length of Line-2");
                else
                       System.out.println("Modelled Length of Line-2 is greater than the Length of Line-1");
	}

	public static void main(String[] args) {
                //Creating a Scanner Obj for multiple uses
		Scanner sc = new Scanner(System.in);
                System.out.println("Modelling a Line based on (x,y) co-ordinates");
		//Asking User to enter Line-1 co-ordinates
                System.out.println("Enter (x1,y1) co-ordinates for Line-1: ");
                float x1_Line1 = sc.nextFloat(),y1_Line1 = sc.nextFloat();
                System.out.println("Enter (x2,y2) co-ordinates for Line-1: ");
                float x2_Line1 = sc.nextFloat(),y2_Line1 = sc.nextFloat();

		//Asking user to enter Line-2 co-ordinates
		System.out.println("Modelling Line-2 based on (x,y) co-ordinates");
                System.out.println("Enter (x1,y1) co-ordinates for Line-2: ");
                float x1_Line2 = sc.nextFloat(),y1_Line2 = sc.nextFloat();
                System.out.println("Enter (x2,y2) co-ordinates for Line-2: ");
                float x2_Line2 = sc.nextFloat(),y2_Line2 = sc.nextFloat();

		//Calculating the Modelled Line-1 Length
                double lengthLine1 = Math.sqrt( Math.pow((x2_Line1-x1_Line1),2) + Math.pow((y2_Line1-y1_Line1),2 ) );

		//Calculating the Modelled Line-2 Length
		double lengthLine2 = Math.sqrt( Math.pow((x2_Line2-x1_Line2),2) + Math.pow((y2_Line2-y1_Line2),2 ) );

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
