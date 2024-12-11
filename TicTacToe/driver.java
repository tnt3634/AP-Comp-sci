
import java.util.Scanner; 
import java.util.ArrayList; 
public class driver{

    static String[][] board; 

    public static void main(String[] args) {
          
        Scanner input = new Scanner(System.in);
        initalizeBoard();
        printBoard(); 
        boolean xTurn = true; 
        boolean playing = true; 
        while(playing){
            while(!WinX() && !WinO() && !Tie()){
                if(xTurn){
                    System.out.println("Player 1's turn");
                    System.out.println("Enter move [row],[col]");
                    String a = input.nextLine();

                    //Next 3 lines are checking to see if the inputted value fits on the grid or if the move has
                    //Already been done
                    if(Integer.parseInt(a.substring(0, 1)) > 0 && Integer.parseInt(a.substring(0, 1)) <= 3 ){
                        if(Integer.parseInt(a.substring(2)) > 0 && Integer.parseInt(a.substring(2)) <= 3){
                            if(board[Integer.parseInt(a.substring(0, 1))-1][Integer.parseInt(a.substring(2))-1].equals(" ")){
                                xturn(a);
                                xTurn = false; 
                            } else{

                                xTurn = true;
                                System.out.println("No Cheating");

                            }
                        }
                    } else{

                        xTurn = true;
                        System.out.println("Keep within 3 by 3 grid");
                    }
                } else {
                    System.out.println("Player 2's turn");
                    System.out.println("Enter move [row],[col]");
                    String b = input.nextLine();
                    //Next 3 lines are checking to see if the inputted value fits on the grid or if the move has
                    //Already been done
                    if(Integer.parseInt(b.substring(0, 1)) > 0 && Integer.parseInt(b.substring(0, 1)) <= 3 ){
                        if(Integer.parseInt(b.substring(2)) > 0 && Integer.parseInt(b.substring(2)) <= 3 ){
                            if(board[Integer.parseInt(b.substring(0, 1)) - 1][Integer.parseInt(b.substring(2)) - 1].equals(" ")){
                                oturn(b); 
                                xTurn = true; 
                            } else {

                                xTurn = false;
                                System.out.println("No Cheating");

                            }
                        }
                    }else{

                        xTurn = false;
                        System.out.println("Keep within 3 by 3 grid");
                    } 
                }

            }
            if (WinX()){
                System.out.println("X WINS!");    
            } else if(WinO()){
                System.out.println("O WINS!");
            } else if(Tie()){ 
                System.out.println("ITS A TIE"); 
            }

            System.out.println("Play again? Y/N"); 
            String YN = input.nextLine();
            if (YN.equals( "y") || YN.equals( "Y")){

                initalizeBoard();
                printBoard();   
                playing = true;
            } else {

                playing = false; 
                System.out.println("Thank you for playing");
            }

        }

    }    
    public static void printBoard(){
        for (int row = 0; row < board.length; row++){
            for (int col = 0; col < board[0].length; col++){
                System.out.print("[" + board[row][col] + "]"); 
            }
            System.out.println(); 
        }

    }

    public static void initalizeBoard(){
        board = new String [3][3]; 
        String blank = " "; 
        for (int row = 0; row < board.length; row++){

            for (int col = 0; col < board[0].length; col++){

                board[row][col] = blank; 

            }
        }

    }

    public static boolean Tie(){
        int movecount = 0; 
        for (int row = 0; row < board.length; row++){

            for (int col = 0; col < board[0].length; col++){
                if(board[row][col] != " "){

                    movecount++;
                    if(movecount == 9 && !WinX() && !WinO())return true; 

                }
            }

        }

        return false;  
    }

    public static boolean WinX(){
        if       (XLoc(1,1) && XLoc(2,1) && XLoc(3,1)){
            return true;  
        }else if (XLoc(1,2) && XLoc(2,2) && XLoc(3,2)){
            return true;  
        }else if (XLoc(1,3) && XLoc(2,3) && XLoc(3,3)){
            return true;  
        }else if (XLoc(1,1) && XLoc(1,2) && XLoc(1,3)){
            return true;  
        }else if (XLoc(2,1) && XLoc(2,2) && XLoc(2,3)){
            return true;  
        }else if (XLoc(3,1) && XLoc(3,2) && XLoc(3,3)){
            return true;  
        }else if (XLoc(1,1) && XLoc(2,2) && XLoc(3,3)){
            return true;  
        }else if (XLoc(3,1) && XLoc(2,2) && XLoc(1,3)){
            return true;   
        } else {

            return false;     

        }
    }

    public static boolean XLoc(int row, int col){

        if (board[row - 1][col - 1].equals("X")){
            return true; 
        }else {
            return false; 
        }
    }

    public static boolean WinO(){

        if       (OLoc(1,1) && OLoc(2,1) && OLoc(3,1)){
            return true;  
        }else if (OLoc(1,2) && OLoc(2,2) && OLoc(3,2)){
            return true;  
        }else if (OLoc(1,3) && OLoc(2,3) && OLoc(3,3)){
            return true;  
        }else if (OLoc(1,1) && OLoc(1,2) && OLoc(1,3)){
            return true;  
        }else if (OLoc(2,1) && OLoc(2,2) && OLoc(2,3)){
            return true;  
        }else if (OLoc(3,1) && OLoc(3,2) && OLoc(3,3)){
            return true;  
        }else if (OLoc(1,1) && OLoc(2,2) && OLoc(3,3)){
            return true;  
        }else if (OLoc(3,1) && OLoc(2,2) && OLoc(1,3)){
            return true;   
        } else {

            return false;     

        }
    }

    public static boolean OLoc(int row, int col){

        if (board[row - 1][col - 1].equals("O")){
            return true; 
        }else {
            return false; 
        }
    }

    public static void xturn(String a){
        int row = Integer.parseInt(a.substring(0, 1)); 
        int col = Integer.parseInt(a.substring(2)); 

        board[row-1][col-1] = "X"; 

        printBoard();  
    }

    public static void oturn(String b){

        int row = Integer.parseInt(b.substring(0, 1)); 
        int col = Integer.parseInt(b.substring(2)); 

        board[row-1][col-1] = "O"; 

        printBoard(); 
    }
}

