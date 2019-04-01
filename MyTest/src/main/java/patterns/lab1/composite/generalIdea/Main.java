package patterns.lab1.composite.generalIdea;

public class Main {
    public static void main(String[] args) {
        Component component = new WordComposite();
        component.myMethod();
        System.out.println("++++++++++++++");
        component = new LetterLeaf();
        component.myMethod();
        System.out.println("Done!");
    }
}
