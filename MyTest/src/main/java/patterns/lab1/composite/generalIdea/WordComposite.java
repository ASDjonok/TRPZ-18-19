package patterns.lab1.composite.generalIdea;

public class WordComposite implements Component {
    private LetterLeaf[] letterLeaves;

    public WordComposite() {
        this.letterLeaves = new LetterLeaf[]{new LetterLeaf(), new LetterLeaf()};
    }

    @Override
    public void myMethod() {
        System.out.println("IN WordComposite.myMethod()");
        for (LetterLeaf letterLeaf : letterLeaves) {
            letterLeaf.myMethod();
        }
    }
}
