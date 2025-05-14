public class FillInQuestionFactory implements QuestionFactory {
    private String questionText;
    private String correctAnswer;

    public FillInQuestionFactory(String questionText, String correctAnswer) {
        this.questionText = questionText;
        this.correctAnswer = correctAnswer;
    }

    @Override
    public BaseQuestion createQuestion() {
        return new FillInQuestion(questionText, correctAnswer);
    }
}
