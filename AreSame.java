
    import java.util.Arrays;
public class AreSame {
	
	public static boolean comp(int[] a, int[] b) {
		if (a == null || b == null) return false;
		if (a.length != b.length) return false;

		int[] aSquared = Arrays.stream(a).map(x -> x * x).toArray();
		Arrays.sort(aSquared);
		Arrays.sort(b);

		return Arrays.equals(aSquared, b);
	}
}
