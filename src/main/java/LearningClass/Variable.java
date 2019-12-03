package LearningClass;

public class Variable { // variable - переменные, как некие коробки, в кот хранятся данные.
    // чтобы использовать переменныую, ее надо сначала задекларировать, а потом инициализировать.
    public static void main(String[] args) {
      int myInt; // имена переменных и имена методов пишутся с маленькой буквы, но каждое след слово в заглавной.
        // В этой строчке мы задекларировали перемнную, т.е. выделили свободное место в памяти, но она еще пуста, "в коробке' ничего нет)
      myInt = 557; // теперь здесь хранится число 557 и мы можем его использоватью т.е. мы инициализировали myInt

        // также можно прописать все в одной строке, т.е. задекларировать и инициализировать  и результат не изменится
        // public class Variable {
         // int myInt = 557
        // System.out.println(myInt);
        // int- целое число и вмещает в себя 32 бита

        short myShort; // хранит целое число и вмещает в себя только 16 битные цифры от -32,000 до +32,000
        myShort = 3266;
        long myLong; // хранит целое число и позволяет хранить большие цифры до 64 бита информации
        myLong= 699789456;
        double myDouble; // вещественные типы данных. хранит 64 бита информации
        myDouble= 255.55;
        float myFloat; // вещественные типы данных. хранит 32 бита информации
        myFloat = 2362.4f; // для  float всегда нужно ставить f в конце

        char myChar; //представляет из себя символ - букву и вседа обозначается одиносными ковычками
        myChar= 'm';

        boolean b = true; // логический тип данных -true / false

        byte myByte;
        myByte = 34;// contains only 8 byte info, используются числовые рамки -128 до 128

        System.out.println(myInt);

    }

    }
