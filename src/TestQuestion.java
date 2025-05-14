public class TestQuestion extends BaseQuestion {
    private String[] options;
    private int correctOptionIndex;

    public TestQuestion(String questionText, String[] options, int correctOptionIndex) {
        super(questionText);
        this.options = options;
        this.correctOptionIndex = correctOptionIndex;
    }

    @Override
    public void displayQuestion() {
        System.out.println(questionText);
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ". " + options[i]);
        }
    }

    @Override
    public boolean checkAnswer(String userAnswer) {
        try {
            int choice = Integer.parseInt(userAnswer);
            return (choice - 1) == correctOptionIndex;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}

