package Fun_Quiz;

public class TrueFalse extends Question {

    private boolean isTrue;

    public TrueFalse(String question, boolean isTrue) {
        super(question);
        this.isTrue = isTrue;
    }

    public boolean isTrue() {
        return isTrue;
    }

    public void setTrue(boolean aTrue) {
        isTrue = aTrue;
    }


    @Override

    public String toString(){
        return this.getQuestion() +"\n";
    }

    public String answerToString() {
        return "The correct answer is " + this.isTrue + " .";
    }
    

}
