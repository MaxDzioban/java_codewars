public class GrassHopper {
    public static char getGrade(int s1, int s2, int s3) {
      float average = (s1+s2+s3)/3;
      char result='Z';
      if (average>=90 && average <=100){result='A';}
      if (average>=80 && average <90){result='B';}
      if (average>=70 && average <80){result='C';}
      if (average>=60 && average <70){result='D';}
      if (average>=0 && average <60){result='F';}
      return result;
    }
}