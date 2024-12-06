
import java.util.Scanner; 
import java.util.ArrayList; 
public class driver{

    static String[][] board; 

    public static void main(String[] args) {
        PlayTicTacToe p1x, p2o;   
        Scanner input = new Scanner(System.in);
        initalizeBoard();
        printBoard(); 
        boolean xTurn = true; 
        boolean playing = true; 

        while(playing){
            if(xTurn){
                System.out.println("Player 1's turn");
                System.out.println("Enter move [row],[col]");
                String a = input.nextLine();
                if(Integer.parseInt(a.substring(0, 1)) >= 0 && Integer.parseInt(a.substring(0, 1)) <= 3 ){
                    if(Integer.parseInt(a.substring(2)) >= 0 && Integer.parseInt(a.substring(2)) <= 3){
                        xturn(a);
                        xTurn = false; 
                    }
                } else{

                    xTurn = true;
                    System.out.println("Did you not pass math go again");
                }
            } else {
                System.out.println("Player 2's turn");
                System.out.println("Enter move [row],[col]");
                String b = input.nextLine();
                if(Integer.parseInt(b.substring(0, 1)) >= 0 && Integer.parseInt(b.substring(0, 1)) <= 3 ){
                    if(Integer.parseInt(b.substring(2)) >= 0 && Integer.parseInt(b.substring(2)) <=3 ){
                        oturn(b); 
                        xTurn = true; 
                    }
                }else{

                    xTurn = false;
                    System.out.println("Did you not pass math go again");
                } 
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

