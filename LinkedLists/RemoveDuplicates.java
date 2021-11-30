import java.util.*;
public class RemoveDuplicates {

  public static void main(String args[]) {
    LinkedList l = new LinkedList();
    l.add(2);
    l.add(4);
    l.addFirst(4);
    l.addLast(6);
    System.out.println(deleteDups(l));
  }

  private static void deleteDups(LinkedList l) {
    
    HashMap<Integer, Integer> map = new HashMap<>();

    while(i.getLast != null && i < l.size()) {
      if(map.contains(l.get(i)) {
        l.remove(i);
      } else {
        map.put(i, l.get(i));
      }
    }
  }
}