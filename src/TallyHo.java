import java.util.Scanner;

public class TallyHo {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int number;
    int sum = 0;
    do {
      System.out.println("Please enter a number and I will tell you the sum when you type 0 ");
      number = keyboard.nextInt();
      sum += number;
    } while (number != 0);
    System.out.println("Your sum is " + sum);
    keyboard.close();
  }
}
