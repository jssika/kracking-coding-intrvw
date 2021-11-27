
public class PalindromePermutation {

  public static void main(String args[]) {
    System.out.println(isPalindromePermutation("tact coa") ? "isPalindromePermutation" : "not");
  }

  private static boolean isPalindromePermutation(String pal) {
    //count the frequency of letters
    int[] frequencyTable = buildFrequencyTable(pal);
    //check no more than one char has an odd count 
    int oddCount =0;
    for(int i = 0 ; i< frequencyTable.length ; i++) {
      if(frequencyTable[i]%2 != 0) {
        oddCount ++;
        if(oddCount > 1) {
          return false;
        }
      }
    }
    return true;
  }

  private static int[] buildFrequencyTable(String pal) {
    int[] counts = new int[Character.getNumericValue('z')- Character.getNumericValue('a')+1];
    
    for(char c : pal.toCharArray()) {
      int x = getCharacterNumber(c);
      if(x!= -1) {
        counts[x]++;
      }
    }
    return counts;
  }

  private static int getCharacterNumber(Character c) {
    int z = Character.getNumericValue('z');
    int a = Character.getNumericValue('a');
    int charCount = Character.getNumericValue(c);
    if(a <= charCount && charCount <=z) {
      return charCount-a;
    }
    return -1;
  }
}