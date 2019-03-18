package lab9;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        MySet mySet = new MySet();
        КласичнийМузичнийТвір музичнаКомпозиція1 = new КласичнийМузичнийТвір("QWERTY", 123, "PI1");
        mySet.add(музичнаКомпозиція1);
        КласичнийМузичнийТвір музичнаКомпозиція2 = new КласичнийМузичнийТвір("ASD", 234, "PI2");
        mySet.add(музичнаКомпозиція2);
        FileWorker.saveCollectionToFile("1.txt", mySet);

        FileWorker.saveObjectsToFile("2.txt", new КласичнийМузичнийТвір[]{музичнаКомпозиція1, музичнаКомпозиція2});

        FileWorker.saveSymbolToTextFile("3.txt", '\u0031');
        FileWorker.saveStringToTextFile("4.txt", "HELLO!");

        System.out.println("Done!");
    }
}
