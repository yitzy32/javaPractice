package src;
import java.util.Random;

class RandomNumber {
  public static void main(String[] args) {
    Random myRandom = new Random();
    int randomNum;
    randomNum = myRandom.nextInt(10) + 1;
    System.out.println(randomNum);
  }
}
