package lab9;

import java.io.*;
import java.util.ArrayList;

public class FileWorker {

    public static void saveCollectionToFile(String fileName, MySet mySet) {
        File file = new File(fileName);
        try {
            OutputStream outputStream = new FileOutputStream(file);
//            outputStream.write(54);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(mySet);
            objectOutputStream.close();
            System.out.println(": )");
        } catch (FileNotFoundException e) {
            System.out.println("Sorry. File was not found.");
        } catch (IOException e) {
            System.out.println("Sorry. Problems with writing in the file.");
        }
    }

    public static MySet loadCollectionFromFile(String fileName) {
        File file = new File(fileName);
        try {
            InputStream inputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
            return (MySet) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void saveObjectsToFile(String fileName, МузичнаКомпозиція[] музичнаКомпозиціяs) {
        File file = new File(fileName);
        try {
            OutputStream outputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            for (МузичнаКомпозиція музичнаКомпозиція : музичнаКомпозиціяs) {
                objectOutputStream.writeObject(музичнаКомпозиція);
            }
            objectOutputStream.close();
            System.out.println(":2)");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static МузичнаКомпозиція[] loadObjectsFromFile(String fileName) {
        File file = new File(fileName);
        ArrayList<МузичнаКомпозиція> музичнаКомпозиціяs =
                new ArrayList<>();
        try {
            InputStream inputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
            МузичнаКомпозиція музичнаКомпозиція = (МузичнаКомпозиція) objectInputStream.readObject();
            while (true) {
                музичнаКомпозиціяs.add(музичнаКомпозиція);
//                try {
                    музичнаКомпозиція = (МузичнаКомпозиція) objectInputStream.readObject();
                /*} catch (EOFException e) {
                    break;
                }*/
            }
//            музичнаКомпозиціяs[0] = (МузичнаКомпозиція) objectInputStream.readObject();
//            музичнаКомпозиціяs[1] = (МузичнаКомпозиція) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
//            e.printStackTrace();
        }
        return музичнаКомпозиціяs.toArray(new МузичнаКомпозиція[0]);
    }

    public static void saveSymbolToTextFile
            (String fileName, char symbol) throws IOException {
        OutputStream outputStream = new FileOutputStream(fileName);
        outputStream.write(symbol);
        //todo check closing file
    }

    public static void saveStringToTextFile
            (String fileName, String string) throws IOException {
        /*OutputStream outputStream = new FileOutputStream(fileName);
        *//*for (char symbol : string.toCharArray()) {
            outputStream.write(symbol);
        }*//*
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeUTF(string);
//        objectOutputStream.flush();
        objectOutputStream.close();
//        objectOutputStream.writeChars("saAAAAAAAAAAAAAAAAAA");
//        objectOutputStream.flush();*/

        FileWriter fileWriter = new FileWriter(fileName);
        fileWriter.write(string);
        fileWriter.close();
    }

    public static void saveObjectsToTextFile(String fileName, КласичнийМузичнийТвір[] музичнаКомпозиціяs) throws IOException {
        FileWriter fileWriter = new FileWriter(fileName);
        for (КласичнийМузичнийТвір музичнаКомпозиція : музичнаКомпозиціяs) {
            fileWriter.write(музичнаКомпозиція.toString() + "\n");
        }
        fileWriter.close();
    }
}
