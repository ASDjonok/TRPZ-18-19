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

    @Override
    public boolean equals(Object obj) {
//        System.out.println(((Text)obj).paragraphs.length);
        if (obj instanceof Paragraph) {
            Paragraph paragraph = (Paragraph) obj;
            if (paragraph.sentences.length == sentences.length) {
                for (int i = 0; i < sentences.length; i++) {
                    if (!sentences[i].equals(paragraph.sentences[i])) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }
}
