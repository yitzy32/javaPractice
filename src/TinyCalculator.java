import java.util.Scanner;

public class TinyCalculator {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Welcome to Tiny Calculator.");
    
    System.out.println("Type in your first number");
    int firstNumber = keyboard.nextInt();
    
    System.out.println("Now your second number");
    int secondNumber = keyboard.nextInt();

    System.out.println("Great! Now the opperation you want to perform (+ - * /)");
    String opperation = keyboard.next();


    switch (opperation) {
      case "+":
        int sum = firstNumber + secondNumber;
        System.out.println(firstNumber + " + " + secondNumber + " = " + sum);
        break;
      case "-":
        int difference = firstNumber - secondNumber;
        System.out.println(firstNumber + " - " + secondNumber + " = " + difference);
        break;
      case "*":
        int product = firstNumber * secondNumber;
        System.out.println(firstNumber + " * " + secondNumber + " = " + product);
        break;
      case "/":
        int quotient = firstNumber / secondNumber;
        System.out.println(firstNumber + " / " + secondNumber + " = " + quotient);
        break;
    }

    keyboard.close();
  }
}
