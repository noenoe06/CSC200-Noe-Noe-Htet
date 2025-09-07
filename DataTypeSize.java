/**********************************************************************
  File Name: "DataTypeSize.java"
  
  Programmer : Noe Noe
 
 **********************************************************************/

public class DataTypeSize {
    public static void main(String[] args) {
        
        // Primitive Data Types (excluding boolean)
        byte b = 120;
        short s = 32000;
        int i = 123456789;
        long l = 9876543210L;
        float f = 5.75f;
        double d = 19.99;
        char c = 'A';

        // Display values, sizes, and ranges
        System.out.println("byte value: " + b);
        System.out.println("   Size: " + Byte.BYTES + " bytes (" + Byte.SIZE + " bits)");
        System.out.println("   Range: " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);

        System.out.println("\nshort value: " + s);
        System.out.println("   Size: " + Short.BYTES + " bytes (" + Short.SIZE + " bits)");
        System.out.println("   Range: " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);

        System.out.println("\nint value: " + i);
        System.out.println("   Size: " + Integer.BYTES + " bytes (" + Integer.SIZE + " bits)");
        System.out.println("   Range: " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);

        System.out.println("\nlong value: " + l);
        System.out.println("   Size: " + Long.BYTES + " bytes (" + Long.SIZE + " bits)");
        System.out.println("   Range: " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);

        System.out.println("\nfloat value: " + f);
        System.out.println("   Size: " + Float.BYTES + " bytes (" + Float.SIZE + " bits)");
        System.out.println("   Range: " + Float.MIN_VALUE + " to " + Float.MAX_VALUE);

        System.out.println("\ndouble value: " + d);
        System.out.println("   Size: " + Double.BYTES + " bytes (" + Double.SIZE + " bits)");
        System.out.println("   Range: " + Double.MIN_VALUE + " to " + Double.MAX_VALUE);

        System.out.println("\nchar value: " + c);
        System.out.println("   Size: " + Character.BYTES + " bytes (" + Character.SIZE + " bits)");
        System.out.println("   Range: " + (int) Character.MIN_VALUE + " to " + (int) Character.MAX_VALUE);
    }
}
