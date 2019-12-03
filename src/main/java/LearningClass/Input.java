package LearningClass;
import java.util.Scanner;
public class Input {
    public static void main(String[] args) {

    Scanner s = new Scanner(System.in); //"scanner" это класс; "s"- новый объект класса scanner,"next line" метод объекта s
    System.out.println("Enter");
    String string = s.nextLine();
    System.out.println("you have entered " + string);

/*  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);  example #2 using "int"
    System.out.println("Enter");
    int x = s.nextInt();                  "please enter any number" this will be the msg
    System.out.println("you have entered " + x);*/
}

}
