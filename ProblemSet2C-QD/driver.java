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
    System.out.println("Finding quadratic of 1x^2 + 2X -3");
    System.out.println(f.findQuadraticRoots(1,2,-3));
    System.out.println(" ");
    
    
}
}