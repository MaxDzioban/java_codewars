import java.util.Arrays;
public class GiftSorter {
  public String sortGiftCode(String code) {
    char[] array = code.toCharArray();
    Arrays.sort(array);
    return new String(array);
  }
}
