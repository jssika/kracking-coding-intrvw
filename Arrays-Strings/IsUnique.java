public class IsUnique {
  public static void main(String args[]) {
    System.out.println(isUnique("a"));
  }



  private static boolean isUnique(String word) {
    if(word == null || word.length() ==1) {
      return true;
    }
    return false;


  }
}
