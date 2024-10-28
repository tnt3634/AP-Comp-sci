
public class OrderedPair{
    
    double x,y;
    public OrderedPair(){
        
        x = 0;
        y = 0;
        
    }
    
    public OrderedPair(double X, double Y){
        
        x = X;
        y = Y;
        
    }
    
    public double getX(){
        
        return x;
        
    }
    
    public double getY(){
        
        return y;
        
    }
    
    public String toString(){
        
        return ("(" +  x + "," + y + ")");
        
    }
    
    
}