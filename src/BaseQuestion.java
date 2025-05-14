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
