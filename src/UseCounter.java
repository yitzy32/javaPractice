public class UseCounter {
  public static void main(String[] args) {
    Counter counter = new Counter();

    System.out.println(counter.count);
    counter.increment(3);
    System.out.println(counter.count);
    counter.increment(3);
    System.out.println(counter.count);
    counter.increment(3);
    System.out.println(counter.count);
  }
}
