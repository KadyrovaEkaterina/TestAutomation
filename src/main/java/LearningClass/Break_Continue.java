package LearningClass;

public class Break_Continue {
    public static void main(String[] args) {
        int i = 0;
        while (true) { //помещая true в условие, мы создаем бесконечный цикл, те условие всегда будет true
            if (i == 15) {
                break;
            }
            System.out.println(i);
            i++;
        }
        System.out.println("мы вышли из цикла");
    }


    public static void main2(String[] args) {
        for (int i = 0; i <= 15; i++) {
            if (i % 2 == 0) { // % поделина число кот идет за знаком % и посмотри остаток.
                // У любого четного числа при делении на 2 остаток =0. Те условие выполняется только тогда когла "i" целое число
                continue;
            }
            System.out.println("это нечетное число" + i);
        }
    }
}
/*
The break and continue statements change the loop's execution flow.
The break statement terminates the loop and transfers execution to the statement immediately following the loop.
Example:
int x = 1;

while(x > 0) {
 System.out.println(x);
  if(x == 4) {
    break;
  }
  x++;
}
 Outputs
1
2
3
4

The continue statement causes the loop to skip the remainder of its body and then immediately retest its condition prior to reiterating. In other words, it makes the loop skip to its next iteration.
Example:
for(int x=10; x<=40; x=x+10) {
  if(x == 30) {
    continue;
  }
  System.out.println(x);
}
Outputs
  10
  20
  40
  As you can see, the above code skips the value of 30, as directed by the continue statement.
 */