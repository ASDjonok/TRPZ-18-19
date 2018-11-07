package lab4;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    static void myMethod() {
        System.out.println("In myMethod()! :)");
    }

    public static void main(String[] args) {
        /*System.out.println("Al".compareTo("B"));
        System.out.println("B".compareTo("Al"));
        System.out.println("Bas".compareTo("Ba"));
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
        }*/

        Student[] students = new Student[3];

        students[0] = new Student(2, "ПК-71", "Владимир", "Алещенко", 85.5);
        students[1] = new Student(2, "ПК-71", "Алексей", "Алещенко", 91.5);
        //...
        students[2] = new Student(2, "ПК-71", "Борис", "Борисов", 98.0);
        for (Student student : students) {
            System.out.println(student);
        }

//        Arrays.sort(students, Comparator.comparing(Student::getName));
        /*Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int differenceSurname = o1.getSurname().compareTo(o2.getSurname());

                if (differenceSurname > 0) {
                    return -1;
                } else {
                    if (differenceSurname < 0) {
                        return 1;
                    } else {

                        int differenceName = o1.getName().compareTo(o2.getName());
                        if (differenceName > 0) {
                            return 1;
                        } else {
                            if (differenceName < 0) {
                                return -1;
                            } else {
                                return 0;
                            }
                        }

                    }
                }
            }
        });*/
        Arrays.sort(students, new MyComparator());
        System.out.println("+++++++++++");
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("++++++++++++");
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
//        System.out.println(Arrays.toString(students));
//        Arrays.sort(students, Comparator.comparing(Student::getSurname).reversed());

        System.out.println("Done!");
    }
}
