package assignment6;

import java.io.PrintWriter;

public class UtilExpt {
  public static void main(String[] args) {
    PrintWriter pen = new PrintWriter(System.out, true);
    int[] testAllPair1 = new int[] {1, 2, 3, -7, 39, 22};
    printPair(Utils.allPair(testAllPair1), pen);
    
    int[] interleve1a = new int[] {1, 5, 9, 14};
    int[] interleve1b = new int[] {2, 6, 10, -3, 3, 12};
    
    int[] interleveRes1 = Utils.interleave(interleve1a, interleve1b);
    
    pen.println();
    printIntArr(interleveRes1, pen);
    pen.println();
    printIntArr(Utils.interleave(interleve1b, interleve1a), pen);
    pen.println();
    
    String[] testConcat = new String[] {"hello", " ", "", "testing", "-", "concat", " TT"};
    pen.println("concatAndReplicateAll w/ n = 0: " + Utils.concatAndReplicateAll(testConcat, 0));
    pen.println("concatAndReplicateAll w/ n = 1: " + Utils.concatAndReplicateAll(testConcat, 1));
    pen.println("concatAndReplicateAll w/ n = 2: " + Utils.concatAndReplicateAll(testConcat, 2));
    pen.println("concatAndReplicateAll w/ n = 3: " + Utils.concatAndReplicateAll(testConcat, 3));
    
  } // main
  
  public static void printPair(IntPair[] print, PrintWriter pen) {
    for (int i = 0; i < print.length; i++) {
      pen.print("(" + print[i].getFst() + ", " + print[i].getSnd() + ")");
      if (i != print.length - 1) {
        pen.print(", ");
      } // if
      pen.flush();
    } // for
  } // printPair(IntPair[] print, PrintWriter pen)
  
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
