import java.util.Scanner;

public class PickAnElement {
  public static void main(String[] args) {
    int amounts[] = {
      19, 21, 16, 14, 99, 86, 31, 19, 0, 101
    };
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Please enter a number and I will tell you where it is in the array ");
    int number = keyboard.nextInt();
    
    if (number < 10) {
      System.out.println("number in position " + number + " is: " + amounts[number]);
    } else if (number > 10) {
      System.out.println("Sorry please pick a smaller number");
    }

    keyboard.close();

  }
}
