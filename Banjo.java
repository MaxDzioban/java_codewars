public class Banjo {
    public static String areYouPlayingBanjo(String name) {
      if (Character.toUpperCase(name.charAt(0)) == 'R')
      {return name + " plays banjo";}
      else{return name + " does not play banjo";}
    }
  }

//   if( name.toUpperCase().startsWith("R") )
//   return name + " plays banjo";
// else
//   return name + " does not play banjo";