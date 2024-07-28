public class CountByX {
            public static int[] countBy(int x, int n) {
                int[] multiples = new int[n];
                for (int i = 0; i < n; i++) {
                    multiples[i] = x * (i + 1);
                }
                return multiples;
            }
        
            public static void main(String[] args) {
                int[] result = countBy(2, 5); // Example usage
                for (int num : result) {
                    System.out.print(num + " "); // Output: 2 4 6 8 10
                }
            }
        }
