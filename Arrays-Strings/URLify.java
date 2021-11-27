

import java.util.*;

public class URLify {

  public static void main(String args[]) {
    performURLifyChars("ge.  ek.  ");

  }

  private static void performURLify(String s) {
    s = s.replace(" ", "%20");

    System.out.println(s);

  }

  private static void performURLifyChars(String s) {
    char[] charArray = s.toCharArray();
    int numberOfspaces = 0;
    for(int i =0; i < charArray.length; i++) {
      if(charArray[i] == ' ') {
        numberOfspaces++;
      }
    }
    char[] newCharArray = new char[charArray.length + (numberOfspaces*2)];
    int index = 0;
    for(int i = 0 ; i<charArray.length ; i++) {
      if(charArray[i] == ' ') {
        newCharArray[i] = '%';
        newCharArray[i+1] = '2';
        newCharArray[i+2] = '0';
        index = index + 2;
      } else {
        newCharArray[index] = charArray[i];
        index = index +1;
      }
    }
    System.out.println(newCharArray);

  }
}