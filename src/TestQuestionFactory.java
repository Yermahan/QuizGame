/**
 * Factory class for creating TestQuestion objects.
 * Stores question data and returns a new TestQuestion when requested.
 */

public class TestQuestionFactory implements QuestionFactory {
    private String questionText;
    private String[] options;
    private int correctOptionIndex;

    public TestQuestionFactory(String questionText, String[] options, int correctOptionIndex) {
        this.questionText = questionText;
        this.options = options;
        this.correctOptionIndex = correctOptionIndex;
    }

    @Override
    public BaseQuestion createQuestion() {
        return new TestQuestion(questionText, options, correctOptionIndex);
    }
}
