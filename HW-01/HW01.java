// /* 
// Section 1: Primitive Operations
// All of the instructions in this section should be carried out in the class PrimitiveOperations, in the main method, and must be in the respective order.

// First, declare and initialize two variables, an integer type (byte, short, int, or long) and a floating point value (float or double). The names and values can be whatever you like, for this step and all others. Make sure that the numbers you choose can be stored within the respective primitive type you choose. Print each of these values out on their own line using System.out.println().
// Multiply these variables together, and assign the outcome to a new variable, ensuring that no data is lost. For example, if I multiply 5 and 3.5, the answer should be 17.5.Print out this new value.
// Use casting to convert the integer from the first step to a floating point value and store that in another new variable. Print out the value.
// Use casting to convert the floating point value from the first step to an integer type and store that in a new variable. Print out the value.
// Shifting focus, declare a char variable, and assign an uppercase letter to it. Print out this value.
// Using a numerical operation, change the letter to the same letter, but in lowercase. Use a numerical operation - do not reassign the variable. You may want to review a table of ASCII values as you’re working on this section. Print out the new char value. Hint: you’ll likely have to use casting to get this to work.
// */


// public class HW01 {
//    public static void main(String[] args) {
    
//     int integerVar = 13;
//     double decimalVar = 7.9;

//     System.out.println(integerVar);
//     System.out.println(decimalVar);

//     double multipliedVar = integerVar * decimalVar;

//     System.out.println(multipliedVar);

//     double integerVarcast = (double)integerVar;

//     System.out.println(integerVarcast);

//     int decimalVarcast = (int)decimalVar;

//     System.out.println(decimalVarcast);

// //This part is confusing ASCII value manipulation method doesent make sense 
//     char characterVar = 'Q';

//     char lowercaseChar = (char)(characterVar + ('q' - 'Q'));

//     System.out.println(lowercaseChar);
// //
//     StringOperations stringOperations = new StringOperations();

//     stringOperations.name = "Quincy";

//     System.out.println(stringOperations.name);

//     stringOperations.name = stringOperations.name.replace('Q','A');
//     stringOperations.name = stringOperations.name.replace('y', 'Z');

//     System.out.println(stringOperations.name);

//     stringOperations.webAddress = "www.wisc.edu";

//     System.out.println(stringOperations.webAddress);

//     stringOperations.webAddress = stringOperations.webAddress.substring(4, 8);
    
//     stringOperations.webAddress = stringOperations.webAddress.concat("1331");

//     System.out.println(stringOperations.webAddress);


//     }
// }

