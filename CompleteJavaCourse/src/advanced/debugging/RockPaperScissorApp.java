package advanced.debugging;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorApp {
    public static void main(String[] args) {

        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Welcome to Rock, Paper, Scissors!");

        while (true){
           System.out.println("To make a move type in rock or paper or scissors. To quit the game enter quit.");

           System.out.println("Your move: ");
           String yourMove = inputScanner.nextLine().toLowerCase();

           if(yourMove.equals("quit")){
               break;
           }

           if(isValidInput(yourMove)){
               String opponetMove = generateOpponentMove();
               whoWon(yourMove, opponetMove);
           }else {
               System.out.println("Invalid input!");
           }

        }

    }
    private static boolean isValidInput(String userInput){
        return userInput.equals("scissors") || userInput.equals("rock")  || userInput.equals("paper");
    }

    private static String generateOpponentMove(){
        Random randomNumberGenerator = new Random();
        switch (randomNumberGenerator.nextInt(3)){
            case 0:
            default:
                return "rock";
            case 1:
                return "paper";
            case 2:
                return "scissors";
        }
    }

    private static void whoWon(String userMove, String opponentMove){
        if (userMove.equals(opponentMove)){
            System.out.println("It's a tie.");
        }else if (userMove.equals("rock")&&opponentMove.equals("scissors")||
                  userMove.equals("paper") && opponentMove.equals("rock") ||
                  userMove.equals("scissors") && opponentMove.equals("paper")){
            System.out.println("You won!");
        }else{
            System.out.println("Your opponent won!");

        }
    }
}
