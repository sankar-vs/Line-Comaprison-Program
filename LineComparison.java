import java.util.Scanner;
public class LineComparison {
	public static void main(String[] args) {
                //Creating a Scanner Obj for multiple uses
		Scanner sc = new Scanner(System.in);
                System.out.println("Modelling a Line based on (x,y) co-ordinates");
		//Asking User to enter the co-ordinates
                System.out.println("Enter (x1,y1) co-ordinates: ");
                float x1 = sc.nextFloat(),y1 = sc.nextFloat();
                System.out.println("Enter (x2,y2) co-ordinates: ");
                float x2 = sc.nextFloat(),y2 = sc.nextFloat();
		//Calculating the Modelled Line Length
                double lengthLine1 = Math.sqrt( Math.pow((x2-x1),2) + Math.pow((y2-y1),2 ) );
                System.out.println("Length of the modelled Line: "+lengthLine1);
        }
}
