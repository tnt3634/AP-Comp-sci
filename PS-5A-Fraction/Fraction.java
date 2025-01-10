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

    //-------------------------Mutator Methods----------------------------------

    public void reduce(){
        int factor = GCF(Math.abs(numerator),Math.abs(denominator));
        numerator = numerator/factor;
        denominator = denominator/factor; 
    }

    private int GCF(int n, int d){
        while (d != 0) {
            int remainder = n % d;
            n = d;
            d = remainder;
        }
        return n;
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

    //-------------------------Static Methods----------------------------------

    public static Fraction multiply(Fraction a, Fraction b){
        int Num = a.numerator * b.numerator;
        int Denom = a.denominator * b.denominator;
        Fraction c = new Fraction (Num, Denom);
        c.reduce();
        return new Fraction (c);        

    }
    
    public static Fraction divide(Fraction a, Fraction b){
        int Num = a.numerator * b.denominator;
        int Denom = a.denominator * b.numerator;
        Fraction c = new Fraction (Num, Denom);
        c.reduce();
        return new Fraction (c);        

    }
    
    public static Fraction add(Fraction a, Fraction b){
        int Num = (a.denominator * b.numerator) + (b.denominator * a.numerator);
        int Denom = (a.denominator * b.denominator);
        Fraction c = new Fraction (Num, Denom);
        c.reduce();
        return new Fraction (c);        

    }
    
    public static Fraction subtract(Fraction a, Fraction b){
        int Num = (b.denominator * a.numerator) - (a.denominator * b.numerator);
        int Denom = (a.denominator * b.denominator);
        Fraction c = new Fraction (Num, Denom);
        c.reduce();
        return new Fraction (c);        

    }

}