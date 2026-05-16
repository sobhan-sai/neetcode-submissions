class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer,Set<Character>> row = new HashMap<>();
        Map<Integer,Set<Character>> column = new HashMap<>();
         Map<String,Set<Character>> squares = new HashMap<>();

         for(int r=0;r<board.length;r++){
            for(int c=0;c<board[0].length;c++){
                if(board[r][c]=='.')
                    continue;
                String squareKey = (r/3)+","+(c/3);
                if(row.computeIfAbsent(r,k->new HashSet<>()).contains(board[r][c]) || column.computeIfAbsent(c,k->new HashSet<>()).contains(board[r][c]) || squares.computeIfAbsent(squareKey,k->new HashSet<>()).contains(board[r][c]))
                    return false;
                row.get(r).add(board[r][c]);
                column.get(c).add(board[r][c]);
                squares.get(squareKey).add(board[r][c]);
            }
         }
        return true;
    }
}
