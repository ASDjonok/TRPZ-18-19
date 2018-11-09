package lab5;

public class Text {
    private Paragraph[] paragraphs;

    public Text(String s) {
//        System.out.println(s);
        String[] split = s.split("\n");
        paragraphs = new Paragraph[split.length];
        for (int i = 0; i < split.length; i++) {
            paragraphs[i] = new Paragraph(split[i]);
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Text) {
            Text text = (Text) obj;
            if (text.paragraphs.length == this.paragraphs.length) {

            }
        }
        return false;
    }
}
