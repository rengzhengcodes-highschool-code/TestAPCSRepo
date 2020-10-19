public class Demo {
  public static void main(String[] args) {
    if (args.length != 0) {
      printLoop(Integer.parseInt(args[0]));
    }else {
      printLoop(5);
    }
  }
  public static void printLoop(int n) {
    int repeat = 1;
    for (; n > 0; n--) {
      for (int j = 0; j < n; j++) {
        System.out.print(repeat);
      }
      System.out.println();
      repeat++;
    }
  }
}
