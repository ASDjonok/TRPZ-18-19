package lab5;

public class Text {
    private TextMember[] textMembers;
    public Text(String s) {
        System.out.println(s);
        String[] split = s.split("[.!?]");
        textMembers = new TextMember[split.length];
        for (int i = 0; i < split.length; i++) {
            textMembers[i] = new Sentence(split[i]);
        }
    }
}
