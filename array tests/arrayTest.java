import java.util.Scanner;

public class arrayTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = { "quincy", "luca", "rachel", "peter", "charlie" };

        System.out.println("Check name:");
        String inputName = scanner.nextLine();
        inputName = inputName.toLowerCase();

        boolean inArray = false;

        for (String name : names) {
            if (name.equals(inputName)) {
                inArray = true;
                break;

            }
        }
        if (inArray == true) {
            System.out.println("Name is on list");

        } else if (inArray == false) {
            System.out.println("Name is not on list");
        }

scanner.close();    
    
    }
}

