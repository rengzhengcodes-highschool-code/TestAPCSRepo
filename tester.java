public class tester {
  public static void main(String[] args) {
    int[][] arr = {
      {},
      {1},
      {1,2},
      {1,2,3},
      {1,2,3,4},
      {1,2,3,4,5}
    };
    int[][] arr1 = {
      {}
    };
    int[][] arr2 = {
      {1, 2, 3},
      {},
      {8, 2, 3, 1},
      {1}
    };
    int[][] arr3 = {

    };
    for (int i = 0; i < arr.length; i++) {
      System.out.println(Demo.arrToString(arr[i]));
    }
    System.out.println(Demo.arrayDeepToString(arr));
    System.out.println(Demo.arrayDeepToString(arr1));
    System.out.println(Demo.arrayDeepToString(arr2));
    System.out.println(Demo.arrayDeepToString(arr3));
    System.out.println(Demo.arrayDeepToString(Demo.create2DArray(5,4,4)));
  }
}
