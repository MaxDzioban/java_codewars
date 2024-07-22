public class DoubleChar {
    public static String doubleChar(String s){
      String result="";
      int len = s.length();
      for (int i=0; i<len; i++){char letter = s.charAt(i); result+=letter;result+=letter;}
      return result;
    }
  }