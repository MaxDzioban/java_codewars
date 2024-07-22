public class Calculate {
    public static String bmi(double weight, double height) {
      double bmi = weight / Math.pow(height, 2);
      if (bmi > 30) { 
        return "Obese";
      } else {
        if (bmi <= 30 && bmi > 25) { 
          return "Overweight";
        } else {
          if (bmi <= 18.5) {
            return "Underweight";
          }
        }
        return "Normal";
      }
    }
  }