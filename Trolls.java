public class Trolls {
    public static String disemvowel(String str) {
    char[] vowels = {'e', 'a', 'u', 'i', 'o','E','A','O','U','I'};
      for (int i=0; i < vowels.length;i++)
      {str = str.replace(String.valueOf(vowels[i]), "");}
    return str;
    }
}
