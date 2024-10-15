package PracGame;
import java.util.Random;
import java.util.Scanner;
public class Game {


    public int Game() {
        Random random = new Random();
        int guessNum = random.nextInt(0,10);
        return guessNum;
    }

    public static int takeUserInput() {
        int n = (new Scanner(System.in)).nextInt();
        return n;
    }

    public static boolean isCorrectNumber(int n, int userIn) {
        if (n == userIn) {
            return true;
        } else if (n < userIn) {
            System.out.println("Your value is high !");
            return false;
        } else if (n > userIn) {
            System.out.println("Your value is low !");
            return false;
        } else
            return false;
    }

    public static void main(String[] args) {
        int noOfGuesses = 0;
        boolean ch;
        Game player = new Game();
        do {
            System.out.print("Enter Your Number :  ");
            int n = takeUserInput();
            ch = isCorrectNumber(player.Game(), n);
            noOfGuesses++;
        } while (ch != true);


        System.out.println("Number of attempt you took to guess the number :  " + noOfGuesses);
        if (noOfGuesses <= 5) {
            System.out.println("Your are a pro player");
        } else if (noOfGuesses <= 10) {
            System.out.println("Your played well");
        } else {
            System.out.println("Your played well but you took too many attempts... :) ");
        }
    }
}
