public class FlashCard {

    private String question;
    private String answer;

    public FlashCard(String q, String a) {
        setQuestion(q);
        setAnswer(a);
    }

    public void setQuestion(String q) {
        question = q;
    }

    public void setAnswer(String a) {
        answer = a;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }
}
