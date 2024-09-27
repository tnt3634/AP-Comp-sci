
public class Formulas {
    
    
    
    public OrderedPair findQuadraticRoots (double a, double b, double c) {
        double xMax = (b * -1 + Math.sqrt(Math.pow(b,2) - (4 * a * c)))/(2*a);
        double xMin = (b * -1 - Math.sqrt(Math.pow(b,2) - (4 * a * c)))/(2*a);
        OrderedPair quadF = new OrderedPair(xMax, xMin);
        return quadF; 
        
    }
    
    public double findSlope (OrderedPair A, OrderedPair B){
        
        OrderedPair slope = new OrderedPair(); 
        return 1;
        
    }

    
    
    
}