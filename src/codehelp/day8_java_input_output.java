package codehelp;
import java.util.Scanner;
public class day8_java_input_output {
    static void main() {
/*
              JAVA INPUT / OUTPUT - NOTES
Input: Input means taking data from the user/program source.

Output: Output means displaying information to the user.

In Java, the most commonly used class for taking keyboard input is:
Scanner

The most commonly used output methods are:
System.out.print()
System.out.println()
System.out.printf()

                  JAVA I/O BASICS
Java provides different ways to perform input/output.

Commonly used:
1. System.out.print()
2. System.out.println()
3. System.out.printf()
4. Scanner
5. BufferedReader
6. BufferedWriter
7. File input/output

For beginners, Scanner is the easiest way to take keyboard input.

                  PART 1: OUTPUT
Java provides the System class for standard input/output.

System.out
means standard output stream.

Common methods:
System.out.print()
System.out.println()
System.out.printf()
*/
         class JavaInputOutputNotes {
            public static void main(String[] args) {
        /*
                    1. System.out.print(
        print() displays output but DOES NOT move the cursor
        to the next line.

        Example:
        System.out.print("Hello");
        System.out.print("Java");

        Output:
        HelloJava
        */
                System.out.print("Hello");
                System.out.print(" Java");
                System.out.println();
        /*

                    2. System.out.println()
        println() displays output and moves the cursor to the next line.

        Example:
        System.out.println("Hello");
        System.out.println("Java");
        Otput:
        Hello
        Java
        */
                System.out.println("Hello");
                System.out.println("Java");
        /*

                    DIFFERENCE: print VS println
        print(): Does not move to the next line.

        println(): Moves to the next line after printing.
        */
                System.out.print("A");
                System.out.print("B");
                System.out.print("C");
                System.out.println();
                System.out.println("A");
                System.out.println("B");
                System.out.println("C");
        /*

                    3. PRINTING VARIABLES
        We can print variables using println().
        Example:
        int age = 20;
        System.out.println(age);
        */
                int age = 20;
                System.out.println("Age: " + age);
        /*

                    STRING CONCATENATION
        The + operator can be used to join stringsand variables.

        Example:
        String name = "Nikhil";
        int age = 20;
        System.out.println(
            "My name is " + name +
            " and my age is " + age
        );
        */
                String name = "Nikhil";
                int studentAge = 20;
                System.out.println(
                        "My name is " + name +
                                " and my age is " + studentAge
                );
        /*

                    IMPORTANT: + OPERATOR
        + has two common uses:
        1. Addition
        2. String concatenation

        Example:
        int a = 10;
        int b = 20;
        System.out.println(a + b);
        Output:
        30

        But:
        System.out.println("Sum = " + a + b);
        Output:
        Sum = 1020
        Because after a String is encountered, + performs string concatenation from left to right.
        Correct:
        System.out.println("Sum = " + (a + b));
        Output:
        Sum = 30
        */
                int a = 10;
                int b = 20;
                System.out.println("Addition: " + (a + b));
                System.out.println("Concatenation: " + a + b);
        /*

                    4. System.out.printf()
        printf() is used for formatted output.

        Common format specifiers:
        %d  -> Integer
        %f  -> Floating-point number
        %c  -> Character
        %s  -> String
        %b  -> Boolean
        %n  -> New line

        Example:
        int age = 20;
        System.out.printf("Age = %d%n", age);
        */
                int marks = 85;
                System.out.printf("Marks = %d%n", marks);
        /*

                    printf() EXAMPLES
        */
                String studentName = "Nikhil";
                int studentMarks = 90;
                double percentage = 90.5;
                char grade = 'A';
                boolean passed = true;
                System.out.printf("Name: %s%n", studentName);
                System.out.printf("Marks: %d%n", studentMarks);
                System.out.printf("Percentage: %f%n", percentage);
                System.out.printf("Grade: %c%n", grade);
                System.out.printf("Passed: %b%n", passed);
        /*

                    FORMATTING DECIMAL VALUES
        %.2f means:
        Print a floating-point value with 2 digits after the decimal point.

        Example:
        double price = 99.5678;
        %.2f
        Output:
        99.57
        */
                double price = 99.5678;
                System.out.printf("Price: %.2f%n", price);
        /*

                    PART 2: INPUT
        To take input from the keyboard, we commonly use:
        Scanner
        Scanner is available in:
        java.util.Scanner
        Therefore we need:
        import java.util.Scanner;
        Then create a Scanner object:
        Scanner sc = new Scanner(System.in);
        System.in represents standard input.
        */
        /*
                    CREATING SCANNER OBJECT
        Syntax:
        Scanner sc = new Scanner(System.in);
        sc is the Scanner object.
        System.in means input is taken from the keyboard.
        */
                Scanner sc = new Scanner(System.in);
        /*

                    1. nextInt()
        nextInt() is used to take an integer input.
        Example:
        int age = sc.nextInt();
        If the user enters: 20
        age will contain:20
        */
        /*
        NOTE:
        The following input examples are kept commented so this complete notes file can run without waiting
        for keyboard input.
        Uncomment them one at a time when practicing.

        Example:
        System.out.print("Enter your age: ");
        int userAge = sc.nextInt();
        System.out.println("Your age is: " + userAge);
        */
        /*

                    2. nextLong()

        nextLong() is used to take long integer input.

        Example:
        long number = sc.nextLong();
        */
        /*
        System.out.print("Enter a long number: ");
        long longNumber = sc.nextLong();
        System.out.println("Long number: " + longNumber);
        */
        /*

                    3. nextFloat()
        nextFloat() is used to take float input.

        Example:
        float temperature = sc.nextFloat();
        */
        /*
        System.out.print("Enter temperature: ");
        float temperature = sc.nextFloat();
        System.out.println("Temperature: " + temperature);
        */
        /*

                    4. nextDouble()
        nextDouble() is used to take double input.

        Example:
        double salary = sc.nextDouble();
        */
        /*
        System.out.print("Enter salary: ");
        double userSalary = sc.nextDouble();
        System.out.println("Salary: " + userSalary);
        */
        /*

                    5. nextShort()
        nextShort() is used to take short input.

        Example:
        short number = sc.nextShort();
        */
        /*
        System.out.print("Enter a short number: ");
        short shortNumber = sc.nextShort();
        System.out.println("Short number: " + shortNumber);
        */
        /*

                    6. nextByte()
        nextByte() is used to take byte input.

        Example:
        byte number = sc.nextByte();
        */
        /*
        System.out.print("Enter a byte number: ");
        byte byteNumber = sc.nextByte();
        System.out.println("Byte number: " + byteNumber);
        */
        /*

                    7. nextBoolean()
        nextBoolean() is used to take boolean input.
        Valid input:
        true
        false

        Example:
        boolean answer = sc.nextBoolean();
        */
        /*
        System.out.print("Are you a student? ");
        boolean answer = sc.nextBoolean();
        System.out.println("Answer: " + answer);
        */
        /*

                    8. next()
        next() reads ONE WORD.

        Example:
        Input:
        Nikhil Kumar
        next() reads only:
        Nikhil
        It stops when it encounters whitespace.
        */
        /*
        System.out.print("Enter your first name: ");
        String firstName = sc.next();
        System.out.println("First name: " + firstName);
        */
        /*

                    9. nextLine()
        nextLine() reads the COMPLETE LINE.

        Example:
        Input:
        Nikhil Kumar
        nextLine() reads:
        Nikhil Kumar
        */
        /*
        System.out.print("Enter your full name: ");
        String fullName = sc.nextLine();
        System.out.println("Full name: " + fullName);
        */
        /*

              IMPORTANT: next() VS nextLine()
        next():
        Reads only one word.
        Input:Hello Java
        Result:Hello

        nextLine():
        Reads the entire line.
        Input:Hello Java
        Result:Hello Java
        */
        /*

            IMPORTANT PROBLEM: nextInt() + nextLine()
        Consider:
        int age = sc.nextInt();
        String name = sc.nextLine();
        Sometimes nextLine() appears to be skipped.

        Why?
        nextInt() reads the number but leaves the
        newline character in the input buffer.
        Solution:
        Call nextLine() once after nextInt().

        Example:
        int age = sc.nextInt();
        sc.nextLine();
        String name = sc.nextLine();
        */
        /*

                    PRACTICE PROGRAM
              TAKING MULTIPLE INPUTS
        Program:

        Take:
        Name
        Age
        Marks
        and display them.

        Code:
        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Enter marks: ");
        double marks = sc.nextDouble();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
        */
        /*

                PRACTICE PROGRAM: ADD TWO NUMBERS
        Code:
        System.out.print("Enter first number: ");
        int first = sc.nextInt();
        System.out.print("Enter second number: ");
        int second = sc.nextInt();
        int sum = first + second;
        System.out.println("Sum = " + sum);
        */
        /*

                PRACTICE PROGRAM: CALCULATOR
        Take two numbers and perform:
        Addition
        Subtraction
        Multiplication
        Division
        Remainder

        Example:
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Addition = " + (a + b));
        System.out.println("Subtraction = " + (a - b));
        System.out.println("Multiplication = " + (a * b));
        System.out.println("Division = " + (a / b));
        System.out.println("Remainder = " + (a % b));
        */
        /*
                    SCANNER METHODS SUMMARY
        Method              Input Type
        --------------------------------------------
        nextByte()           byte
        nextShort()          short
        nextInt()            int
        nextLong()           long
        nextFloat()          float
        nextDouble()         double
        nextBoolean()        boolean
        next()               One word/String token
        nextLine()           Complete line/String

                    OUTPUT METHODS SUMMARY
        System.out.print()
        ------------------
        Prints output without moving to a new line.

        System.out.println()
        --------------------
        Prints output and moves to a new line.

        System.out.printf()
        -------------------
        Prints formatted output.


                    ESCAPE SEQUENCES
        Escape sequences are special characters used inside Strings.
        \n  -> New line
        \t  -> Tab
        \"  -> Double quote
        \'  -> Single quote
        \\  -> Backslash
        \b  -> Backspace
        \r  -> Carriage return

        Example:
        System.out.println("Hello\nJava");
        Output:
        Hello
        Java

        Example:
        System.out.println("Hello\tJava");
        Output:
        Hello    Java
        */
                System.out.println("Hello\nJava");
                System.out.println("Hello\tJava");
        /*

                    EXAMPLE OF ESCAPE SEQUENCE
        */
                System.out.println("He said \"Hello\"");
                System.out.println("Java\\Programming");
        /*

                    CLOSING SCANNER
        After finishing input, Scanner can be closed:
        sc.close();

        IMPORTANT:
        Closing Scanner connected to System.in also closes
        the standard input stream.
        Therefore, don't close it if you still need to
        read more keyboard input later in the same program.
        */
                sc.close();
        /*

                    QUICK REVISION
        OUTPUT:
        print()
        -> Prints without new line.
        println()
        -> Prints with new line.
        printf()
        -> Prints formatted output.

        INPUT:
        Scanner
        -> Common class for keyboard input.
        nextInt()
        -> int
        nextDouble()
        -> double
        nextFloat()
        -> float
        nextLong()
        -> long
        next()
        -> One word
        nextLine()
        -> Complete line

        ESCAPE SEQUENCES:
        \n -> New line
        \t -> Tab
        \" -> Double quote
        \\ -> Backslash

                    IMPORTANT EXAM POINTS
        1. Scanner belongs to java.util package.
        2. To use Scanner:
        import java.util.Scanner;
        3. Create Scanner object:
        Scanner sc = new Scanner(System.in);
        4. System.in is used for standard input.
        5. System.out is used for standard output.
        6. next() reads one word.
        7. nextLine() reads the complete line.
        8. print() does not move to a new line.
        9. println() moves to a new line.
        10. printf() is used for formatted output.
        */

            }
        }

    }
}
