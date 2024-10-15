package PracGame;
import java.util.Random;
import java.util.Scanner;
public class Game {

    //private static int noOfGuesses = 0;
    /*
    Game default constructor
     */
    // Note: it is not necessary to use constructor we can use method as well
    // Note: Constructor name (Game) is equal to class name (Game) which is created
//    public int Game() {
//        Random random = new Random();
//        int guessNum = random.nextInt(0,10);
//        //System.out.println("Guess is " + guessNum);
//        return guessNum;
//    }
    public static int Randominput() {
        Random random = new Random();
        int guessNum = random.nextInt(0, 100);
        //System.out.println("Guess is " + guessNum);
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
            System.out.println("yr value is high !");
            return false;
        } else if (n > userIn) {
            System.out.println("yr value is low !");
            return false;
        } else
            return false;
    }

    public static void main(String[] args) {
        int noOfGuesses = 0;
        boolean ch;
//        Game player = new Game();
        int guessNum = Randominput();
        do {
            System.out.print("Enter Yr Num :  ");
            int n = takeUserInput();
            ch = isCorrectNumber(guessNum, n);
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
