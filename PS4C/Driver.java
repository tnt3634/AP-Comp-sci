
/**
 * Write a description of class Driver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Driver{
    /*
    public static void main (String[] args) {
    String a = ""; 
    a = Review.textToString("SimpleReview.txt");
    a = Review.removePunctuation(a);

    while (a.indexOf(" ") >= 0){

    int fsi = a.indexOf(" ");    
    String word = a.substring(0, fsi);
    a = a.substring(fsi + 1); 

    }

    System.out.print(a);  

    }
     */

    public static void main (String[] args) {
        System.out.println(Review.fakeReview("SimpleReview.txt"));
    }
}
