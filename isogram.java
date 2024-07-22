import java.util.HashSet;
import java.util.Set;

public class isogram {
  public static boolean isIsogram(String str) {
    // Set<Character> letters = new HashSet<Character>();
    Set<Character> letters = new HashSet<>();
    for (int i = 0; i < str.length(); ++i) {
      if (letters.contains(str.toLowerCase().charAt(i))) {
        return false;        
      }
      
      letters.add(str.charAt(i));
    }
         
    return true;
  }
}