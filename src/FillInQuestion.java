public class FillInQuestion extends BaseQuestion {
    private String correctAnswer;

    public FillInQuestion(String questionText, String correctAnswer) {
        super(questionText);
        this.correctAnswer = correctAnswer.trim().toLowerCase();
    }

    @Override
    public void displayQuestion() {
        System.out.println(questionText);
    }

    @Override
    public boolean checkAnswer(String userAnswer) {
        return userAnswer.trim().toLowerCase().equals(correctAnswer);
    }
}
