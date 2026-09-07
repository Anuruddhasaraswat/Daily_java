package codehelp;

public class day5_variable {
    static void main() {
//        A variable is a named location in memory used to store data that can change while a program is running.
        int age = 5;
        //int:- var datatype, age :- variable name, 5 :- assigned value.

//        rules for variable naming
        //1) case sensitivity [age vs AGE]
        //2) starting character [a,A,_,$]
        //3) subsequent keywords [0 to 9, _ , $]
        //4) no reserved keywords [class, static etc]
        //5) length [no limit,but meaningful names needed]
        //6)convention: camelCase, UpperCase for constants etc.

        //create // declare
        //int age;
        //System.out.println(age);
        //assign value
        age = 10;
        age = 20;
        System.out.println(age);

        //define or initialize
        int totalMarks = 20;
        System.out.println(totalMarks);

//        rules for naming

        //Case sensitive
        int weight = 80;
        int WEIGHT = 90;
        System.out.println("weight" + weight);
        System.out.println("WEIGHT" + WEIGHT);

        //starting letter
        int marks = 10;
        int MARKS = 10;
        int _marks = 20;
        int $marks = 13;

        //subsequent letters
        int heigtts = 21;
        int height_love = 33;
        int height$12Love = 44;
        int height = 2;
        int height$ = 23;

        //no reserved keywords
        // int class = 22;

        //length
        int hellojikaisehaalchalhai = 51;
        int a = 1;
        int b = 2;
        int c = 3;
        int myName = 51;
        int totalmarks = 100; //prefered

        //constants in upper case (constant value)
        int DAYS_IN_YEAR = 365;

    }
}
