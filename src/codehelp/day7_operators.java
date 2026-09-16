package codehelp;

public class day7_operators {
    static void main() {
/*
                JAVA OPERATORS - NOTES
Operator: An operator is a symbol that is used to perform an operation on one or more values/variables.
Example:
int a = 10;
int b = 20;

int sum = a + b;
Here:
+  = Operator
a, b = Operands

              TYPES OF OPERATORS IN JAVA
Java operators are mainly divided into:
1. Arithmetic Operators
2. Assignment Operators
3. Relational Operators
4. Logical Operators
5. Unary Operators
6. Bitwise Operators
7. Shift Operators
8. Ternary Operator
9. instanceof Operator

              1. ARITHMETIC OPERATORS
Arithmetic operators are used to perform mathematical operations.
Operators:
+   Addition
-   Subtraction
*   Multiplication
/   Division
%   Modulus (Remainder)
Example:
int a = 20;
int b = 10;

a + b  -> 30
a - b  -> 10
a * b  -> 200
a / b  -> 2
a % b  -> 0
*/
        class JavaOperatorsNotes {
            public static void main(String[] args) {
        /*

                    1. ARITHMETIC OPERATOR
        */
                int a = 20;
                int b = 10;
                // Addition
                int addition = a + b;

                // Subtraction
                int subtraction = a - b;

                // Multiplication
                int multiplication = a * b;

                // Division
                int division = a / b;

                // Modulus
                int remainder = a % b;

                System.out.println("Addition: " + addition);
                System.out.println("Subtraction: " + subtraction);
                System.out.println("Multiplication: " + multiplication);
                System.out.println("Division: " + division);
                System.out.println("Remainder: " + remainder);
        /*

                    IMPORTANT: INTEGER DIVISION
        When two integers are divided, Java performs integer division.
        Example:
        int x = 10;
        int y = 3;
        x / y = 3

        The decimal part is discarded.
        If you want a decimal result: double result = 10.0 / 3;

        Result will be approximately: 3.333333...
        */
                int x = 10;
                int y = 3;
                System.out.println("Integer division: " + (x / y));
                double result = 10.0 / 3;
                System.out.println("Decimal division: " + result);
        /*

                    MODULUS OPERATOR (%)
        % gives the REMAINDER after division.
        Example: m10 % 3 = 1
        Because: 10 / 3 = 3 remainder 1

        Common uses:
        1. Checking even/odd
        2. Finding remainder
        3. Cyclic operations
        */
                int number = 10;
                System.out.println("Remainder: " + (number % 3));
                // Check even number
                if (number % 2 == 0) {
                    System.out.println("Number is Even");
                }
        /*

                    2. ASSIGNMENT OPERATORS
        Assignment operators are used to assign value to variables.
        Basic assignment: =
        Example:
        int x = 10;
        Here:
        = assigns 10 to x.

        Compound assignment operators:
        +=
        -=
        *=
        /=
        %=
        */
                int value = 10;

                // +=
                value += 5;
                System.out.println("After += : " + value);

                // -=
                value -= 3;
                System.out.println("After -= : " + value);

                // *=
                value *= 2;
                System.out.println("After *= : " + value);

                // /=
                value /= 4;
                System.out.println("After /= : " + value);

                // %=
                value %= 3;
                System.out.println("After %= : " + value);
        /*

                    ASSIGNMENT OPERATOR TABLE
        Operator       Meaning
        =              x = 10
        +=             x = x + 10
        -=             x = x - 10
        *=             x = x * 10
        /=             x = x / 10
        %=             x = x % 10
        */
        /*
                    3. RELATIONAL OPERATOR
        Relational operators are used to compare two values.
        The result is always:
        true
        OR
        false

        Operators:
        ==    Equal to
        !=    Not equal to
        >     Greater than
        <     Less than
        >=    Greater than or equal to
        <=    Less than or equal to
        */
                int p = 20;
                int q = 10;

                System.out.println(p == q);
                System.out.println(p != q);
                System.out.println(p > q);
                System.out.println(p < q);
                System.out.println(p >= q);
                System.out.println(p <= q);
        /*

                    RELATIONAL OPERATOR EXAMPLE
        */
                int marks = 75;
                if (marks >= 40) {
                    System.out.println("Passed");
                }
        /*

                    IMPORTANT:
                    = VS ==
        = Assignment operator.
        Example: int x = 10;

        == Comparison operator.
        Example: x == 10

        Remember:
        =   -> Assign
        ==  -> Compare
        */
        /*

                    4. LOGICAL OPERATORS
        Logical operators are mainly used with boolean expressions.
        Operators:
        &&    Logical AND
        ||    Logical OR
        !     Logical NOT
        */
        /*

                    LOGICAL AND (&&)
        Returns true ONLY when both conditions are true.

        true && true   -> true
        true && false  -> false
        false && true  -> false
        false && false -> false
        */
                int age = 20;
                if (age >= 18 && age <= 60) {
                    System.out.println("Age is between 18 and 60");
                }
        /*
                    LOGICAL OR (||)
        Returns true when AT LEAST ONE condition is true.

        true || true   -> true
        true || false  -> true
        false || true  -> true
        false || false -> false
        */
                boolean hasID = true;
                boolean hasPermission = false;
                if (hasID || hasPermission) {
                    System.out.println("Condition is true");
                }
        /*
                    LOGICAL NOT (!)
        NOT reverses a boolean value.

        !true  -> false
        !false -> true
        */
                boolean isRaining = false;
                if (!isRaining) {
                    System.out.println("It is not raining");
                }
        /*

                    5. UNARY OPERATORS
        Unary operators work with ONLY ONE operand.

        Operators:
        +       Unary plus
        -       Unary minus
        ++      Increment
        --      Decrement
        !       Logical NOT

        Example:
        int x = 10;
        ++x;
        --x;
        */
                int n = 10;
                // Unary plus
                System.out.println(+n);
                // Unary minus
                System.out.println(-n);
        /*

                    INCREMENT OPERATOR
        ++ increases the value by 1.
        x++;
        is equivalent to:
        x = x + 1;
        */
                int count = 5;
                count++;
                System.out.println("After increment: " + count);
        /*

                    DECREMENT OPERATOR

        -- decreases the value by 1.
        x--;
        is equivalent to:
        x = x - 1;
        */
                count--;
                System.out.println("After decrement: " + count);
        /*

                    PRE-INCREMENT
        ++x
        First increases the value.
        Then uses the value.
        */
                int pre = 10;
                int preResult = ++pre;
                System.out.println("Pre-increment result: " + preResult);
                System.out.println("Pre value: " + pre);
        /*

                    POST-INCREMENT
        x++
        First uses the current value.
        Then increases the value.
        */
                int post = 10;
                int postResult = post++;
                System.out.println("Post-increment result: " + postResult);
                System.out.println("Post value: " + post);
        /*

                    PRE-DECREMENT
        --x
        First decreases the value.
        Then uses the value.
        */
                int preDec = 10;
                int preDecResult = --preDec;
                System.out.println("Pre-decrement result: " + preDecResult);
        /*

                    POST-DECREMENT
        x--
        First uses the current value.
        Then decreases the value.
        */
                int postDec = 10;
                int postDecResult = postDec--;
                System.out.println("Post-decrement result: " + postDecResult);
                System.out.println("Post-decrement value: " + postDec);
        /*

                    6. BITWISE OPERATORS
        Bitwise operators work at the level of individual bits of integer values.

        Operators:
        &     Bitwise AND
        |     Bitwise OR
        ^     Bitwise XOR
        ~     Bitwise NOT
        Example:
        5 in binary:
        0101
        3 in binary:
        0011
        */
                int bitA = 5;
                int bitB = 3;
        /*

                    BITWISE AND (&)
        5 = 0101
        3 = 0011
        0101
        0011
        ----
        0001
        Result = 1
        */
                System.out.println("Bitwise AND: " + (bitA & bitB));
        /*

                    BITWISE OR (|)
        0101
        0011
        ----
        0111
        Result = 7
        */
                System.out.println("Bitwise OR: " + (bitA | bitB));
        /*

                    BITWISE XOR (^)
        XOR gives 1 when the two bits are different.
        0101
        0011
        ----
        0110
        Result = 6
        */
                System.out.println("Bitwise XOR: " + (bitA ^ bitB));
        /*

                    BITWISE NOT (~)
        ~ changes every bit.
        For signed integer values, Java uses two's complement representation.
        Important identity:
        ~x = -(x + 1)
        Example:
        ~5 = -6
        */
                System.out.println("Bitwise NOT: " + (~bitA));
        /*

                    7. SHIFT OPERATORS
        Shift operators move bits left or right.
        Operators:
        <<    Left shift
        >>    Signed right shift
        >>>   Unsigned right shift
        */
        /*

                    LEFT SHIFT (<<)
        Moves bits to the LEFT.
        Example:
        5 << 1
        5 = 0101
        Shift left by 1:
        1010
        Result = 10
        For suitable positive integers:
        x << n
        is equivalent to multiplying by 2^n.
        */
                int left = 5;
                System.out.println("Left shift: " + (left << 1));
        /*

                    RIGHT SHIFT (>>)
        Moves bits to the RIGHT.
        It preserves the sign bit.
        Example:
        20 >> 2
        Result = 5
        */
                int right = 20;
                System.out.println("Right shift: " + (right >> 2));
        /*

                    UNSIGNED RIGHT SHIFT (>>>)
        Shifts bits to the right and fills the left side with zeros.
        It does not preserve the sign in the same way as >>.
        */
                int unsigned = -20;
                System.out.println("Unsigned right shift: " + (unsigned >>> 2));
        /*

                    8. TERNARY OPERATOR
        The ternary operator is a short form of if-else.
        Syntax:
        condition ? valueIfTrue : valueIfFalse

        Example:
        int age = 20;
        String result =
                age >= 18 ? "Adult" : "Minor";
        */
                int studentAge = 20;
                String ageResult =
                        studentAge >= 18 ? "Adult" : "Minor";
                System.out.println("Ternary result: " + ageResult);
        /*
        Another example:
        Find the greater number.
        */
                int num1 = 50;
                int num2 = 30;
                int greater =
                        num1 > num2 ? num1 : num2;
                System.out.println("Greater number: " + greater);
        /*

                    9. instanceof OPERATOR
        instanceof is used to check whether an object is an instance of a particular class or type.
        Syntax:
        object instanceof ClassName
        Example:
        String name = "Java";
        name instanceof String
        Result:
        true
        */
                String language = "Java";
                boolean check =
                        language instanceof String;
                System.out.println("Is String? " + check);
        /*

                OPERATOR PRECEDENCE
        Operator precedence determines which operator is evaluated first.
        A simplified order is:
        1. ()
        2. Unary: ++ -- + - !
        3. * / %
        4. + -
        5. << >> >>>
        6. < <= > >= instanceof
        7. == !=
        8. &
        9. ^
        10. |
        11. &&
        12. ||
        13. ?:
        14. Assignment: = += -= *= /= %= ...

        Example:
        int result = 10 + 5 * 2;
        First:
        5 * 2 = 10
        Then:
        10 + 10 = 20
        Result:
        20
        */
                int precedenceResult = 10 + 5 * 2;
                System.out.println(
                        "Precedence result: " + precedenceResult
                );
        /*

                USING PARENTHESES
        Parentheses can change the order of evaluation.
        Example:
        10 + 5 * 2
        Result = 20
        (10 + 5) * 2
        Result = 30
        */
                int result1 = 10 + 5 * 2;
                int result2 = (10 + 5) * 2;
                System.out.println("Without parentheses: " + result1);
                System.out.println("With parentheses: " + result2);
        /*

                COMPLETE OPERATOR SUMMARY
        Arithmetic:
        +  -  *  /  %

        Assignment:
        =  +=  -=  *=  /=  %=

        Relational:
        ==  !=  >  <  >=  <=

        Logical:
        &&  ||  !

        Unary:
        +  -  ++  --  !

        Bitwise:
        &  |  ^  ~

        Shift:
        <<  >>  >>>

        Ternary:
        ?:

        Type checking:
        instanceof

                    IMPORTANT DIFFERENCES
        1. = vs ==
        =  -> Assignment
        == -> Comparison

        2. && vs &
        && -> Logical AND
        &  -> Bitwise AND

        3. || vs |
        || -> Logical OR
        |  -> Bitwise OR

        4. ++x vs x++
        ++x -> Pre-increment
        x++ -> Post-increment

        5. --x vs x--
        --x -> Pre-decrement
        x-- -> Post-decrement

                    QUICK EXAM REVISION
        Arithmetic:
        Used for mathematical calculations.

        Assignment:
        Used to assign/update values.

        Relational:
        Used to compare values.
        Returns true or false.

        Logical:
        Used to combine boolean conditions.

        Unary:
        Works on one operand.

        Bitwise:
        Works on individual bits.

        Shift:
        Moves bits left or right.

        Ternary:
        Short form of if-else.

        instanceof:
        Checks an object's type.

        */

            }
        }

    }
}
