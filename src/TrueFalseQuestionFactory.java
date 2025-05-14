/**
 * Factory class for creating TrueFalseQuestion objects.
 * Stores question text and correct boolean answer.
 */

public class TrueFalseQuestionFactory implements QuestionFactory {
    private String questionText;
    private boolean correctAnswer;

    public TrueFalseQuestionFactory(String questionText, boolean correctAnswer) {
        this.questionText = questionText;
        this.correctAnswer = correctAnswer;
    }

    @Override
    public BaseQuestion createQuestion() {
        return new TrueFalseQuestion(questionText, correctAnswer);
    }
}
