
public class Formulas {

    
    public OrderedPair findQuadraticRoots (double a, double b, double c) {
        double xMax = (b * -1 + Math.sqrt(Math.pow(b,2) - (4 * a * c)))/(2*a);
        double xMin = (b * -1 - Math.sqrt(Math.pow(b,2) - (4 * a * c)))/(2*a);
        OrderedPair quadF = new OrderedPair(xMax, xMin);
        return quadF; 

    }

    public double findSlope (double x1, double y1, double x2, double y2){
        double slopeform = (y2 - y1)/(x2-x1);
        double slope = slopeform; 
        return slope;

    }
    
    public OrderedPair findMidpoint (double xx1, double xx2, double yy1, double yy2) {
        double xMid = (xx1 + xx2)/2;
        double yMid = (yy1 + yy2)/2;
        OrderedPair midP = new OrderedPair(xMid, yMid);
        return midP; 

    }
    
    public double findArithmeticSeriesSum (double at, double d, int k){
         
        double fas = (double) k/2 * (2 * at + (k-1) * d);
        return fas; 
    }
    
    public double findGeometricSeriesSum (double aG, double r, int kG){
        //a * (1-rk)/(1-r)
        double gas = aG * (   (1-(Math.pow(r, kG) ) )/(1-r));
        return gas;
    
    }
    
    public int rollDie (int sides){
        int randomside = (int) (Math.random()*sides) + 1;
        return randomside;
        
    }
    

    
}