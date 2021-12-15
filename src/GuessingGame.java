import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
  public static void main(String[] args) {
    System.out.println("Guess a number between 1 and 10");
    Random myRandom = new Random();
    int randomNum;
    randomNum = myRandom.nextInt(10) + 1;
    Scanner keyboard = new Scanner(System.in);
    int guess = keyboard.nextInt();
    String output;

    output =(randomNum == guess) ? "You got it" : "Nope. Random number was " + randomNum + " . Guess again!";
    
    System.out.println(output);
    keyboard.close();
  }
}
