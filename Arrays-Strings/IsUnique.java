import java.util.*;

public class IsUnique {
  public static void main(String args[]) {
    System.out.println(isUnique(". "));
    System.out.println(isUnqiueRecur("sentence", ' '));

  }


  //Option 1 using hashmap
  private static boolean isUnique(String word) {
    if(word == null || word.length() > 128) {
      return false;
    }

    HashMap<Character, Integer> occurrenceMap
            = new HashMap<Character, Integer>();
    char[] charArray = word.toCharArray();
    for(int i = 0 ; i<charArray.length ; i++) {
      if(occurrenceMap.containsKey(charArray[i])) {
        return false;
      } else {
      occurrenceMap.put(charArray[i], 1 );
      }
    }

    return true;

  }

  //Option 2 using char array
  //
  private static boolean isUnqiueRecur(String word) {
    if()
  }
}
