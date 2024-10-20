
public class StdDraw3 {
    public static void main (String[] args) {
        
        StdDraw.setScale(0, 500);
        int x = 250;
        int y = 10;
        int z = 250;
        while (x <= 500 && y <= 500){
	    if (y % 20 == 0){
	    StdDraw.setPenColor(StdDraw.WHITE); 
	    }else {
	    StdDraw.setPenColor(StdDraw.BLACK);  
	    }
            StdDraw.circle(x, z, y); 
            //z += 2;
            //x += 2;
            y += 20;
        }
	    
        /*    
        StdDraw.setScale(0, 500);

        StdDraw.line(0, 500, 500, 0);
        StdDraw.line(0, 0, 500, 500);
        StdDraw.square(250, 250, 100);
        StdDraw.circle(250, 250, 100);

        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.filledCircle(100, 100, 50);
        StdDraw.setPenColor(StdDraw.GREEN);
        StdDraw.filledCircle(100, 400, 50);
        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.filledCircle(400, 400, 50);

        StdDraw.setPenColor(StdDraw.YELLOW);
        StdDraw.filledCircle(400, 100, 50);
         */
    }
}
