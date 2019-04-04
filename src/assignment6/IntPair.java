package assignment6;

/**
 * A simple representation of a pair of integers
 * 
 * @author Peter-Michael Osera
 * @author Samuel A. Rebelsky
 */
public class IntPair {
  
  // Fields
  private int fst; // First int in pair
  private int snd; // Second int in pair

  // Constructor
  public IntPair(int fst, int snd) {
    this.fst = fst;
    this.snd = snd;
  } // IntPair(int,int)

  // Accessors
  /**
   * Get the first int in the pair
   */
  public int getFst() {
    return fst;
  } // getFst()

  /**
   * Get the second int in the pair
   */
  public int getSnd() {
    return snd;
  } // getSnd()
  
} // IntPair
