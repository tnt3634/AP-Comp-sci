
public class StdDraw3 {
    public static void main (String[] args) {

        StdDraw.setScale(0, 500);
        int x = 250;
        int y = 500;
        int z = 250;

        while (y >= 0){
            StdDraw.setPenRadius(0.02);
            if (y % 20 == 0){
                StdDraw.circle(x, z, y); 
            }
            y -= 10;

        }

    }
}
