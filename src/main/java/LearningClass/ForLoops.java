package LearningClass;

public class ForLoops {
    public static void main(String[] args) { //делим условия "For" на 3 блокаЖ в
        // в 1 блоке декларируется и инциализируется переменная счетчика, те та переменная, кот будет меняться
        // с каждой этирацией этого цикла; традиционно она называется "i"
        // 2 блок -блок условий, те до каких пор будет выполняться цикл
        // 3 блок -изменение перемнной i, те какое действие будет выполняться каждую этирацию этого цикла.
        // - что будет происходить с i каждый раз проходя чрез цикл
        for (int i = 0; i <= 10; i++) { //  выражение i++ идентично i=i+1
            System.out.println("Hello" + i); // Итого цикл выплнился 11 раз начиная с 0

            //for(int i=0; i <=10; i=i+5) {    example 1
            // System.out.println("Hello"+ i);

            //for(int i=10; i >=0; i=i-5) {    example 2
            // System.out.println("Hello"+ i);
            /*
            for Loops

            Another loop structure is the for loop. A for loop allows you to efficiently write a loop that needs to execute a specific number of times.
            Syntax:
            for (initialization; condition; increment/decrement) {
             statement(s)
              }

            Initialization: Expression executes only once during the beginning of loop
            Condition: Is evaluated each time the loop iterates. The loop executes the statement repeatedly, until this condition returns false.
            Increment/Decrement: Executes after each iteration of the loop.

            The following example prints the numbers 1 through 5.
for(int x = 1; x <=5; x++) {
  System.out.println(x);
}

 Outputs
1
2
3
4
5

         This initializes x to the value 1, and repeatedly prints the value of x, until the condition x<=5 becomes false. On each iteration, the statement x++ is executed, incrementing x by one.
         Notice the semicolon (;) after initialization and condition in the syntax.

         You can have any type of condition and any type of increment statements in the for loop.
The example below prints only the even values between 0 and 10:
for(int x=0; x<=10; x=x+2) {
  System.out.println(x);
}
Output
0
2
4
6
8
10

 A for loop is best when the starting and ending numbers are known.
             */

        }
    }
}
