package lab9;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println('\u00D0');
        MySet mySet = new MySet();
        КласичнийМузичнийТвір музичнаКомпозиція1 = new КласичнийМузичнийТвір("QWERTY", 123, "PI1");
        mySet.add(музичнаКомпозиція1);
        КласичнийМузичнийТвір музичнаКомпозиція2 = new КласичнийМузичнийТвір("ASD", 234, "PI2");
        mySet.add(музичнаКомпозиція2);
        FileWorker.saveCollectionToFile("1.txt", mySet);

        КласичнийМузичнийТвір[] музичнаКомпозиціяs = {музичнаКомпозиція1, музичнаКомпозиція2};
        FileWorker.saveObjectsToFile("2.txt", музичнаКомпозиціяs);

        FileWorker.saveSymbolToTextFile("3.txt", '\u0031');
        FileWorker.saveStringToTextFile("4.txt", "фываолрныфвза!");
        FileWorker.saveObjectsToTextFile("5.txt", музичнаКомпозиціяs);

        System.out.println("Done!");
    }
}
