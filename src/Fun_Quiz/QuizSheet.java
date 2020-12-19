package Fun_Quiz;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class QuizSheet {

    private ArrayList<Object> quizSheet = new ArrayList<>();

//    public QuizSheet(ArrayList<Object> quizSheet) {
//        this.quizSheet = quizSheet;
//    }

    public ArrayList<Object> getQuizSheet() {
        return quizSheet;
    }

    public void setQuizSheet(ArrayList<Object> quizSheet) {
        this.quizSheet = quizSheet;
    }

    public void addMultipleChoiceItem(MultipleChoice multipleChoiceItem) {
        this.quizSheet.add(multipleChoiceItem);
    }

    public void addTrueFalseItem(TrueFalse trueFalseItem) {
        this.quizSheet.add(trueFalseItem);
    }

    public void addCheckBoxItem(CheckBox checkBoxItem) {
        this.quizSheet.add(checkBoxItem);
    }

    public void addItem(Object quizItem) {
        this.quizSheet.add(quizItem);
    }

    public int size() {
        return quizSheet.size();
    }

    public Object get(int i) {
        return this.quizSheet.get(i);
    }

    public int getSize() {
        return quizSheet.size();
    }

}
