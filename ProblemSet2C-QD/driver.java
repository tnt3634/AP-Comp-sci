import java.util.Scanner;
public class driver{

    public static void main(String[] args) {
        OrderedPair p1, p2; 
        Scanner input = new Scanner(System.in);

        Formulas f = new Formulas();
        p1 = new OrderedPair();
        p2 = new OrderedPair(1,5);
        /*
        System.out.println("If ordered pair is 0,0"); 
        System.out.println(p1.toString());
        System.out.println("X value --> " + p1.getX());
        System.out.println("Y value --> " + p1.getY());
        System.out.println(" ");
        //--------------------------------------------
        System.out.println("if ordered pair is 1,5");
        System.out.println(p2.toString());
        System.out.println("X value --> " + p2.getX());
        System.out.println("Y value --> " + p2.getY());
        System.out.println(" ");
        //--------------------------------------------
        System.out.println("Finding roots of ax^2 + bX + c");
        System.out.print("Enter a = ");
        Double a = input.nextDouble();
        System.out.print("Enter b = ");
        Double b = input.nextDouble();
        System.out.print("Enter c = ");
        Double c = input.nextDouble();
        System.out.println(f.findQuadraticRoots(a, b, c));
        System.out.println(" ");
        //--------------------------------------------

        System.out.println("Finding slope between x1,y1 and x2, y2");
        System.out.print("Enter x1 = ");
        Double x1 = input.nextDouble();
        System.out.print("Enter x2 = ");
        Double x2 = input.nextDouble();
        System.out.print("Enter y1 = ");
        Double y1 = input.nextDouble();
        System.out.print("Entefr y2 = ");
        Double y2 = input.nextDouble();
        System.out.println("the slope between " + "("+ x1 + "," + y1 + ") and (" + x2 + "," + y2 + ") is " + f.findSlope(x1, x2, y1, y2));
        System.out.println(" ");
        //-----------------------------------------------

        
         
        SUM OF AN ARITHMETIC SERIES
        Number of terms: 5
        Starts with: 1.0
        Increases by: 1.0
        The sum of the first 5 terms of an arithmetic series that starts with 1.0 and increases by 1.0 is 15.0

         */
        System.out.println("Sum of an arithmic series");
        System.out.print("Enter number of terms = ");
        Double at = input.nextDouble();
        System.out.print("Enter starting value = ");
        Double d = input.nextDouble();
        System.out.print("Enter Increase amount = ");
        int k = input.nextInt();

        System.out.println("The sum of the first " + at + " terms of an arithmetic series that starts with " + d + " and increases by " +
        k + " is " + f.findArithmeticSeriesSum(at, d, k));
        System.out.println(" ");

       
    }
}