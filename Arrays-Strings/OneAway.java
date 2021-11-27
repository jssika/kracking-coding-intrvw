public class OneAway {

  public static void main(String args[]) {
    System.out.println(isOneEditAway("pale", "pals"));
  }

  //is string one edit away - one removed , one added or one replaced

  private static boolean isOneEditAway(String a, String b ) {
    char[] aArray = a.toCharArray();
    char[] bArray = b.toCharArray();

    if(a.length() > b.length() && a.length() == b.length()+1) {
      // could be one remove
       return oneRemoved(aArray, bArray);                                            
    }
    if(a.length() == b.length() && !a.equals(b)) {
      // could be one replace or not
      return oneReplaced(aArray, bArray);
    }
    if(a.length() < b.length() && a.length() +1 == b.length()) {
      // could be one addition
      return oneRemoved(bArray, aArray);
    }
    return false;
    
  }

  private static boolean oneRemoved(char[] aArray, char[] bArray) {
    // pale pal
    int count = 0;
    int j = 0;
    for(int i = 0 ; i < aArray.length-1 ; i++) {
      if(bArray[j] != aArray[i]) {
        count++; 
      }  else {
        j++;
      } 
      if(i==j-1 && i==aArray.length-2 && count == 0) {
        //last one is removed
        count++;
      }
    }
    return count == 1;
  }

  private static boolean oneReplaced(char[] aArray, char[] bArray) {
    int count =0;
      for(int i = 0 ; i < aArray.length ; i++) {
      if(bArray[i] != aArray[i]) {
        count++; 
      } 
    }
    return count ==1;
  }
}