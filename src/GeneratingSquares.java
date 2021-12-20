public class GeneratingSquares {
  public static void main(String[] args) {
    int squares[] = new int[50];
    
    for (int i = 0; i <= 49; i++) {
      squares[i] = i * i;
    }

    System.out.println(squares[0]);
    System.out.println(squares[1]);
    System.out.println(squares[2]);
    System.out.println(squares[49]);
  }
}
