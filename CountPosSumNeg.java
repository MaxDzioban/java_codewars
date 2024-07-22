public class CountPosSumNeg {
    public static int[] countPositivesSumNegatives(int[] input) {
        int plusCount = 0;
        int minusSum = 0;
    
        if (input == null || input.length == 0) {
            return new int[] {};}
    
        for (int i = 0; i < input.length; i++) {
            if (input[i] > 0) {plusCount++;} 
        else if (input[i] < 0) {minusSum += input[i];}}

      return new int[] {plusCount, minusSum};}}