package Fun_Quiz;
import java.util.Scanner;

public class MultipleChoice extends Question {

    private String answer1;
    private String answer2;
    private String answer3;
    private int correctAnswer;

    public MultipleChoice(String question, String answer1, String answer2, String answer3, int correctAnswer) {
        super(question);
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.correctAnswer = correctAnswer;
    }

    public String getAnswer1() {
        return answer1;
    }

    public void setAnswer1(String answer1) {
        this.answer1 = answer1;
    }

    public String getAnswer2() {
        return answer2;
    }

    public void setAnswer2(String answer2) {
        this.answer2 = answer2;
    }

    public String getAnswer3() {
        return answer3;
    }

    public void setAnswer3(String answer3) {
        this.answer3 = answer3;
    }

    public int getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(int correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    @Override
    public String toString() {
        return this.getQuestion() +"\n"
                + this.answer1 +"\n"
                + this.answer2 + "\n"
                + this.answer3 + "\n";
    }

    public String answerToString() {
        return "The correct answer is " + this.correctAnswer + ".";
    }
}
