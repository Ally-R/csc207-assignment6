package assignment6;

import java.io.PrintWriter;

/**
 * Some simple informal tests for Utils.java
 * 
 * @author Ally Rogers -- rogersal@grinnell.edu
 */
public class UtilExpt {
  /**
   * The tests.
   */
  public static void main(String[] args) {
    PrintWriter pen = new PrintWriter(System.out, true); // Setup pen
    
    // contains tests
    double[] contains1 = new double[] {7, 3.3, 2, -1, 4};
    double d1 = 1;
    pen.println("contains1: " + Utils.contains(contains1, 5, d1));
    pen.println("contains2: " + Utils.contains(contains1, 1, d1));
    pen.println("contains3: " + Utils.contains(contains1, 1.1, d1));
    pen.println();
    
    // fastModExpt tests
    pen.println("fastModExpt1: " + Utils.fastModExpt(5, 4, 1000));
    pen.println("fastModExpt2: " + Utils.fastModExpt(5, 4, 36));
    pen.println("fastModExpt3: " + Utils.fastModExpt(5, 4, 1));
    pen.println("fastModExpt4: " + Utils.fastModExpt(-2, 7, 300)); // Test negative x
    pen.println("fastModExpt5: " + Utils.fastModExpt(2, 7, -60)); // Test negative m
    pen.println("fastModExpt6: " + Utils.fastModExpt(0, 4, 30)); // Test x = 0
    pen.println("fastModExpt7: " + Utils.fastModExpt(4, 0, 30)); // Test y = 0
    pen.println();
    
    // allPair test
    int[] testAllPair1 = new int[] {1, 2, 3, -7, 39, 22};
    printPair(Utils.allPair(testAllPair1), pen);
    pen.println();
    pen.println();
    
    // concatAndReplicateAll tests
    String[] testConcat = new String[] {"hello", " ", "", "testing", "-", "concat", " TT"};
    pen.println("concatAndReplicateAll w/ n = 0: " + Utils.concatAndReplicateAll(testConcat, 0));
    pen.println("concatAndReplicateAll w/ n = 1: " + Utils.concatAndReplicateAll(testConcat, 1));
    pen.println("concatAndReplicateAll w/ n = 2: " + Utils.concatAndReplicateAll(testConcat, 2));
    pen.println("concatAndReplicateAll w/ n = 3: " + Utils.concatAndReplicateAll(testConcat, 3));
    
    // interleave tests
    int[] interleve1a = new int[] {1, 5, 9, 14};
    int[] interleve1b = new int[] {2, 6, 10, -3, 3, 12};
    
    pen.println();
    printIntArr(Utils.interleave(interleve1a, interleve1b), pen);
    pen.println();
    printIntArr(Utils.interleave(interleve1b, interleve1a), pen);
    pen.println();
  } // main
  
  /**
   * Print an IntPair array
   * 
   * @pre print is a full array where print.length > 0
   * @post All pairs in print are printed
   */
  public static void printPair(IntPair[] print, PrintWriter pen) {
    for (int i = 0; i < print.length; i++) {
      pen.print("(" + print[i].getFst() + ", " + print[i].getSnd() + ")");
      if (i != print.length - 1) {
        pen.print(", ");
      } // if
      pen.flush();
    } // for
  } // printPair(IntPair[] print, PrintWriter pen)
  
  /**
   * Print an int array
   * 
   * @pre print is a full array where print.length > 0
   * @post All ints in print are printed
   */
  public static void printIntArr(int[] print, PrintWriter pen) {
    pen.print("{");
    for (int i = 0; i < print.length; i++) {
      pen.print(print[i]);
      if (i < print.length - 1) {
        pen.print(", ");
      } else {
        pen.print("}");
      } // else
    } // for
    pen.flush();
  } // printIntArr(int[] print, PrintWriter pen)
  
} // class UtilExpt
