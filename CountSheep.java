public class CountSheep {
    public static String countingSheep(int num) {
      String mama = "";
      for (int i = 1; i<=num; i++)
        {mama+=i; mama+=" sheep...";}
      return mama;
    }
  }
