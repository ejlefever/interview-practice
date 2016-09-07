import java.util.*;

public class IsUnique {

  public static void main(String[] args) {
    isUnique("spinach");
    isUnique("burger");
  }

  public static boolean isUnique(String input) {
    Map<Character, Integer> answerMap = new HashMap<Character, Integer>();
    int temp;
    Character letter;
    for (int i = 0; i < input.length(); i++) {
      letter = input.charAt(i);
      if (answerMap.get(letter) == null) {
        answerMap.put(letter, 1);
      }
      else {
        temp = (answerMap.get(letter)) + 1;
        if (temp <= 1) {
          answerMap.put(input.charAt(i), temp++);
        } else {
          System.out.println("The string, '" + input + "' does not have all unique chars.");
          return false;
        }
      }
    }
    System.out.println("The string, '" + input + "' has all unique chars.");
    return true;
  }

}