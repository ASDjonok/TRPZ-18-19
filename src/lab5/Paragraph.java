package lab5;

public class Paragraph {
    private Sentence[] sentences;

    public Paragraph(String paragraphString) {
        String[] split =
                paragraphString.split("(?<=[?!.])");
        sentences = new Sentence[split.length];
        for (int i = 0; i < split.length; i++) {
            sentences[i] = new Sentence(split[i]);
        }
    }
}
