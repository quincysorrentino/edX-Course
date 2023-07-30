import java.util.Scanner;

public class Battleship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Initialize array for player 1 
        char player1 [][] = new char[6][6];
        

        char player2 [][] = new char[5][5];


        System.out.println("Welcome to Battleship!");

        // Prompt player 1 to input cordinates for 5 ships 
        System.out.println("PLAYER 1, ENTER YOUR SHIPS COORDINATES.\n");
        
        
        int shipNum = 1;
        
        while(shipNum <= 5){
            System.out.println("Enter cordinates for ship " + shipNum  + ":");
            
            if (scanner.hasNextInt()) {
                
                int shipX = scanner.nextInt();
                int shipY = scanner.nextInt();
                player1[shipX][shipY] = '@';
                
                scanner.nextLine();
            
                shipNum++;
                

            } else {
                System.out.println("Invalid coordinates. Choose different coordinates.");
                scanner.nextLine();
            }
        }
//Print array feature 
        
        System.out.println("\nPlayer 1 Ships' Coordinates:");
        
        int i = 1;
        while (i <= 5) {
            int j = 1;
            while (j <= 5) {
                System.out.print(player1[i][j]  + "-");
                j++;
            }
            System.out.println();
            i++;
        }

        



        


    }
}
