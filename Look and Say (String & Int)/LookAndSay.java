public class LookAndSay {

  public static void main (String[] args) {

    int input = 244466666;
    System.out.println("Input: " + input);
    System.out.println("Look and Say: " + LookAndSay(input)); //expected output: 123456

  }

  public static String LookAndSay(int input) {

    int counter = 1;
    String in = Integer.toString(input);
    String answer = "";
    for (int i = 1; i < in.length(); i++) {
      if (in.charAt(i) == in.charAt(i-1)) {
        counter++;
      } else {
        answer += Integer.toString(counter).charAt(0);
        answer += in.charAt(i-1);
        counter = 1;
      }
    }
    int last = in.length()-1;
    if (in.charAt(last-1) == in.charAt(last)) {
      answer += Integer.toString(counter).charAt(0);
      answer += (in.charAt(last));
    }
    return answer;

  }

}