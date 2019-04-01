package assignment6;

public class Utils {
  
  // THIS IS WRONG -- LOOK AT NEW FORMULA
  public static boolean contains(double[] arr, double eps, double d1) {
    boolean contains = false;
    for (int i = 0; i < arr.length && !contains; i++) {
      if (d1 - arr[i] < eps) {
        contains = true;
      } // if
    } // while
    return contains;
  } // contains(double[] arr, double eps, double d1)
  
  // THIS IS WRONG -- LOOK AGAIN AT FORMULA (IT'S CHANGED)
  public static int fastModExpt(int x, int y, int m) {
    int result;
    if (y == 0 || y % 2 == 0) {
      result = expt(((x * x) % m), y/2);
    } else {
      result = x * (expt(x, y-1) % m);
    } // else
    return result;
  } // fastModExpt(int x, int y, int m)
  
  public static int expt(int x, int y) {
    if (y == 0) {
      return 1;
    } // if y is 0
    int result = x;
    for (int i = 0; i < y - 1; i++) {
      result *= x;
    } // for
    return result;
  } // expt(int x, int y)
  
  public static IntPair[] allPair(int[] arr) {
    IntPair[] pairArr = new IntPair[arr.length * arr.length];
    for (int i = 0; i < arr.length; i++) {
      for (int k = 0; k < arr.length; k++) {
        pairArr[i*arr.length+k] = new IntPair(arr[i], arr[k]);
      } // for
    } // for
    return pairArr;
  } // allPair(int[] arr)
  
  public static String concatAndReplicateAll(String[] arr, int n) {
    String result = new String("");
    for (int i = 0; i < arr.length; i++) {
      for (int k = 0; k < n; k++) {
        result = result.concat(arr[i]);
      } // for
    } // for
    return result;
  } // concatAndReplicateAll(String[] arr, int n)
  
  public static int[] interleave(int[] arr1, int[] arr2) {
    int[] result = new int[arr1.length + arr2.length];
    if (arr1.length > arr2.length) {
      for (int i = 0; i < arr2.length; i++) {
        result[i*2] = arr1[i];
        result[i*2 + 1] = arr2[i];
      } // for
      for (int i = arr2.length; i < arr1.length; i++) {
        result[arr2.length + i] = arr1[i];
      } // for
    } else {
      for (int i = 0; i < arr1.length; i++) {
        result[i*2] = arr1[i];
        result[i*2 + 1] = arr2[i];
      } // for
      for (int i = arr1.length; i < arr2.length; i++) {
        result[arr1.length + i] = arr2[i];
      } // for
    } // else
    return result;
  } // interleave(int[] arr1, int[] arr2)
  
} // class Utils

/*
 * Questions:
 *  - IntPair I was supposed to make or to import from somewhere?
 *  - Do I need to avoid repeat pairs?
 *  - Is 0 a valid argument for fastModExpt?
 *  - NO, LOOK AGAIN - Is contains correct? The problem formatting is scrambled so I'm not sure I got the formula correct.
 *  - YES - Is it okay that I have all of my methods for all questions in one class called Utils?
 *  - YES - Are all the classes supposed to be static?
 *  - [You're Right] - What format should the time complexity analysis be in? Should we include counters in our original
 *    classes or make new duplicate classes for them?
 */
