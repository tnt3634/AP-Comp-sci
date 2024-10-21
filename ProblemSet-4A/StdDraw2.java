
public class StdDraw2 {
    public static void main (String[] args) {
        StdDraw.setScale(0, 500);
        int x = 0;

        while (x <= 500){
            StdDraw.line(0, x, x, 500);
            StdDraw.line(x, 0, 500, x);
            x += 20;

        }

    }
}

