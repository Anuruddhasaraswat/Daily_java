package codehelp;

public class day9_conditionla_in_java {
    static void main() {

/*
JAVA CONDITIONALS - NOTES
Conditional statements are used to make decisions in a Java program.

They allow the program to execute different blocks of code depending on whether a condition is:
true
or
false

Types of Conditional Statements:
1. if statement
2. if-else statement
3. if-else-if ladder
4. Nested if statement
5. switch statement
6. Ternary operator
*/

        class JavaConditionalsNotes {
            public static void main(String[] args) {
        /*
                    1. IF STATEMENT

        The if statement executes a block of code only
        when the condition is true.

        Syntax:
        if (condition) {
            // code
        }

        Example:
        if (age >= 18) {
            System.out.println("Adult");
        }
        */
                int age = 20;
                if (age >= 18) {
                    System.out.println("Age is 18 or above");
                }
        /*

        IF STATEMENT EXAMPLE
        Check whether a number is positive.
        */
                int number = 10;
                if (number > 0) {
                    System.out.println("Number is Positive");
                }
        /*

        IF WITH RELATIONAL OPERATORS
        Relational operators:
        ==   Equal
        !=   Not equal
        >    Greater than
        <    Less than
        >=   Greater than or equal
        <=   Less than or equal
        */
                int marks = 80;
                if (marks >= 40) {
                    System.out.println("Student Passed");
                }
        /*

                    2. IF-ELSE STATEMENT
        if-else is used when there are TWO possible
        outcomes.
        Syntax:
        if (condition) {
            // code when condition is true
        } else {
            // code when condition is false
        }
        */
                int studentMarks = 75;
                if (studentMarks >= 40) {
                    System.out.println("Pass");
                } else {
                    System.out.println("Fail");
                }
        /*

        EVEN OR ODD PROGRAM
        If:
        number % 2 == 0
        Number is Even.
        Otherwise:
        Number is Odd.
        */
                int num = 17;
                if (num % 2 == 0) {
                    System.out.println("Even Number");
                } else {
                    System.out.println("Odd Number");
                }
        /*

        POSITIVE / NEGATIVE
        */
                int value = -10;

                if (value >= 0) {
                    System.out.println("Positive Number");
                } else {
                    System.out.println("Negative Number");
                }
        /*


                    3. IF-ELSE-IF LADDER
        An if-else-if ladder is used when there are MULTIPLE conditions.

        Syntax:
        if (condition1) {
        } else if (condition2) {
        } else if (condition3) {
        } else {
        }
        Java checks conditions from TOP to BOTTOM.
        As soon as one condition becomes true,ts block is executed.
        */
                int score = 85;
                if (score >= 90) {
                    System.out.println("Grade A+");
                } else if (score >= 80) {
                    System.out.println("Grade A");
                } else if (score >= 70) {
                    System.out.println("Grade B");
                } else if (score >= 60) {
                    System.out.println("Grade C");
                } else if (score >= 40) {
                    System.out.println("Grade D");
                } else {
                    System.out.println("Fail");
                }
        /*

        GRADING EXAMPLE
        Marks:
        90 - 100  -> A+
        80 - 89   -> A
        70 - 79   -> B
        60 - 69   -> C
        40 - 59   -> D
        Below 40  -> Fail
        */
                int studentScore = 92;
                if (studentScore >= 90) {
                    System.out.println("Grade: A+");
                } else if (studentScore >= 80) {
                    System.out.println("Grade: A");
                } else if (studentScore >= 70) {
                    System.out.println("Grade: B");
                } else if (studentScore >= 60) {
                    System.out.println("Grade: C");
                } else if (studentScore >= 40) {
                    System.out.println("Grade: D");
                } else {
                    System.out.println("Grade: Fail");
                }
        /*


                    4. NESTED IF
        An if statement inside another if statement
        is called a nested if.

        Syntax:
        if (condition1) {
            if (condition2) {
            }
        }
        The inner condition is checked only when the outer condition is true.
        */
                int userAge = 20;
                boolean hasID = true;
                if (userAge >= 18) {
                    if (hasID) {
                        System.out.println("Entry Allowed");
                    }
                }
        /*

        NESTED IF-ELSE EXAMPLE
        Check:
        1. Is student passed?
        2. If passed, check performance.
        */
                int marks2 = 85;
                if (marks2 >= 40) {
                    System.out.println("Student Passed");
                    if (marks2 >= 80) {
                        System.out.println("Excellent Performance");
                    } else {
                        System.out.println("Good Performance");
                    }
                } else {
                    System.out.println("Student Failed");
                }
        /*


                    5. LOGICAL OPERATORS WITH IF
        Logical operators:
        && -> AND
        || -> OR
        !  -> NOT
        */
                int personAge = 25;
                if (personAge >= 18 && personAge <= 60) {
                    System.out.println("Age is between 18 and 60");
                }
        /*

        LOGICAL OR EXAMPLE
        || returns true when at least one condition
        is true.
        */
                boolean hasTicket = true;
                boolean isVIP = false;
                if (hasTicket || isVIP) {
                    System.out.println("Can Enter");
                }
        /*

        LOGICAL NOT EXAMPLE
        !true  -> false
        !false -> true
        */
                boolean raining = false;
                if (!raining) {
                    System.out.println("No Rain");
                }
        /*


                    6. MULTIPLE CONDITIONS
        Multiple conditions can be combined using:

        &&
        ||
        !
        */
                int studentAge2 = 20;
                int studentMarks2 = 80;
                if (studentAge2 >= 18 && studentMarks2 >= 40) {
                    System.out.println("Eligible");
                }
        /*


                    7. SWITCH STATEMENT
        switch is useful when we want to compare
        one expression against multiple fixed values.

        Syntax:
        switch (expression) {
            case value1:
                // code
                break;
            case value2:
                // code
                break;
            default:
                // code
        }
        break stops execution from continuing into
        the next case.
        */
                int day = 2;
                switch (day) {
                    case 1:
                        System.out.println("Monday");
                        break;
                    case 2:
                        System.out.println("Tuesday");
                        break;
                    case 3:
                        System.out.println("Wednesday");
                        break;
                    case 4:
                        System.out.println("Thursday");
                        break;
                    case 5:
                        System.out.println("Friday");
                        break;
                    case 6:
                        System.out.println("Saturday");
                        break;
                    case 7:
                        System.out.println("Sunday");
                        break;
                    default:
                        System.out.println("Invalid Day");
                }
        /*

        SWITCH WITH CHAR
        */
                char grade = 'A';
                switch (grade) {
                    case 'A':
                        System.out.println("Excellent");
                        break;
                    case 'B':
                        System.out.println("Good");
                        break;
                    case 'C':
                        System.out.println("Average");
                        break;
                    default:
                        System.out.println("Invalid Grade");
                }
        /*

        SWITCH WITH STRING
        switch can also be used with String values.
        */
                String fruit = "Apple";
                switch (fruit) {
                    case "Apple":
                        System.out.println("Apple");
                        break;
                    case "Banana":
                        System.out.println("Banana");
                        break;
                    case "Mango":
                        System.out.println("Mango");
                        break;
                    default:
                        System.out.println("Unknown Fruit");
                }
        /*

        SWITCH WITHOUT BREAK
        If break is not used, execution can continue into the next cases.
        This is called FALL-THROUGH.

        Example:
        switch (number) {
            case 1:
                System.out.println("One");
            case 2:
                System.out.println("Two");
        }
        If number = 1:
        One
        Two
        will be printed.
        */
        /*


                    8. SWITCH WITH MULTIPLE CASES
        Multiple cases can execute the same block.

        Example:
        1 to 5 -> Weekday
        6 and 7 -> Weekend
        */
                int dayNumber = 6;
                switch (dayNumber) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                        System.out.println("Weekday");
                        break;
                    case 6:
                    case 7:
                        System.out.println("Weekend");
                        break;
                    default:
                        System.out.println("Invalid Day");
                }
        /*


                    9. SWITCH EXPRESSION
        Modern Java supports switch expressions.

        Example:
        String result = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            default -> "Invalid";
        };
        The arrow (->) form does not require break.
        */
                int dayValue = 3;
                String dayName = switch (dayValue) {
                    case 1 -> "Monday";
                    case 2 -> "Tuesday";
                    case 3 -> "Wednesday";
                    case 4 -> "Thursday";
                    case 5 -> "Friday";
                    case 6 -> "Saturday";
                    case 7 -> "Sunday";
                    default -> "Invalid Day";
                };

                System.out.println("Day: " + dayName);
        /*


                    10. TERNARY OPERATOR
        The ternary operator is a short form of if-else.

        Syntax:
        condition ? valueIfTrue : valueIfFalse

        Example:
        int age = 20;
        String result =
                age >= 18 ? "Adult" : "Minor";
        */
                int age3 = 20;
                String ageResult =
                        age3 >= 18 ? "Adult" : "Minor";
                System.out.println(ageResult);
        /*

        TERNARY EXAMPLE
        FIND GREATER NUMBER
        */
                int firstNumber = 50;
                int secondNumber = 30;
                int greaterNumber =
                        firstNumber > secondNumber
                                ? firstNumber
                                : secondNumber;

                System.out.println("Greater number: " + greaterNumber);
        /*


                    11. IF-ELSE VS SWITCH
        IF-ELSE:
        Best when conditions involve:
        >
        <
        >=
        <=
        &&
        ||
        ranges
        complex expressions

        SWITCH:
        Best when comparing one expression against
        specific fixed values.
        */
        /*


                    12. NESTED CONDITIONAL EXAMPLE
        Check whether a number is:
        Positive
        Negative
        Zero
        If positive, also check whether it is
        Even or Odd.
        */
                int checkNumber = 20;
                if (checkNumber > 0) {
                    System.out.println("Positive");
                    if (checkNumber % 2 == 0) {
                        System.out.println("Even");
                    } else {
                        System.out.println("Odd");
                    }

                } else if (checkNumber < 0) {
                    System.out.println("Negative");

                } else {
                    System.out.println("Zero");
                }
        /*


                    13. VALIDATION EXAMPLE
        Check whether marks are valid.
        Valid marks:
        0 to 100
        If valid:
        Check pass/fail.
        */
                int examMarks = 85;
                if (examMarks >= 0 && examMarks <= 100) {
                    if (examMarks >= 40) {
                        System.out.println("Valid Marks - Pass");
                    } else {
                        System.out.println("Valid Marks - Fail");
                    }
                } else {
                    System.out.println("Invalid Marks");
                }
        /*


                    14. VOTING ELIGIBILITY
        If age >= 18:
        Eligible
        Otherwise:
        Not Eligible
        */
                int votingAge = 19;
                if (votingAge >= 18) {
                    System.out.println("Eligible to Vote");
                } else {
                    System.out.println("Not Eligible to Vote");
                }
        /*


                    15. LARGEST OF TWO NUMBERS
        */
                int number1 = 100;
                int number2 = 200;
                if (number1 > number2) {
                    System.out.println("Number 1 is Greater");
                } else if (number2 > number1) {
                    System.out.println("Number 2 is Greater");
                } else {
                    System.out.println("Both are Equal");
                }
        /*


                    16. LARGEST OF THREE NUMBERS
        */
                int n1 = 50;
                int n2 = 80;
                int n3 = 30;
                if (n1 >= n2 && n1 >= n3) {
                    System.out.println("n1 is Largest");
                } else if (n2 >= n1 && n2 >= n3) {
                    System.out.println("n2 is Largest");
                } else {
                    System.out.println("n3 is Largest");
                }
        /*


                    17. LEAP YEAR
        A year is a leap year if:
        1. It is divisible by 400
        OR
        2. It is divisible by 4 AND not divisible by 100
        Condition:
        (year % 400 == 0)
        ||
        (year % 4 == 0 && year % 100 != 0)
        */
                int year = 2024;
                if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {

                } else {
                    System.out.println("Not a Leap Year");
                }
        /*

        IMPORTANT RULES
        RULE 1:
        The condition inside if must produce
        a boolean value.
        Correct:
        if (age >= 18)
        Incorrect:
        if (age = 18)

        RULE 2:
        Use == for comparison.
        == -> Comparison
        =  -> Assignment

        RULE 3:
        Conditions can be combined using:
        && -> AND
        || -> OR
        !  -> NOT

        RULE 4:
        Use braces {} to clearly define the block
        of code belonging to a condition.
        */
        /*


        QUICK REVISION
        if
        -> Used for one condition.

        if-else
        -> Used for two possible outcomes.

        else-if
        -> Used for multiple conditions.

        nested if
        -> if inside another if.

        switch
        -> Used for multiple fixed choices.

        ternary ?:
        -> Short form of if-else.


        CONDITIONAL FLOW:

        Condition
             |
        ┌────┴────
        |         |
      TRUE      FALSE
        |         |
     if block  else block
        */
        /*


        MOST IMPORTANT POINTS
        1. Conditional statements are used for
           decision making.
        2. if executes code when a condition is true.
        3. if-else provides two possible paths.
        4. else-if handles multiple conditions.
        5. Nested if means an if inside another if.
        6. switch is useful for fixed choices.
        7. break prevents normal switch fall-through.
        8. && means AND.
        9. || means OR.
        10. ! means NOT.
        11. ?: is the ternary operator.
        12. Conditions must evaluate to true or false.
        */
            }
        }
    }
}
