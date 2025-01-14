import java.util.Scanner;
public class Driver{

    public static void main (String[] args){
        //PART ONE

        /*
        Fraction MILU = new Fraction(355, 113);
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

        boolean playing = false; 
        int rounds = 0;
        int right = 0;
        
        String opp; 
        Fraction First = new Fraction();
        Fraction Second = new Fraction();
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to fraction quiz");
        System.out.println("Answers should be in lowest terms. Say 'quit' to leave");
        System.out.println("Begin?... y/n");
        String wp = in.nextLine();
        if(wp.equals("y")){
            
            playing = true;
            
        }else{ 
            System.out.println("Play anyway");
            playing = true;
            
        }
        while (playing == true) {
            
            int randomOp = (int)(Math.random()*4) + 1;
            First.randFrac();
            Second.randFrac(); 
            First.reduce();
            Second.reduce();
            if(randomOp == 1){ 
                System.out.println(First + " + " + Second);
                Fraction ans = Fraction.add(First, Second);
                ans.toString();
                String answer = in.nextLine();
                if(answer.equals("quit")){
                    playing = false;
                    Fraction results = new Fraction(right, rounds);
                    System.out.println("Your score was: " + results + " and as a percent: " + (int )(100 * results.toDouble() + 0.5) + "%");
                }else if (ans.toString().equals(answer)){
                    System.out.println("Correct!");
                    rounds++;
                    right++;
                } else {
                    System.out.println("WRONG answer is: " + ans);
                    rounds++;
                }

            }else if(randomOp == 2){
                System.out.println(First + " - " + Second);
                Fraction ans = Fraction.subtract(First, Second);
                ans.toString();
                String answer = in.nextLine();
                if(answer.equals("quit")){
                    playing = false;
                    Fraction results = new Fraction(right, rounds);
                    System.out.println("Your score was: " + results + " and as a percent: " +  (int )(100 * results.toDouble() + 0.5) + "%");
                }else if (ans.toString().equals(answer)){
                    System.out.println("Correct!");
                    rounds++;
                    right++;
                } else {
                    System.out.println("WRONG answer is: " + ans);
                    rounds++;
                }

            }else if(randomOp == 3){
                System.out.println(First + " / " + Second);
                Fraction ans = Fraction.divide(First, Second);
                ans.toString();
                String answer = in.nextLine();
                if(answer.equals("quit")){
                    playing = false;
                    Fraction results = new Fraction(right, rounds);
                    System.out.println("Your score was: " + results + " and as a percent: " + (int )(100 * results.toDouble() + 0.5) + "%");
                }else if (ans.toString().equals(answer)){
                    System.out.println("Correct!");
                    rounds++;
                    right++;
                } else {
                    System.out.println("WRONG answer is: " + ans);
                    rounds++;
                }

            }else{
                System.out.println(First + " * " + Second);
                Fraction ans = Fraction.multiply(First, Second);
                ans.toString();
                String answer = in.nextLine();
                if(answer.equals("quit")){
                    playing = false;
                    Fraction results = new Fraction(right, rounds);
                    System.out.println("Your score was: " + results + " and as a percent: " + (int )(100 * results.toDouble() + 0.5) + "%");
                }else if (ans.toString().equals(answer)){
                    System.out.println("Correct!");
                    rounds++;
                    right++;
                } else {
                    System.out.println("WRONG answer is: " + ans);
                    rounds++;
                }

            }
        }

    }
}