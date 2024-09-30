import java.util.Scanner;
public class driver{

    public static void main(String[] args) {
        OrderedPair p1, p2; 
        Scanner input = new Scanner(System.in);

        Formulas f = new Formulas();
        p1 = new OrderedPair();
        p2 = new OrderedPair(1,5);
        
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
        System.out.println("Sum of an arithmic series");
        System.out.print("Enter number of terms = ");
        int k = input.nextInt();
        System.out.print("Enter starting value = ");
        Double d = input.nextDouble();
        System.out.print("Enter Increase amount = ");
        Double at = input.nextDouble();
        System.out.println("The sum of the first " + k + " terms of an arithmetic series that starts with " + d + " and increases by " +
        at + " is " + f.findArithmeticSeriesSum(at, d, k));
        System.out.println(" ");
        //--------------------------------------------------------
        System.out.println("Sum of an geometric series");
        System.out.print("Enter number of terms = ");
        int kG = input.nextInt();
        System.out.print("Enter starting value = ");
        Double aG = input.nextDouble();
        System.out.print("Rate of growth = ");
        Double r = input.nextDouble();
        System.out.println("The sum of the first " + kG + " terms of a finite"+ 
        " geometric series that starts with " + aG + " and increases by a " + 
        "rate of " + r + " is "  + f.findGeometricSeriesSum(aG, r, kG));
        System.out.println(" ");
        //---------------------------------------------------------------
        System.out.println("Dice roller");
        System.out.print("How many sides does this dice have = ");
        int sides = input.nextInt();
        System.out.print("Rolling a " + sides + "-sided die... you got " +
        f.rollDie(sides));

        }

        }
        