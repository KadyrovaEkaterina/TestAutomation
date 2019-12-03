package LearningClass;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value;
        do {
            System.out.println("Введи 5");
            value = scanner.nextInt();

        } while (value!=5);   // цикл "while сначала проверяет условия и потом выполняет инструкции,
        // а цикл "do while" сначала выполняет инфтрукции и потом проверяет условия
        /* Scanner scanner = new Scanner(System.in);
        System.out.println("введи 5");
        int value = scanner.nextInt();
        while (value != 5) { //мы создаем цикл while и он будет крутиться до тех пор пока не будет =5
            System.out.println("Введи 5");
            value= scanner.nextInt();
                    }
        System.out.println("Вы ввели 5");
        // В хорошей программе недолжно быть дублирование кода. поэтому вместо используемых дважды  System.out.println,
        // мы используем цикл "Do While" */

        }
    }
        /*
        do...while Loops
        A do...while loop is similar to a while loop, except that a do...while loop is guaranteed to execute at least one time.
Example:
int x = 1;
do {
  System.out.println(x);
  x++;
} while(x < 5);

Output
1
2
3
4
   Notice that the condition appears at the end of the loop, so the statements in the loop execute once before it is tested.
Even with a false condition, the code will run once. Example:
int x = 1;
do {
  System.out.println(x);
  x++;
} while(x < 0);

//Outputs 1
         */



