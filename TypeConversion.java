/**********************************************************************
  File Name: "TypeConversion.java"
  
  Programmer : NOE NOE
  
 **********************************************************************/
 
public class TypeConversion {
    public static void main(String[] args) {
        
        // Widening (Implicit Conversion)
        int intVar1 = 100;           // int (4 bytes)
        double doubleVar1 = intVar1 + 2.00;
        
        System.out.println("Widening (Implicit Conversion):");
        System.out.println("Integer value: " + intVar1 + " (Size: " + Integer.BYTES + " bytes)");
        System.out.println("Result after implicit conversion from int to double: " 
                           + doubleVar1 + " (Size: " + Double.BYTES + " bytes)");

        // Narrowing (Explicit Conversion / Type Casting)
        double doubleVar2 = 99.99;
        double intVar2 = doubleVar2 + 1;
        int intVar3 = (int) doubleVar2 + 1;
        
        System.out.println("\nNarrowing (Explicit Conversion):");
        System.out.println("Double value: " + doubleVar2 + " (Size: " + Double.BYTES + " bytes)");
        System.out.println("Result after calculate without conversion: " 
                           + intVar2 + " (Size: " + Double.BYTES + " bytes)");
        System.out.println("Result after explicit conversion from double to int: " 
                           + intVar3 + " (Size: " + Integer.BYTES + " bytes)");

        // Conversion between char and int
        char letter = 'A';     // character
        int asciiValue = letter; // implicit conversion (char to int)
        System.out.println("\nChar to Int Conversion:");
        System.out.println("Character: " + letter + " (Size: " + Character.BYTES + " bytes)");
        System.out.println("ASCII value: " + asciiValue + " (Size: " + Integer.BYTES + " bytes)");

        int number = 66;
        char convertedChar = (char) number; // explicit conversion (int to char)
        System.out.println("\nInt to Char Conversion:");
        System.out.println("Integer: " + number + " (Size: " + Integer.BYTES + " bytes)");
        System.out.println("Converted to char: " + convertedChar + " (Size: " + Character.BYTES + " bytes)");
    }
}

