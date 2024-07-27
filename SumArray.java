public class SumArray {

    public static double sum(double[] numbers) {
      double suma=0;
      for (int i=0; i < numbers.length;  i++){suma+=numbers[i];}
      return suma;
    }
  }