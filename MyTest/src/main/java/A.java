import java.util.Comparator;

public class A {
    public static int myMethod() {
        return 3;
    }

    public static void main(String[] args) {
        new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                return 0;
            }

            /*@Override
            public boolean equals(Object obj) {
                return false;
            }*/
        };
        System.out.println("Done!");
    }
}
