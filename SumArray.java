public class SumArray {

    public static double sum(double[] numbers) {
      double suma=0;
      for (int i=0; i < numbers.length;  i++){suma+=numbers[i];}
      return suma;
    }
  }
// import java.util.Arrays;

//   public class SumArray {
  
//     public static double sum(double[] numbers) {
//       return Arrays.stream(numbers).sum();
//     } 
//   }