import java.util.Scanner;

public class WhatKindOfNumber {
  public static void main(String[] args) {
    System.out.println("Please Enter a number");
    Scanner keyboard = new Scanner(System.in);
    int number = keyboard.nextInt();
    if (number > 0) {
      System.out.println("number is positive");
    } else if (number < 0) {
      System.out.println("number is negative");      
    } else if (number == 0) {
      System.out.println("number is zero");
    }
    keyboard.close();
  }
}
