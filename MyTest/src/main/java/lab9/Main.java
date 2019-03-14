package lab9;

public class Main {
    public static void main(String[] args) {
        MySet mySet = new MySet();
        КласичнийМузичнийТвір музичнаКомпозиція1 = new КласичнийМузичнийТвір("QWERTY", 123, "PI1");
        mySet.add(музичнаКомпозиція1);
        КласичнийМузичнийТвір музичнаКомпозиція2 = new КласичнийМузичнийТвір("ASD", 234, "PI2");
        mySet.add(музичнаКомпозиція2);
        FileWorker.saveCollectionToFile("1.obj", mySet);

        FileWorker.saveObjectsToFile("2.obj", музичнаКомпозиція1, музичнаКомпозиція2);
        System.out.println("Done!");
    }
}
