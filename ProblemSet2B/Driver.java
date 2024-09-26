
import java.util.Scanner;

class Driver {

   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      StringTools sTools = new StringTools();
/*
System.out.println("lastLetter test cases:");
      System.out.println("Enter a word with at least one character: ");
      String answer = input.nextLine();
	System.out.println("The last letter is " + sTools.lastLetter(answer));
System.out.println("---------------------");
System.out.println("format phone number");
      System.out.println("Enter phone number: ");
      String answer1 = input.nextLine();
	System.out.println("The formated number is " + sTools.formatPhoneNumber(answer1));
System.out.println("---------------------");

System.out.println("middle three characters");
      System.out.println("Enter word three or more digit word: ");
      String answer2 = input.nextLine();
	System.out.println("" + sTools.middleThree(answer2));
System.out.println("---------------------");

System.out.println("swap last two letters");
      System.out.println("Enter a word with at least two letters: ");
      String answer3 = input.nextLine();
	System.out.println("" + sTools.swapLastTwo(answer3));
System.out.println("---------------------");
*/
System.out.println("Front again");
      System.out.println("Enter a word: ");
      String answer4 = input.nextLine();
      System.out.println("Enter number");
      int answer5 = input.nextInt();
	System.out.println("" + sTools.frontAgain(answer4, answer5));
System.out.println("---------------------");



   }
}
