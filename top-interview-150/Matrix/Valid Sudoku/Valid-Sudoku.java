class Solution {
    public char dot = '.';
    public boolean isValidSudoku(char[][] board) {

        // check all rows
        for(int i = 0; i < board.length; i++){
            if(!checkItem(board[i])){
                return false;
            }
        }

        // check all cols
        for(int i = 0; i < board.length; i++){
            char[] col = new char[board.length];
            for(int ii = 0; ii < board.length; ii++){
                col[ii] = board[ii][i];
            }
            if(!checkItem(col)){
                return false;
            }
        }

        // check all boxes
        for(int i = 0; i < board.length; i++){
            char[] box = new char[board.length];
            for(int ii = 0; ii < board.length; ii++){
                box[ii] = board[(i/3)*3 + ii/3][(i*3)%9 + ii%3];
            }
            if(!checkItem(box)){
                return false;
            }
        }

        return true;
    }

    // Returns true if valid
    boolean checkItem(char[] item){
        List<Character> seenChars = new ArrayList();
        for(int i = 0; i < item.length; i++){
            if(item[i] == dot){
                continue;
            }
            if(item[i] != dot && !seenChars.contains(item[i])){
                seenChars.add(item[i]);
            }
            else{
                return false;
            }
        }
        return true;
    }
}