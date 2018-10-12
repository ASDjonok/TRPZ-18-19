
package lab3;

/**
 * C3 = 2 - String
 */
public class Main {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("mother");
        StringBuilder stringBuilder2 = new StringBuilder("mother");
        System.out.println(stringBuilder.equals(stringBuilder2));
        System.out.println(stringBuilder == stringBuilder2);

        String string = new String("mother ");
        String string2 = "mother  ";
        System.out.println(string.equals(string2));
        System.out.println(string.equalsIgnoreCase(string2));
        System.out.println(string == string2);
        System.out.println(string.hashCode());
        System.out.println(string2.hashCode());
        System.out.println(string.length());

        String[] splitStrings = "Привет. Я здесь.".split("(\\. )|\\.");
        for (int i = 0; i < splitStrings.length; i++) {
            System.out.println(splitStrings[i]);
            System.out.println(splitStrings[i].length());
        }



        /*int a[] = {1, 2, 3, 4, 5};
        int[] a = new int[] {1, 2, 3, 4, 5};*/
        stringBuilder.append("Papa mama brother");
        System.out.println(stringBuilder.charAt(1));
        System.out.println(stringBuilder.indexOf(" ", 5));
        System.out.println(stringBuilder);
        stringBuilder.delete(0, 2);
        System.out.println(stringBuilder);

        StringBuffer stringBuffer = new StringBuffer();

        // Aaaa a. B a a. B a.
        // Папа мама --- Паа маа

    }
}
