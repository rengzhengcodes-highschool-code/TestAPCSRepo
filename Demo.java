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
    if (arr.length == 0) {
      return "{}";
    }
    String str = "{";
    String spacer = ", ";
    for (int i = 0; i < arr.length - 1; i++) {
      str += arrToString(arr[i]) + spacer;
    }
    str += arrToString(arr[arr.length-1]) + "}";
    return str;
  }

  public static int[][] create2DArray(int rows, int cols, int maxValue) {
    int[][] arr = new int[rows][cols];
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        arr[i][j] = naturalNumberRandomizerInclusive(maxValue);
      }
    }
    return arr;
  }

  public static int[][] create2DArrayRandomized(int rows, int cols, int maxValue) {
    int[][] arr = new int[rows][];
    for (int i = 0; i < rows; i++) {
      int raggedLength = naturalNumberRandomizerInclusive(cols);
      arr[i] = new int[raggedLength];
      for (int j = 0; j < raggedLength; j++) {
        arr[i][j] = naturalNumberRandomizerInclusive(maxValue);
      }
    }
    return arr;
  }

  public static int naturalNumberRandomizerInclusive(int maxValue) {
    return (int)Math.floor(Math.random() * (maxValue + 1));
  }

}
