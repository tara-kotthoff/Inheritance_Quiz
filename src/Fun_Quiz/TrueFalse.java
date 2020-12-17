package Fun_Quiz;

public class TrueFalse extends Question {

    private int answer;

    public TrueFalse(String question, int answer) {
        super(question);
        this.answer = answer;
    }

    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }
}
