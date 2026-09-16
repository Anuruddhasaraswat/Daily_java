package codehelp;

public class day6 {
    static void main() {
        /*
             JAVA DATA TYPES - NOTES
Data Type :A data type tells Java what type of value a variable can store.

Java Data Types are divided into:
1. Primitive Data Types
2. Non-Primitive / Reference Data Types

Primitive Data Types: Java has 8 primitive data types:
1. byte
2. short
3. int
4. long
5. float
6. double
7. char
8. boolean

              1. BYTE
byte is used to store small whole numbers.
Size: 1 byte = 8 bits
Range: -128 to 127
Example: byte age = 20;
Use byte when the value is within the byte range.
*/
        class JavaDataTypesNotes {
            public static void main(String[] args) {
                /*
                        1. BYTE
        byte stores small integer values.
        Size: 1 byte
        Range: -128 to 127
        */
                byte age = 20;
                System.out.println("Byte value: " + age);
                /*

                        2. SHORT
        short stores integer values larger than byte.
        Size: 2 bytes = 16 bits
        Range: -32,768 to 32,767
        Example: short marks = 25000;
        */
                short marks = 25000;
                System.out.println("Short value: " + marks);
        /*

                        3. INT
        int is the most commonly used integer data type.
        Size: 4 bytes = 32 bits
        Range: -2,147,483,648 to 2,147,483,647
        Example: int salary = 50000;
        */
                int salary = 50000;
                System.out.println("Int value: " + salary);
        /*

                        4. LONG
        long is used for very large whole numbers.
        Size: 8 bytes = 64 bits
        Range:Approximately -9.22 × 10^18 to 9.22 × 10^18
        IMPORTANT:Add L at the end of a large long literal.
        Example:long population = 8000000000L;
        */
                long population = 8000000000L;
                System.out.println("Long value: " + population);
        /*

                        5. FLOAT
        float is used to store decimal numbers.
        Size: 4 bytes = 32 bits
        IMPORTANT: Add 'f' or 'F' at the end of a float literal.
        Example: float price = 99.5f;
        Without f:float price = 99.5;   // ERROR
        Because decimal literals are double by default.
        */
                float price = 99.5f;
                System.out.println("Float value: " + price);
        /*

                        6. DOUBLE
        double is used to store decimal numbers with
        higher precision than float.
        Size: 8 bytes = 64 bits
        Example: double pi = 3.14159265359;
        double is generally preferred over float
        for normal decimal calculations.
        */
                double pi = 3.14159265359;
                System.out.println("Double value: " + pi);
        /*

                        7. CHAR
        char is used to store a SINGLE character.
        Size: 2 bytes = 16 bits
        Examples:
        'A'
        'B'
        '5'
        '@'
        IMPORTANT:
        char uses SINGLE quotes:
        char grade = 'A';
        String uses DOUBLE quotes:
        String name = "Nikhil";
        */
                char grade = 'A';
                System.out.println("Char value: " + grade);
        /*

                        8. BOOLEAN
        boolean stores only two values:
        true
        false
        Example: boolean isPassed = true;
        boolean is commonly used in conditions.
        */
                boolean isPassed = true;
                System.out.println("Boolean value: " + isPassed);
        /*

                  NON-PRIMITIVE DATA TYPES
        Non-primitive data types are also called reference data types.
        Examples:
        1. String
        2. Arrays
        3. Classes
        4. Objects
        5. Interfaces
        6. Enums
        */

                /*

                        9. STRING
        String is used to store a sequence of characters.
        Example: String name = "Nikhil";
        IMPORTANT:
        String is NOT a primitive data type.
        String is a class in Java.
        */
                String name = "Nikhil";
                System.out.println("String value: " + name);
        /*

                        10. ARRAY
        An array is used to store multiple values of the SAME data type.
        Example: int[] numbers = {10, 20, 30, 40};
        Array indexing starts from 0.
        numbers[0] = 10
        numbers[1] = 20
        numbers[2] = 30
        numbers[3] = 40
        */
                int[] numbers = {10, 20, 30, 40};
                System.out.println("First array value: " + numbers[0]);
        /*

                    PRIMITIVE VS NON-PRIMITIVE
        Primitive:
        byte
        short
        int
        long
        float
        double
        char
        boolean

        Non-Primitive:
        String
        Arrays
        Classes
        Objects
        Interfaces
        Enums
        Main Difference:
        Primitive types are built into Java.
        Reference types refer to objects/data structures.
        */


        /*
      ==================================================================================================================
                      TYPE CASTING
        Type casting means converting one data type into another data type.
        There are two types:
        1. Widening Casting
        2. Narrowing Casting
        */
        /*

                    1. WIDENING CASTING
        Smaller compatible type -> Larger type
        Java automatically performs widening.
        Example:
        int x = 100;
        long y = x;
        No explicit casting is required.
        */
                int x = 100;
                long y = x;
                System.out.println("Widening result: " + y);
        /*

                    2. NARROWING CASTING
        Larger type -> Smaller type
        Explicit casting is required.
        Example:
        double a = 10.5;
        int b = (int) a;
        Output:
        10
        The decimal part is removed.
        */
                double a = 10.5;
                int b = (int) a;
                System.out.println("Narrowing result: " + b);
        /*

                    IMPORTANT LITERAL RULES
        Integer: int x = 100;

        Long:long x = 10000000000L;

        Float: float x = 10.5f;

        Double: double x = 10.5;

        Character: char x = 'A';

        String: String x = "Hello";

        Boolean: boolean x = true;
        */
        /*

                  DEFAULT VALUES OF VARIABLES
        IMPORTANT: These default values apply to INSTANCE and STATIC variables.
        Local variables do NOT get default values.
        Data Type       Default Value
        --------------------------------
        byte             0
        short            0
        int              0
        long             0L
        float            0.0f
        double           0.0d
        char             '\u0000'
        boolean          false
        reference        null

        Example:
        int x;
        System.out.println(x);
        This gives an error because x is a local
        variable and has not been initialized.
        */
        /*
        =====================================================
                       DATA TYPE SUMMARY
        =====================================================

        byte:
        Size = 1 byte
        Used for small integers

        short:
        Size = 2 bytes
        Used for small/medium integers

        int:
        Size = 4 bytes
        Most commonly used integer type

        long:
        Size = 8 bytes
        Used for very large integers

        float:
        Size = 4 bytes
        Decimal numbers, lower precision

        double:
        Size = 8 bytes
        Decimal numbers, higher precision

        char:
        Size = 2 bytes
        Stores a single character

        boolean:
        Stores true or false

        String:
        Stores text
        Reference type
        */


        /*
        =====================================================
                    QUICK MEMORY TRICK
        =====================================================

        Whole Numbers:
        ----------------
        byte -> short -> int -> long

        Decimal Numbers:
        ----------------
        float -> double

        Character:
        ----------------
        char

        True / False:
        ----------------
        boolean

        Text:
        ----------------
        String


        =====================================================
                         END OF NOTES
        =====================================================
        */

            }
        }
    }
}
