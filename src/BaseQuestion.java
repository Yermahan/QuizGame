/**
 * Abstract base class for all types of quiz questions.
 * Defines the common structure and behavior shared by all question types.
 */

public abstract class BaseQuestion {
    protected String questionText;

    public BaseQuestion(String questionText) {
        this.questionText = questionText;
    }

    public String getQuestionText() {
        return questionText;
    }

    public abstract void displayQuestion();
    public abstract boolean checkAnswer(String userAnswer);
}
