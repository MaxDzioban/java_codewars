public class NthSeries {	
	public static String seriesSum(int n) {
		double zey = 0.0;
		double whey = 1.0;
		for (int i = 0; i < n; i++) {
			zey += 1.0 / whey;
			whey += 3.0;
		}
		return String.format("%.2f", zey);
	}
}