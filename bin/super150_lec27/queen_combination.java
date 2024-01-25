public class queen_combination {
    public static void main(String[] args) {
        int n = 4;
        boolean[] board = new boolean[n];
        int tq = 2;
        permu(board, tq, 0, "", 0);
    }

    public static void permu(boolean[] board, int tq, int qps, String ans, int idx) {
        if (tq == qps) {
            System.out.println(ans);
            return;
        }
        for (int i = idx; i < board.length; i++) {
            if (board[i] == false) {
                board[i] = true;// placed the queen
                permu(board, tq, qps + 1, ans + "b" + i + "q" + qps, i+1);
                //we are maintaining an index idx to continue loop from where the queen had already been placed 
                board[i] = false;
            }
        }
    }
}
