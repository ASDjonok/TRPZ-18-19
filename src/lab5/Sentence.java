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
        System.out.println("==============");
        for (SentenceMember sentenceMember : sentenceMembers) {
            sentenceMember.whoAreYou();
        }
        System.out.println("==============");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Sentence) {
            Sentence sentence = (Sentence) obj;
            if (sentence.sentenceMembers.length == sentenceMembers.length) {
                for (int i = 0; i < sentenceMembers.length; i++) {
                    if (!sentenceMembers[i].equals(sentence.sentenceMembers[i])) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }
}
