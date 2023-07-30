import java.util.Scanner;

public class Battleship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to Battleship!");

        // Prompt player 1 to input cordinates for 5 ships 
        System.out.println("PLAYER 1, ENTER YOUR SHIPS’ COORDINATES.\n");
        
        int shipNum = 0;
        
        while(shipNum <= 4){
            System.out.println("Enter cordinates for ship: ");
            int shipX = scanner.nextInt();
            int shipY = scanner.nextInt();

            shipNum++;
        }

        
        


    }
}
