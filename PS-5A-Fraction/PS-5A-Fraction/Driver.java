public class Driver{

    public static void main (String[] args){

        Fraction f1 = new Fraction (1, 2);
        Fraction f2 = new Fraction ();
        Fraction f4 = new Fraction ("5/11");
        Fraction copy = new Fraction (f1);
        
        
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f4);
        System.out.println(copy);
        
        System.out.println(copy.getNum());
        System.out.println(copy.getDenom());
        System.out.println(copy.toString());
        System.out.println(copy.toDouble());
        
       
        
        
        
    }
    
}