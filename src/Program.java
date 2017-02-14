import Chess.ChessGame;
import Chess.Coord;
import Console.BoardDisplay;
import Console.InputHandler;

import java.util.Scanner;

/**
 * The Program class holds the main class to run the chess game in the console.
 */


public class Program {

    public static void main(String args[]){
        InputHandler handler = new InputHandler();
        Scanner scanner = new Scanner(System.in);
        ChessGame game = new ChessGame();         //Sets up chess game, initial player is white, prints board to console
        BoardDisplay.clearConsole();
        BoardDisplay.printBoard(game.board);
        while (!game.isFinished()){
            System.out.println("Enter move (eg. A2-A3):");
            String input = scanner.nextLine().trim();

            if(!handler.isValid(input)){
                System.out.println("Invalid input!");
                System.out.println("Valid input is in form: A2-A3");
            } else {
                Coord from = handler.getFrom(input);  //first half of input
                Coord to = handler.getTo(input);     //second half of input

                if (game.isValidMove(from, to)) {
                    game.playMove(from, to);
                    BoardDisplay.printBoard(game.board);
                }
                else
                    System.out.println("Illegal move!");
            }
        }
        System.out.println("Game has finished. Thanks for playing.");
    }

}