public class Driver{

    public static void main (String[] args){

        Fraction f1 = new Fraction (1, 2);
        Fraction f2 = new Fraction ();
        Fraction f4 = new Fraction ("5/11");
        Fraction copy = new Fraction (f1);
        Fraction reduceTest = new Fraction (306,1056);
        //----------------------------------------------------------------------
        System.out.println(copy.getNum());
        System.out.println(copy.getDenom());
        System.out.println(copy.toString());
        System.out.println(copy.toDouble());
        //----------Reduce.SetNum.SetDenom----------------------------------------------------------------
        reduceTest.reduce();
        System.out.println(reduceTest);
        f1.setDenom(78);
        System.out.println(f1);
        //----------Mult.Divide.Add.Subtract----------------------------------
        Fraction half = new Fraction(1,2);
        Fraction third = new Fraction (1,3);
        //Mult
        Fraction mult = Fraction.multiply(half, third);
        System.out.println(mult);
        //Div
        Fraction div = Fraction.divide(half, third);
        System.out.println(div);
        //Add
        Fraction add = Fraction.add(half, third);
        System.out.println(add);
        //Sub
        Fraction sub = Fraction.subtract(half, third);
        System.out.println(sub);

    }
}