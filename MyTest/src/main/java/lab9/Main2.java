package lab9;

public class Main2 {
    public static void main(String[] args) {
        MySet mySet = FileWorker.loadCollectionFromFile("1.obj");
        System.out.println(mySet.size());
        System.out.println(mySet.toArray()[0]);
        System.out.println(mySet.toArray()[1]);
    }
}
