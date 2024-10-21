
public class StdDraw1 {
    public static void main (String[] args) {
        StdDraw.setScale(0, 500);
        int x = 0;
        int y = 0;
        while (x <= 500){
            StdDraw.line(x, 0, x, 500);
            StdDraw.line(0, y, 500, y);
            x += 20;
            y += 20;
        }

    }
}
