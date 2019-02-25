package lab1;

/**
 * C2 = 1 O1 = "-"
 * C3 = 2 C = 2
 * C5 = 1 O2 = "/"
 * C7 = 4 тип індексів i та j = char
 */
public class Main {
    public static void main(String[] args) {
        double S = 0;
        int a = 1;
        int n = 2;
        int b = 1;
        int m = 2;
        final int C = 1;
//        char i = (char)a;
//        char j = (char)b;
        for (char i = (char)a; i <= n; i++) {
            for (char j = (char)b; j <= m; j++) {
                S = S + ((double)(i/j)/(i-C));
            }
        }
        System.out.println(S);
    }
}