package lab5;

public class Sentence {
    private static final String PUNCTUATION_SYMBOLS = ",.!?";
    private SentenceMember[] sentenceMembers;

    public Sentence(String s) {
        String[] split = s.split("(?=,|\\.|!|\\?)|\\s");
//        System.out.println(Arrays.toString(split));
        sentenceMembers = new SentenceMember[split.length];
        for (int i = 0; i < split.length; i++) {
            if (PUNCTUATION_SYMBOLS.contains(split[i])) {
                sentenceMembers[i] = new Punctuation(split[i]);
            } else {
                sentenceMembers[i] = new Word(split[i]);
            }
    }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Sentence) {
            Sentence sentence = (Sentence) obj;
            /*if (paragraph.sentences.length == sentences.length) {
                for (int i = 0; i < sentences.length; i++) {
                    if (!sentences[i].equals(paragraph.sentences[i])) {
                        return false;
                    }
                }
                return true;
            }*/
        }
        return false;
    }
}
