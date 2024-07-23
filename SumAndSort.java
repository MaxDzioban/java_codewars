import java.util.Arrays;
public class SumAndSort
{
  public static int sum(int[] numbers) {
        if(numbers == null || numbers.length <= 2) return 0;
        int sum = 0;
        Arrays.sort(numbers);
        for(int i = 1; i < numbers.length-1; i++){
            sum += numbers[i];
        }
        return sum;
    }
}