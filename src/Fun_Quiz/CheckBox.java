package Fun_Quiz;

public class CheckBox extends Question {

    private String answer1;
    private String answer2;
    private String answer3;
    private String answer4;
    private int correctAnswer1;
    private int correctAnswer2;

    public CheckBox(String question, String answer1, String answer2, String answer3, String answer4,
                    int correctAnswer1, int correctAnswer2) {
        super(question);
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.answer4 = answer4;
        this.correctAnswer1 = correctAnswer1;
        this.correctAnswer2 = correctAnswer2;

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

    public String getAnswer4() {
        return answer4;
    }

    public void setAnswer4(String answer4) {
        this.answer4 = answer4;
    }

    public int getCorrectAnswer1() {
        return correctAnswer1;
    }

    public void setCorrectAnswer1(int correctAnswer1) {
        this.correctAnswer1 = correctAnswer1;
    }

    public int getCorrectAnswer2() {
        return correctAnswer2;
    }

    public void setCorrectAnswer2(int correctAnswer2) {
        this.correctAnswer2 = correctAnswer2;
    }

//    public final double getPointValue() {
//        return this.pointValue;
//    }

    @Override

    public String toString() {
        return this.getQuestion() +"\n"
                + this.answer1 +"\n"
                + this.answer2 + "\n"
                + this.answer3 + "\n"
                + this.answer4 + "\n";
    }

    public String answerToString() {
        return "The correct answers are " + this.correctAnswer1 + " and " + this.correctAnswer2 + " .";
    }


}
