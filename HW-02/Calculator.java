import java.util.Scanner;

public class Calculator{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        final String add = "add";
        final String subtract = "subtract";
        final String multiply = "multiply";
        final String divide = "divide";
        final String alphabetize = "alphabetize";
       
        
        System.out.println("List of operations: " + add + " " + subtract + " " + multiply + " " + divide + " " + alphabetize);
        System.out.println("Enter operation: ");
        
        String operation = scanner.nextLine();

        operation = operation.toLowerCase();

//Check if inputed operater is valid  
        if(operation.equals(add) || operation.equals(subtract) || operation.equals(multiply) || operation.equals(divide) || operation.equals(alphabetize)) {

        }
        
        else {
            System.out.println("Invalid input entered. Terminating...");
            System.exit(0);
        }

// Addition and subtraction process 
        if(operation.equals(add) || operation.equals(subtract)) {
            System.out.print("Enter two integers: ");

            int addsubNum1 = scanner.nextInt();
            int addsubNum2 = scanner.nextInt();

            if(operation.equals(add)){
                int sum = addsubNum1 + addsubNum2;
                System.out.println("Sum = " + sum);
            }

            else if(operation.equals(subtract)){
                int subtraction = addsubNum1 - addsubNum2;
                System.out.println("Subtraction = " + subtraction);
            }
        }
        
// Multiplication and division process 
        if(operation.equals(multiply) || operation.equals(divide)){
            System.out.println("CHOOSE TWO DOUBLES");
            
            System.out.println("First double: ");
            double multidivNum1 = scanner.nextDouble();
            
            System.out.println("Second double: ");
            double multidivNum2 = scanner.nextDouble();
        
            if(operation.equals(multiply)){
                double product = multidivNum1 * multidivNum2;
                System.out.println("Product = " + product);

        }
            else if(operation.equals(divide)){
                double quotient = multidivNum1 / multidivNum2;
                System.out.println("Quotient = " + quotient);
            }

    }

//alphabatize process
    if(operation.equals(alphabetize)){
        System.out.println("CHOOSE TWO WORDS");
        
        System.out.println("First word: ");
        String word1 = scanner.next();
        
        System.out.println("Second word: ");
        String word2 = scanner.next();

        int compareValue = word1.compareTo(word2);

        if(compareValue == 0){
            System.out.println("Both words are equal");
    
        }
        else if(compareValue > 0){
            System.out.println(word1 + " is lexicographically greater than " + word2);
        }
        else if(compareValue < 0){
            System.out.println(word1 + " is lexicographically less than " + word2);
        }
    }
            

    }
}