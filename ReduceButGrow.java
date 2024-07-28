public class ReduceButGrow {
    public static int grow(int[] x){
      int dubl=1;
      for (int i = 0; i<x.length; i++){dubl*=x[i];}
      return dubl;
    
    }
  
  }