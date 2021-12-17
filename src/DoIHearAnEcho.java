import java.util.Scanner;

public class DoIHearAnEcho {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    String answer;    
    do {
      System.out.print("Enter a number ");
      int usersNumber = keyboard.nextInt();
      System.out.println(usersNumber);
      System.out.println("Continue? (Y/N) ");
      answer = keyboard.next();
      
    } while(!answer.equals("N"));
    
    keyboard.close();
  }
}
