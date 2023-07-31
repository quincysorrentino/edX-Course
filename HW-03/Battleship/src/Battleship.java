import java.util.Scanner;

public class Battleship {
    public static void main(String[] args) {
        BattleshipMethods methods = new BattleshipMethods();
        Scanner scanner = new Scanner(System.in);

        // Initialize array for player 1
        String player1[][] = new String[6][6];

        String player2[][] = new String[6][6];

        System.out.println("Welcome to Battleship!");

        // Prompt player 1 to input cordinates for 5 ships
        System.out.println("PLAYER 1, ENTER YOUR SHIPS COORDINATES.\n");
        
        int shipNum = 1;
        
        while (shipNum <= 5) {
            System.out.println("Enter cordinates for ship " + shipNum + ":");

            if (scanner.hasNextInt()) {

                int shipX = scanner.nextInt();
                int shipY = scanner.nextInt();

                if (shipX >= 0 && shipX <= 4 && shipY >= 0 && shipY <= 4) {

                    player1[shipX][shipY] = "@";

                    scanner.nextLine();

                    shipNum++;

                } else {
                    System.out.println("Invalid coordinates. Choose different coordinates.");
                    scanner.nextLine();
                }

            }
        }

        // Print array feature

        System.out.println("\nPlayer 1 Ships' Coordinates:");

        // fill 0,0 with an empty space
        player1[0][0] = " ";

        // write numbers on x axis
        for (int col = 1; col <= 5; col++) {
            player1[0][col] = String.valueOf(col - 1);
        }

        // write numbers on y axis
        for (int row = 1; row <= 5; row++) {
            player1[row][0] = String.valueOf(row - 1);
        }

        // Initialize the rest of the elements with empty spaces
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= 5; col++) {
                if (player1[row][col] == null) {
                    player1[row][col] = "-";
                }
            }
        }

        methods.printBoard(player1);
        
        
    }
}