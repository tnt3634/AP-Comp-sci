
public class StdChaosGame {
    public static void main (String[] args) {

        OrderedPair p1, p2, p3;
        int x = 0;
        int y = 0;
        StdDraw.setScale(0, 1);
        
        StdDraw.setPenRadius(0.02);
        p1 = new OrderedPair(0, 1);
        p2 = new OrderedPair(0.5, 0);
        p3 = new OrderedPair(1, 1);

        StdDraw.point(p1.getX(), p1.getY());
        StdDraw.point(p2.getX(), p2.getY());
        StdDraw.point(p3.getX(), p3.getY());
        

        
    }
}