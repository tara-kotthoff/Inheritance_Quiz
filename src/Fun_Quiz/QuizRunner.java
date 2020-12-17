package Fun_Quiz;

import java.util.ArrayList;

public class QuizRunner {

    public static void main (String[] args) {

        //Create quiz variable
        QuizSheet colorQuiz = new QuizSheet();

        //Create quiz questions for each category: Multiple choice, T/F, Check box.
        MultipleChoice multi1 = new MultipleChoice("Which color is opposite blue on the color wheel?",
            "1) Orange", "2) Yellow", "3) Green", 1);

        MultipleChoice multi2 = new MultipleChoice("Which color is made by combining red and blue?",
            "1) Green", "2) Purple", "3) Orange", 2);

        TrueFalse tf1 = new TrueFalse("Sir Isaac Newton is credited with creating the first circular diagram of colors.",
            true);

        TrueFalse tf2 = new TrueFalse("Green is made by combining yellow and purple.", false);

        CheckBox cb1 = new CheckBox("Which of the following are primary colors?", "1) Red",
            "2) Orange", "3) Green", "4) Yellow", 1, 4);

        CheckBox cb2 = new CheckBox("Which of the following are secondary colors?", "1) Blue",
            "2) Purple", "3) Brown", "4) Green", 2, 4);

        //Add quiz items to colorQuiz
        colorQuiz.addItem(multi1);
        colorQuiz.addItem(multi2);
        colorQuiz.addItem(tf1);
        colorQuiz.addItem(tf2);
        colorQuiz.addItem(cb1);
        colorQuiz.addItem(cb2);

        System.out.println(colorQuiz.size());
        System.out.println(colorQuiz.get(0));
//        System.out.println(colorQuiz.get(0).answerToString());




    }

}
