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
  public static String arrToString(int[] arr) {
    if (arr.length == 0) {
      return "{}";
    }
    String str ="{";
    String spacer = ", ";
    for (int i = 0; i < arr.length - 1; i++) {
      str += arr[i] + spacer;
    }
    str += arr[arr.length-1] + "}";
    return str;
  }
  public static String arrayDeepToString(int[][] arr) {
    String str = "{";
    String spacer = ", ";
    for (int i = 0; i < arr.length - 1; i++) {
      str += arrToString(arr[i]) + spacer;
    }
    str += arrToString(arr[arr.length-1]) + "}";
    return str;
  }
}
