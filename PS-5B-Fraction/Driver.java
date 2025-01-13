
public class Driver{

    public static void main (String[] args){
        //PART ONE
        Fraction First = new Fraction();
        Fraction Second = new Fraction();
        
        Fraction MILU = new Fraction(355, 113);
        
        /*
        MILU.toDouble(); 
        //Difference between
        final double EPSILON = Math.abs( Math.PI - MILU.toDouble());
        //while the difference between PI and the new milu is greater 
        //or equal to EPSILON keep tweaking MILU to get closer to PI
        while (Math.abs(Math.PI - MILU.toDouble()) >= EPSILON){
            if(MILU.toDouble() > Math.PI){

                MILU.setDenom(MILU.getDenom() + 1); 

            } else {

                MILU.setNum(MILU.getNum() + 1); 

            }
        }
        System.out.println(MILU); 
        */
       
        //PART TWO
        
        System.out.println("Welcome to fraction quiz");
        System.out.println("Answers should be in lowest terms...Begin!");
        
        First.randFrac();
        Second.randFrac(); 
        First.reduce();
        Second.reduce();
        
        System.out.println(First + " random opp - TBA " + Second);
    
        
    }

}