import java.util.ArrayList;
import java.util.List;

public class keypad {
    static String[] map = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public static void main(String[] args) {
        String ques = "23";
        List<String> result = new ArrayList<>();
        keypad(ques, "", result);
        System.out.println(result);
    }

    public static void keypad(String ques, String ans, List<String> result) {
        if (ques.length() == 0) {
            result.add(ans);
            return;
        }

        char ch = ques.charAt(0);
        String press = map[ch - '0'];
        for (int i = 0; i < press.length(); i++) {
            keypad(ques.substring(1), ans + press.charAt(i), result);
        }
    }
}
