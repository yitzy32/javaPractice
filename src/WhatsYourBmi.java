import java.util.Scanner;

class WhatsYourBmi {
  public static void main(String[] args) {
    Person person1 = new Person();
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Please enter your height (inches)");
    person1.height = keyboard.nextDouble();
    
    System.out.println("Please enter your weight");
    person1.weight = keyboard.nextDouble();

    double bmi = person1.getBmi(person1.height, person1.weight);
    
    if (bmi < 18.5) {
      System.out.println("your BMI is: " + bmi + " You are Underweight. Go eat.");
    } else if (bmi >= 18.5 && bmi < 24.9) {
      System.out.println("your BMI is: " + bmi + " You are normal weight.");
    } else if (bmi >= 25 && bmi < 29.9) {
      System.out.println("your BMI is: " + bmi + " You are overweight. Stop eating");
    } else if (bmi > 30) {
      System.out.println("your BMI is: " + bmi + " Sorry but you are obese.");
    }

    keyboard.close();
  }
}
