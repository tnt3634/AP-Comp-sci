
/**
 * Write a description of class Driver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Driver{
   

    public static void main (String[] args) {
        System.out.println(Review.textToString("positiveReview.txt")); 
        System.out.println("Owners response: ");
        System.out.println(Review.fakeReview("PositiveReview.txt"));
    }
}
