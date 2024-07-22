public class Average {
    public static double find_average(int[] array){
      int len = array.length;
      int sum = 0;
      for (int value : array) {
          sum += value;
      }
      return (double) sum/len;
    }
  }