package assignment6;

import java.lang.Math;

/**
 * Utils for various integer, string and array calculations/manipulations
 * 
 * @author Ally Rogers -- rogersal@grinnell.edu
 */
public class Utils {
  /**
   * Determine whether arr contains an element el where abs(el - d) < eps
   * 
   * @pre arr must be full and arr.length > 0
   * @post Returns true if there is a element arr[i] in arr
   *       such that abs(arr[i] - d) < eps, else returns false
   */
  public static boolean contains(double[] arr, double eps, double d) {
    boolean contains = false;
    for (int i = 0; i < arr.length && !contains; i++) {
      if (Math.abs(arr[i] - d) < eps) {
        contains = true;
      } // if
    } // while
    return contains;
  } // contains(double[] arr, double eps, double d1)
  
  /**
   * Calculate x^y mod m
   * 
   * @pre None.
   * @post Returns the result of x^y mod m
   */
  public static int fastModExpt(int x, int y, int m) {
    int result;
    if (y == 0) {
      return 1;
    } // if
    if (y == 1) {
      return x;
    } // if (base case)
    if (y % 2 == 0) {
      result = fastModExpt(((x * x) % m), y/2, m) % m;
    } else {
      result = (x * fastModExpt(x, y-1, m)) % m;
    } // else
    return result;
  } // fastModExpt(int x, int y, int m)
  
  /**
   * Finds all possible pairs of the elements of arr
   * 
   * @pre arr is full and arr.length > 0
   * @post pairArr is an array of all possible pairs (including duplicate and reversed pairs)
   *       that can be created using the elements of arr.
   * @post pairArr.length = arr.length^2
   */
  public static IntPair[] allPair(int[] arr) {
    IntPair[] pairArr = new IntPair[arr.length * arr.length];
    for (int i = 0; i < arr.length; i++) {
      for (int k = 0; k < arr.length; k++) {
        pairArr[i * arr.length + k] = new IntPair(arr[i], arr[k]);
      } // for
    } // for
    return pairArr;
  } // allPair(int[] arr)
  
  /**
   * g
   * 
   * @pre
   * @post
   */
  public static String concatAndReplicateAll(String[] arr, int n) {
    String result = new String("");
    for (int i = 0; i < arr.length; i++) {
      for (int k = 0; k < n; k++) {
        result = result.concat(arr[i]);
      } // for
    } // for
    return result;
  } // concatAndReplicateAll(String[] arr, int n)
  
  /**
   * g
   * 
   * @pre
   * @post
   */
  public static int[] interleave(int[] arr1, int[] arr2) {
    int[] result = new int[arr1.length + arr2.length];
    int counter = 0;
    if (arr1.length > arr2.length) {
      for (int i = 0; i < arr2.length; i++) {
        result[i*2] = arr1[i];
        result[i*2 + 1] = arr2[i];
        counter ++;
      } // for
      for (int i = arr2.length; i < arr1.length; i++) {
        result[arr2.length + i] = arr1[i];
        counter++;
      } // for
    } else {
      for (int i = 0; i < arr1.length; i++) {
        result[i*2] = arr1[i];
        result[i*2 + 1] = arr2[i];
        counter ++;
      } // for
      for (int i = arr1.length; i < arr2.length; i++) {
        result[arr1.length + i] = arr2[i];
        counter++;
      } // for
    } // else
    System.out.println("counter: " + counter + " for arr1.len: " + arr1.length + ", arr2.len: " + arr2.length);
    return result;
  } // interleave(int[] arr1, int[] arr2)
  
} // class Utils