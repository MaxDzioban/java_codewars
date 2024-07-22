public class ExclamationMark {
    public static String removeExclamationMarks(String s) {
      int len = s.length();
      String newString = "";
      for (int i=0; i<len; i++){char letter = s.charAt(i);
        if (letter!='!'){newString+=letter;}}
        return newString;
    }
}