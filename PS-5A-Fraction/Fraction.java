public class Fraction {

    //Instance variables
    private int numerator;
    private int denomenator; 

    //---------------------------Constructors----------------------------------

    //Default Constructor
    public Fraction (){

        numerator = 1;
        denomenator = 7; 

    }

    //Parameterized Constructor
    public Fraction (int num, int denom){

        numerator = num;

        if(denom == 0){
            
            System.out.println("Error: Denominator cannot be zero");
            denom = 1; 
            
        } else {

            denomenator = denom;    

        }

    }
    //Constructor that takes in string
    public Fraction (String Fract){

        numerator = Integer.parseInt(Fract.substring(0, Fract.indexOf("/")));
        denomenator = Integer.parseInt(Fract.substring(Fract.indexOf("/"))+1); 

    }

    //Copy Constructor
    public Fraction (Fraction myFrac){

        numerator = myFrac.numerator;
        denomenator = myFrac.denomenator; 

    }

    //-------------------------Accessor Methods----------------------------------

    
    /*
     getNum() and getDenom() - methods that return the values of the numerator 
     and denominator.
     
     toString() - a method that returns the Fraction as a String.  
     For example, the fraction one half should be represented as “1/2”
     
     toDouble() - a method that returns the Fraction as a decimal number.
     For example, the fraction one half should be represented as 0.5
     */
    
    public int getNum(){
        
        return .numerator;
        
    }
    
    public int getDenom(){
        
        return;
        
    }
    
}