public class BattleshipMethods {
    
    public static void printBoard(String[][] board) {
        for (int row = 0; row <= 5; row++) {
            for (int col = 0; col <= 5; col++) {
                System.out.print(board[row][col] + ' ');
            }
            System.out.println();
        }
    }
    














}
