package codehelp;

public class day10_loops_in_java {
    static void main() {
/*
JAVA LOOPS - NOTES
A loop is used to execute a block of code repeatedly as long as a condition is satisfied.

Loops are useful when we need to perform the same operation multiple times.

Example:
Print "Hello" 5 times.

Without loop:
System.out.println("Hello");
System.out.println("Hello");
System.out.println("Hello");
System.out.println("Hello");
System.out.println("Hello");

With loop:
for (int i = 1; i <= 5; i++) {
    System.out.println("Hello");
}
TYPES OF LOOPS IN JAVA
1. for loop
2. while loop
3. do-while loop
4. enhanced for loop (for-each)

LOOP CONTROL STATEMENTS
1. break
2. continue
*/
        class JavaLoopsNotes {
            public static void main(String[] args) {
        /*
                    1. FOR LOOP


        The for loop is generally used when we know how many times we want to execute a block.
        Syntax:
        for (initialization; condition; update) {
            // code
        }
        Execution order:
        1. Initialization
        2. Condition
        3. Code execution
        4. Update
        5. Condition
        6. Code execution
        7. Update
        8. Continue until condition becomes false

        Example:
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
        Output:

        1
        2
        3
        4
        5
        */
                for (int i = 1; i <= 5; i++) {
                    System.out.println(i);
                }
        /*
        FOR LOOP PARTS

        for (int i = 1; i <= 5; i++)
        int i = 1
        -> Initialization
        i <= 5
        -> Condition
        i++
        -> Update
        */
        /*
                    2. PRINT NUMBERS FROM 1 TO 10


        */
                for (int i = 1; i <= 10; i++) {
                    System.out.println("Number: " + i);
                }
        /*


                    3. PRINT NUMBERS FROM 10 TO 1
        We can decrease the counter using --.
        */
                for (int i = 10; i >= 1; i--) {
                    System.out.println(i);
                }
        /*


                    4. PRINT EVEN NUMBERS
        Even numbers are divisible by 2.
        Condition:
        i % 2 == 0
        */
                for (int i = 1; i <= 20; i++) {
                    if (i % 2 == 0) {
                        System.out.println("Even: " + i);
                    }
                }
        /*


                    5. PRINT ODD NUMBERS
        Odd numbers are not divisible by 2.
        Condition:
        i % 2 != 0
        */
                for (int i = 1; i <= 20; i++) {
                    if (i % 2 != 0) {
                        System.out.println("Odd: " + i);
                    }
                }
        /*


                    6. SUM OF NUMBERS
        Find the sum of numbers from 1 to 10.
        Formula:
        1 + 2 + 3 + ... + 10
        */
                int sum = 0;
                for (int i = 1; i <= 10; i++) {
                    sum = sum + i;
                }
                System.out.println("Sum: " + sum);
        /*


                    7. MULTIPLICATION TABLE
        Print the multiplication table of 5.
        */
                int table = 5;
                for (int i = 1; i <= 10; i++) {
                    System.out.println(
                            table + " x " + i + " = " + (table * i)
                    );
                }
        /*


                    8. WHILE LOOP
        The while loop executes a block of code as long as the condition is true.

        Syntax:
        while (condition) {
            // code
        }

        Example:
        int i = 1;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }

        IMPORTANT:
        The update statement must be written manually in a while loop when needed.
        Otherwise, the loop may become infinite.
        */
                int i = 1;
                while (i <= 5) {
                    System.out.println("While: " + i);
                    i++;
                }
        /*


                    9. WHILE LOOP EXAMPLE
        Print numbers from 1 to 10.
        */
                int number = 1;
                while (number <= 10) {
                    System.out.println(number);
                    number++;
                }
        /*


                    10. REVERSE USING WHILE LOOP
        Print numbers from 10 to 1.
        */
                int reverse = 10;
                while (reverse >= 1) {
                    System.out.println(reverse);
                    reverse--;
                }

        /*


                    11. DO-WHILE LOOP
        The do-while loop executes the code at least ONE TIME.

        Syntax:
        do {
            // code
        } while (condition);

        Execution:
        1. Execute the code
        2. Check the condition
        3. If true, execute again
        4. If false, stop

        Example:
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 5);
        */
                int doNumber = 1;
                do {
                    System.out.println("Do-While: " + doNumber);
                    doNumber++;
                } while (doNumber <= 5);
        /*


                    12. IMPORTANT DIFFERENCE
        while checks the condition FIRST.
        do-while executes the code FIRST
        and checks the condition AFTERWARDS.
        */
                int whileNumber = 10;
                while (whileNumber < 5) {
                    System.out.println("While executed");
                }
                int doWhileNumber = 10;
                do {
                    System.out.println("Do-while executed");
                } while (doWhileNumber < 5);
        /*
        In the above example:
        while loop:
        Executes 0 times.
        do-while loop:
        Executes 1 time.

        Therefore:
        while -> May execute zero times.
        do-while -> Executes at least once.
        */
        /*


                    13. ENHANCED FOR LOOP / FOR-EACH LOOP
        Enhanced for loop is mainly used to traverse arrays and collections.

        Syntax:
        for (dataType variable : array) {
            // code
        }

        Example:
        int[] numbers = {10, 20, 30, 40};
        for (int n : numbers) {
            System.out.println(n);
        }
        */
                int[] numbers = {10, 20, 30, 40, 50};
                for (int n : numbers) {
                    System.out.println("Array value: " + n);
                }
        /*


                    14. FOR-EACH WITH STRING ARRAY
        */
                String[] names = {
                        "Nikhil",
                        "Rahul",
                        "Aman",
                        "Rohit"
                };
                for (String name : names) {
                    System.out.println("Name: " + name);
                }
        /*


                    15. NESTED LOOPS
        A loop inside another loop is called a nested loop.

        Example:
        for (outer loop) {
            for (inner loop) {
            }
        }
        The inner loop executes completely for every iteration of the outer loop.
        */
                for (int outer = 1; outer <= 3; outer++) {
                    for (int inner = 1; inner <= 3; inner++) {
                        System.out.println(
                                "Outer: " + outer +
                                        " Inner: " + inner
                        );
                    }
                }
        /*


                    16. NESTED LOOP TABLE

        Example:
        Outer loop:
        1
        2
        3

        Inner loop:
        1
        2
        3

        Total iterations:
        3 x 3 = 9
        */
        /*


                    17. PRINT STAR PATTERN
        Output:
        *
        **
        ***
        ****
        *****
        Outer loop controls rows.
        Inner loop controls stars.
        */
                for (int row = 1; row <= 5; row++) {
                    for (int column = 1; column <= row; column++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
        /*


                    18. RECTANGLE STAR PATTERN
        Output:
        *****
        *****
        *****
        *****
        *****
        5 rows
        5 columns
        */
                for (int row = 1; row <= 5; row++) {
                    for (int column = 1; column <= 5; column++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
        /*


                    19. BREAK STATEMENT
        break is used to immediately terminate the loop.

        Example:
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }

        Output:
        1
        2
        3

        When i becomes 5, break stops the loop.
        */
                for (int j = 1; j <= 10; j++) {
                    if (j == 5) {
                        break;
                    }
                    System.out.println("Break: " + j);
                }
        /*


                    20. CONTINUE STATEMENT
        continue skips the current iteration and moves to the next iteration.

        Example:
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println(i);
        }
        Output:
        1
        2
        4
        5
        3 is skipped.
        */
                for (int j = 1; j <= 5; j++) {
                    if (j == 3) {
                        continue;
                    }
                    System.out.println("Continue: " + j);
                }
        /*


                    21. BREAK VS CONTINUE
        break:
        -> Completely stops the loop.
        continue:
        -> Skips only the current iteration.
        */
        /*


                    22. INFINITE LOOP
        A loop that never ends is called an infinite loop.

        Example:
        while (true) {
            System.out.println("Hello");
        }

        Another example:
        for (;;) {
            System.out.println("Hello");
        }

        Be careful with infinite loops because they can keep running until the program is stopped.
        */
        /*


                    23. MULTIPLE VARIABLES IN FOR LOOP
        A for loop can contain more than one initialization/update expression.

        Example:
        for (int x = 1, y = 10; x <= 5; x++, y--) {
            System.out.println(x + " " + y);
        }
        */
                for (int x = 1, y = 10; x <= 5; x++, y--) {
                    System.out.println(
                            "x = " + x + ", y = " + y
                    );
                }
        /*


                    24. SUM OF EVEN NUMBERS
        Find the sum of even numbers from 1 to 20.
        */
                int evenSum = 0;
                for (int k = 1; k <= 20; k++) {
                    if (k % 2 == 0) {
                        evenSum += k;
                    }
                }
                System.out.println("Sum of even numbers: " + evenSum);
        /*


                    25. FACTORIAL
        Factorial of 5:
        5! = 5 x 4 x 3 x 2 x 1 = 120
        */
                int factorialNumber = 5;
                int factorial = 1;
                for (int k = 1; k <= factorialNumber; k++) {
                    factorial *= k;
                }
                System.out.println(
                        "Factorial: " + factorial
                );
        /*


                    26. REVERSE A NUMBER
        Example:
        Number = 12345
        Reverse = 54321
        Logic:
        Get last digit using % 10.
        Remove last digit using / 10.
        */
                int originalNumber = 12345;
                int reversedNumber = 0;
                while (originalNumber != 0) {
                    int digit = originalNumber % 10;
                    reversedNumber =
                            reversedNumber * 10 + digit;
                    originalNumber /= 10;
                }
                System.out.println(
                        "Reversed number: " + reversedNumber
                );
        /*


                    27. COUNT DIGITS
        Example:
        Number = 12345
        Number of digits = 5
        */
                int countNumber = 12345;
                int digitCount = 0;
                while (countNumber != 0) {
                    countNumber /= 10;
                    digitCount++;
                }
                System.out.println(
                        "Number of digits: " + digitCount
                );


        /*


                    28. SUM OF DIGITS
        Example:
        Number = 1234
        1 + 2 + 3 + 4 = 10
        */
                int sumNumber = 1234;
                int digitSum = 0;
                while (sumNumber != 0) {
                    int digit = sumNumber % 10;
                    digitSum += digit;
                    sumNumber /= 10;
                }
                System.out.println(
                        "Sum of digits: " + digitSum
                );
        /*


                    29. PALINDROME NUMBER
        A number is a palindrome if it remains the same when reversed.

        Examples:
        121 -> Palindrome
        1221 -> Palindrome
        123 -> Not Palindrome
        */
                int palindromeNumber = 121;
                int original = palindromeNumber;
                int reverseNumber = 0;
                while (palindromeNumber != 0) {
                    int digit = palindromeNumber % 10;
                    reverseNumber =
                            reverseNumber * 10 + digit;
                    palindromeNumber /= 10;
                }
                if (original == reverseNumber) {
                    System.out.println("Palindrome");
                } else {
                    System.out.println("Not Palindrome");
                }
        /*


                    30. PRIME NUMBER
        A prime number has exactly two positive factors:1
        and itself.

        Examples:
        2
        3
        5
        7
        11
        are prime numbers.
        */
                int primeNumber = 17;
                boolean isPrime = true;
                if (primeNumber <= 1) {
                    isPrime = false;
                } else {
                    for (int k = 2;
                         k * k <= primeNumber;
                         k++) {
                        if (primeNumber % k == 0) {
                            isPrime = false;
                            break;
                        }
                    }
                }
                if (isPrime) {
                    System.out.println("Prime Number");
                } else {
                    System.out.println("Not a Prime Number");
                }
        /*


                    31. LOOP CONTROL SUMMARY
        break
        -> Terminates the loop completely.
        continue
        -> Skips the current iteration.

        Example:
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break;
            }
        }

        Example:
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue;
            }
        }


                    32. FOR VS WHILE VS DO-WHILE
        FOR LOOP:
        Use when the number of iterations is
        generally known.

        Example:
        for (int i = 1; i <= 10; i++)

        WHILE LOOP:
        Use when the number of iterations may
        depend on a condition.

        Example:
        while (number > 0)

        DO-WHILE:
        Use when the code must execute at least once.

        Example:
        do {
            // code
        } while (condition);

        ENHANCED FOR:
        Use for easy traversal of arrays and collections.

        Example:
        for (int n : numbers)
        */
        /*
        QUICK REVISION TABLE
        Loop              Main Use
        for                Known/repeated count
        while              Condition-based repetition
        do-while            Executes at least once
        for-each             Arrays/collections

        CONTROL STATEMENTS
        break               Stops loop
        continue             Skips current iteration

        IMPORTANT POINTS
        1. A loop repeats a block of code.
        2. for loop contains:
           initialization
           condition
           update
        3. while checks condition before execution.
        4. do-while checks condition after execution.
        5. do-while executes at least once.
        6. Nested loop means loop inside another loop.
        7. break terminates the loop.
        8. continue skips the current iteration.
        9. for-each is useful for arrays and collections.
        10. Always make sure your loop condition
            eventually becomes false unless an
            infinite loop is intentional.
        */
            }
        }
    }
}
