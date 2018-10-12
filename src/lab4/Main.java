package lab4;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    static void myMethod() {
        System.out.println("In myMethod()! :)");
    }

    public static void main(String[] args) {
        Main.myMethod();

        MyClass myClass = new MyClass();

        System.out.println("myClass.myField = " + myClass.myField);

        myClass.myField = 3;

        System.out.println("myClass.myField = " + myClass.myField);

        Student student = new Student();

        //todo check why its change is available (protected case)
//        student.course = 1;

        int[] array = {1, -2, 3};

        Arrays.sort(array);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        System.out.println("++++");

        for (int element : array) {
            System.out.println(element);
        }

        Student[] students = new Student[3];

        students[2] = new Student(2, "ПК-71", "Вадим", "Апостолов", 85.5);
        students[1] = new Student(2, "ПК-71", "Дмитро", "Бердичевський", 91.5);
        //...
        students[0] = new Student(2, "ПК-71", "Катерина", "Троцюк", 98.0);

        Arrays.sort(students, Comparator.comparing(Student::getName));
        Arrays.sort(students, Comparator.comparing(Student::getSurname).reversed());

        System.out.println("Done!");
    }
}
