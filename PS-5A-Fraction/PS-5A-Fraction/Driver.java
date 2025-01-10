public class Driver{

    public static void main (String[] args){

        Fraction f1 = new Fraction (1, 2);
        Fraction f2 = new Fraction ();
        Fraction f4 = new Fraction ("5/11");
        Fraction copy = new Fraction (f1);
        Fraction reduceTest = new Fraction (306,1056);
        //------------------------------
        System.out.println(copy.getNum());
        System.out.println(copy.getDenom());
        System.out.println(copy.toString());
        System.out.println(copy.toDouble());
        //------------------------------
        reduceTest.reduce();
        System.out.println(reduceTest);
        f1.setDenom(78);
        System.out.println(f1);

        Fraction half = new Fraction(1,2);
        Fraction third = new Fraction (1,3);
        //Fraction sum = Fraction.multiply(half, third);

        
    }
}