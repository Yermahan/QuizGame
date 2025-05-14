/**
 * Represents a true/false question.
 * Inherits from BaseQuestion and checks if the user's boolean answer is correct.
 */

public class TrueFalseQuestion extends BaseQuestion {
    private boolean correctAnswer;

    public TrueFalseQuestion(String questionText, boolean correctAnswer) {
        super(questionText);
        this.correctAnswer = correctAnswer;
    }

    @Override
    public void displayQuestion() {
        System.out.println(questionText + " (true/false)");
    }

    @Override
    public boolean checkAnswer(String userAnswer) {
        return Boolean.parseBoolean(userAnswer.toLowerCase()) == correctAnswer;
    }
}
