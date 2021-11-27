import java.util.*;

public class StringPermutation {

  public static void main(String args[]) {
    System.out.println(isPermutation2("geek.  ", ".  eekG"));

  }

  private static boolean isPermutation(String a, String b) {
    if(a.length() != b.length()) {
      return false;
    }
    char[] aCharArray = a.toCharArray();
    char[] bCharArray = b.toCharArray();
    Arrays.sort(aCharArray);
    Arrays.sort(bCharArray);
    return new String(aCharArray).equals(new String(bCharArray));

  }

  private static boolean isPermutation2(String a , String b) {

     if(a.length() != b.length()) {
      return false;
    }

    int[] charArray = new int[128];
    for(int i = 0; i<a.length(); i++) {
      charArray[a.charAt(i)]++;
    }
    for(int i = 0; i<a.length(); i++) {
      charArray[b.charAt(i)]--;

      if(charArray[b.charAt(i)] <0) {
        return false;
      }
    }
    return true;
  }
}