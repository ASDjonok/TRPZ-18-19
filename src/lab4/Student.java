package lab4;
//Инкапсуляция, Наследование, Полиморфизм
public class Student {
    private int course;
    private String group;
    private String name;
    private String surname;
    private double averageMark;

    /**
     *
     * @param course - student's course
     * @param group
     * @param name
     * @param surname
     * @param averageMark
     */
    public Student(int course, String group, String name, String surname, double averageMark) {
        this.course = course;
        this.group = group;
        this.name = name;
        this.surname = surname;
        this.averageMark = averageMark;
    }

    /**
     * Default constructor of student Vasya Pupkin
     */
    public Student() {
        this.course = 1;
        this.group = "ПК-71";
        this.name = "Василий";
        this.surname = "Пупкин";
        this.averageMark = 60;
    }

    /**
     *
     * @return name of student
     */
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
