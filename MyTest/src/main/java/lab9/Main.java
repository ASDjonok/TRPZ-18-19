package lab9;

public class Main {
    public static void main(String[] args) {
        MySet mySet = new MySet();
        mySet.add(new КласичнийМузичнийТвір("QWERTY", 123, "PI1"));
        mySet.add(new КласичнийМузичнийТвір("ASD", 234, "PI2"));
        FileWorker.saveCollectionToFile("1.obj", mySet);
        System.out.println("Done!");
    }
}
