package lab3;

public class Main {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Papa mama brother");
        System.out.println(stringBuilder.charAt(1));
        System.out.println(stringBuilder.indexOf(" ", 5));
        System.out.println(stringBuilder);
        stringBuilder.delete(0, 2);
        System.out.println(stringBuilder);

        // Aaaa a. B a a. B a.
        // Папа мама --- Паа маа

    }
}
