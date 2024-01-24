public class permuatations_2{
    public static void main(String[] args) {
        String ques = "abccc";
        print(ques, "");
    }

    public static void print(String ques, String ans) {
        if (ques.length() == 0) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < ques.length(); i++) {
            char s = ques.charAt(i);
            boolean val = false;

            for (int j = i + 1; j < ques.length(); j++) {
                if (ques.charAt(j) == s) {
                    val = true;
                    break;
                }
            }

            if (val == false) {
                String s1 = ques.substring(0, i);
                String s2 = ques.substring(i + 1);
                print(s1 + s2, ans + s);
            }
        }
    }
}
