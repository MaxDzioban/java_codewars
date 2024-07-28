public class ChineseZod {
    public static String chineseZodiac(int year) {
      String[] animals = {"Rat", "Ox", "Tiger", "Rabbit", "Dragon", "Snake", "Horse", "Goat", "Monkey", "Rooster", "Dog", "Pig"};
      String[] elements = {"Wood", "Fire", "Earth", "Metal", "Water"};
      int baseYear = 1924;
      int givenYear = year - baseYear;
      String element = elements[(givenYear / 2) % 5];
      String animal = animals[givenYear % 12];
      return element + " " + animal;
    }
  }
  
