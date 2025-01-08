public class Fraction {

    //Instance variables
    private int numerator;
    private int denominator; 

    //---------------------------Constructors----------------------------------

    //Default Constructor
    public Fraction (){

        numerator = 1;
        denominator = 7; 

    }

    //Parameterized Constructor
    public Fraction (int num, int denom){

        
        setNum(num); 
        setDenom(denom); 
        

    }

    //Constructor that takes in string

    public Fraction (String Frac){

        numerator = Integer.parseInt(Frac.substring(0, Frac.indexOf("/")));

        if(Integer.parseInt(Frac.substring(Frac.indexOf("/")+1)) == 0){

            System.out.println("Error: Denominator cannot be zero");
            denominator = 1; 

        } else {

            denominator = Integer.parseInt(Frac.substring(Frac.indexOf("/")+1));;    

        }

    }

    //Copy Constructor
    public Fraction (Fraction myFrac){

        numerator = myFrac.numerator;
        denominator = myFrac.denominator; 

    }

    //-------------------------Accessor Methods----------------------------------

    public int getNum(){

        return numerator;   

    }

    public int getDenom(){

        return denominator; 

    }

    public String toString(){

        return numerator + "/" + denominator; 

    }

    public double toDouble(){

        return (double)numerator/denominator; 

    }

    /*
    reduce() - a method for reducing the Fraction object to lowest terms.  
    This can be a void method with no parameters.

    setNum() and setDenom() - methods for changing the values of the 
    numerator and denominator
     */
    
    public void reduce(){
        int factor = GCD(numerator, denominator);
        numerator = numerator/factor;
        
    }
    
    private int GCD(int n, int d){
        
        while(d != 0){
            
            
            
        }
        
    }
    
    
    
    public void setDenom(int denom){
        
        if(denom == 0){

            System.out.println("Error: Denominator cannot be zero");
            denom = 1; 

        } else {

            denominator = denom;    

        }
        
    }

    public void setNum(int num){
        
        numerator = num; 
        
    }

    
    
}