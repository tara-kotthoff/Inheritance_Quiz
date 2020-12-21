package Fun_Quiz;

public class TrueFalse extends Question {

    private boolean isTrue;
//    private final double pointValue = 1;

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

//    public final double getPointValue() {
//        return this.pointValue;
//    }

    @Override

    public String toString(){
        return this.getQuestion() +"\n";
    }

    public String answerToString() {
        return "The correct answer is " + this.isTrue + " .";
    }
    

}
