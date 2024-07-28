import java.util.Arrays;
public class TwoSmallest {
    public static long sumTwoSmallestNumbers(final long [] numbers) {
    Arrays.sort(numbers);
    return numbers[0]+numbers[1]; 
  }             
}