import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
  public static void main(String[] args) {
    System.out.println("Guess a number between 1 and 10");
    Random myRandom = new Random();
    int randomNum;
    boolean numbersDontMatch = true;
    Scanner keyboard = new Scanner(System.in);
    while (numbersDontMatch) {
      randomNum = myRandom.nextInt(10) + 1;
      int guess = keyboard.nextInt();
      String output;

      if (randomNum == guess) {
        output = "You got it";
        numbersDontMatch = false;
      } else {
        output = "Nope. Random number was " + randomNum + ". Guess again!";
      }

      System.out.println(output);
    }
    keyboard.close();
  }
}
