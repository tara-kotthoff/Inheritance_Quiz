package Fun_Quiz;

import java.util.ArrayList;
import java.util.Scanner;

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
//        colorQuiz.addItem(multi1);
//        colorQuiz.addItem(multi2);
        colorQuiz.addItem(tf1);
        colorQuiz.addItem(tf2);
//        colorQuiz.addItem(cb1);
//        colorQuiz.addItem(cb2);

//        System.out.println(colorQuiz.size());
//        System.out.println(colorQuiz.get(0));
//        System.out.println(colorQuiz.get(0).answerToString());

//        for (int question: colorQuiz) {
//            System.out.println(question);
//        }
//        System.out.println(((TrueFalse) colorQuiz.get(3)).isTrue());

        int numCorrectAnswers = 0;
        int numWrongAnswers = 0;

        for (int i = 0; i < colorQuiz.size(); i++) {
            Scanner input;
            Scanner input2;
            System.out.println(colorQuiz.get(i));
            
            if(colorQuiz.get(i) instanceof MultipleChoice) {
                int userAnswer;
                input = new Scanner(System.in);
                System.out.println("Please enter the corresponding number for the correct answer:");
                userAnswer = input.nextInt();
                if(userAnswer == ((MultipleChoice)colorQuiz.get(i)).getCorrectAnswer()) {
                    numCorrectAnswers += 1;
                } else {
                    numWrongAnswers += 1;
                }
                
            } else if(colorQuiz.get(i) instanceof CheckBox) {
                int userAnswer1;
                int userAnswer2;
                input = new Scanner(System.in);
                input2 = new Scanner(System.in);
                System.out.println("There are two correct answers. Please enter the corresponding number for the first" +
                        "correct answer and hit enter, then enter the second corresponding number.");
                userAnswer1 = input.nextInt();
                userAnswer2 = input2.nextInt();
                if (userAnswer1 == ((CheckBox) colorQuiz.get(i)).getCorrectAnswer1() || userAnswer1 ==
                        ((CheckBox) colorQuiz.get(i)).getCorrectAnswer2()) {
                    numCorrectAnswers += 1;
                } else if (userAnswer2 == ((CheckBox) colorQuiz.get(i)).getCorrectAnswer1() || userAnswer2 ==
                        ((CheckBox) colorQuiz.get(i)).getCorrectAnswer2()) {
                    numWrongAnswers += 1;
                }

            } else if(colorQuiz.get(i) instanceof TrueFalse) {
                input = new Scanner(System.in);
                System.out.println("Please enter 1 to indicate 'True' and 2 to indicate 'False'.");
                int userAnswer = input.nextInt();
                if(userAnswer == 1 || ((TrueFalse) colorQuiz.get(i)).isTrue()) {
                    numCorrectAnswers += 1;
                } else if(userAnswer == 1 || !((TrueFalse) colorQuiz.get(i)).isTrue()) {
                    numWrongAnswers += 1;
                } else if(userAnswer == 2 || !((TrueFalse) colorQuiz.get(i)).isTrue()) {
                    numCorrectAnswers += 1;
                } else if(userAnswer == 2 || ((TrueFalse) colorQuiz.get(i)).isTrue()) {
                    numWrongAnswers += 1;
                }

            }


        }

        System.out.println(numCorrectAnswers);
        System.out.println(numWrongAnswers);


    }

}
