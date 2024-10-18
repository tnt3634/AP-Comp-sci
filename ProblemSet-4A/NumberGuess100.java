import java.util.Scanner;

public class NumberGuess100
{
    
  

    public static void main(String[] args) {
        
        System.out.println("guess number between 0 and 100");
        Scanner in = new Scanner(System.in);
        int rand = (int)(Math.random()*100) + 1;
        int guess = -1;
        int tries = 0;
        while (guess != rand) {
            
            guess = in.nextInt();
            if(guess > rand) System.out.println("Too high try lower");
            if(guess < rand) System.out.println("Too low try higher");
            
            tries++;
        }
        System.out.println("Correct guess! you took: " + tries + " tries!");
    }
    
    
}
