package Semester_1;

import java.util.Scanner;

public class TicTacToe {

    public static Scanner sc = new Scanner(System.in);
    public static String[][] ticTac = new String[3][3];
    public static boolean gameWon = false;

    public static void main(String[] args){

        //MERK DIR DEN STRINGBUILDER

        System.out.println("Willst du Tic Tac Toe spielen?");
        String str = sc.nextLine();

        System.out.println("Spieler 1, gib dein Symbol ein.");
        Player player1 = new Player(1, sc.nextLine());

        System.out.println("Spieler 2, gib dein Symbol ein.");
        Player player2 = new Player(2, sc.nextLine());

        System.out.println("Spielfeld:");
        System.out.println("[00][01][02]");
        System.out.println("[10][11][12]");
        System.out.println("[20][21][22]");

        Player currentPlayer;
        for(int i = 0; i < 9; i++){
            currentPlayer = (i % 2 == 0)? player1 : player2;
            spielerEingabe(currentPlayer);
            if(checkWin(currentPlayer)){
                System.out.println("Spieler "+ currentPlayer.nr + " hat gewonnen!");
                printBoard();
                System.exit(0);
            }
            printBoard();
        }

    }

    public static void spielerEingabe(Player player){
        System.out.println("Spieler "+ player.nr +", gib deinen Zug ein. (Eingabeformat(Zeile/Spalte): '02': )");
        try{
            char[] eingabe = sc.nextLine().toCharArray();
            ticTac[Character.getNumericValue(eingabe[0])][Character.getNumericValue(eingabe[1])] = player.symbol;
        }catch(Exception e){
            System.out.println("Falsche Eingabe!");
            spielerEingabe(player);
        }
    }

    public static void printBoard(){
        for (String[] strings : ticTac) {
            System.out.println("-------------");
            System.out.print("|");
            for (String string : strings) {
                System.out.print(" " + string + " |");
            }
            System.out.println();
        }
        System.out.println("-------------");
    }

    public static boolean checkWin(Player player){
        //Spielfeld:
        //[00][01][02]
        //[10][11][12]
        //[20][21][22]
        String[][] leereFelder = ticTac;
        for(int i = 0; i < leereFelder.length; i++){
            for(int ii = 0; ii < leereFelder[i].length; ii++){
                if(leereFelder[i][ii] == null){
                    leereFelder[i][ii] = "l";
                }
            }
        }
        if(leereFelder[0][0].equals(player.symbol) && leereFelder[1][0].equals(player.symbol) && leereFelder[2][0].equals(player.symbol)){
            return gameWon = true;
        }else if(leereFelder[0][1].equals(player.symbol) && leereFelder[1][1].equals(player.symbol) && leereFelder[2][1].equals(player.symbol)){
            return gameWon = true;
        }else if(leereFelder[0][2].equals(player.symbol) && leereFelder[1][2].equals(player.symbol) && leereFelder[2][2].equals(player.symbol)){
            return gameWon = true;
        }else if(leereFelder[0][0].equals(player.symbol) && leereFelder[0][1].equals(player.symbol) && leereFelder[0][2].equals(player.symbol)){
            return gameWon = true;
        }else if(leereFelder[1][0].equals(player.symbol) && leereFelder[1][1].equals(player.symbol) && leereFelder[1][2].equals(player.symbol)){
            return gameWon = true;
        }else if(leereFelder[2][0].equals(player.symbol) && leereFelder[2][1].equals(player.symbol) && leereFelder[2][2].equals(player.symbol)){
            return gameWon = true;
        }else if(leereFelder[0][0].equals(player.symbol) && leereFelder[1][1].equals(player.symbol) && leereFelder[2][2].equals(player.symbol)){
            return gameWon = true;
        }else if(leereFelder[0][2].equals(player.symbol) && leereFelder[1][1].equals(player.symbol) && leereFelder[2][0].equals(player.symbol)){
            return gameWon = true;
        }
        return gameWon = false;
    }//end checkWin:boolean
}//end class

class Player{
    public int nr;
    public String symbol;

    public Player(int nr, String symbol){
        this.nr = nr;
        this.symbol = symbol;
    }

}




