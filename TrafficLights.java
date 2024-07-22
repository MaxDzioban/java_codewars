public class TrafficLights {
    public static String updateLight(String current) {
      String array[]= {"red","yellow", "green"};
      int nowColour = -1;
      for (int i = 0; i < array.length; i++) {
          if (current.equals(array[i])){nowColour = i; break;}}
      int nextColour = (nowColour+2)%3; return array[nextColour];
    }
}