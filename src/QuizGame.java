import java.util.*;

public class QuizGame {
    private List<BaseQuestion> questions;
    private Scanner scanner;

    public QuizGame() {
        questions = new ArrayList<>();
        scanner = new Scanner(System.in);
        loadQuestions();
    }

    private void loadQuestions() {
        List<QuestionFactory> factories = List.of(
                // Test Questions
                new TestQuestionFactory("What is 5 + 3?", new String[]{"6", "7", "8", "9"}, 2),
                new TestQuestionFactory("Which planet is known as the Red Planet?", new String[]{"Earth", "Venus", "Mars", "Jupiter"}, 2),
                new TestQuestionFactory("How many legs does a spider have?", new String[]{"6", "8", "10", "12"}, 1),
                new TestQuestionFactory("What is the capital of Japan?", new String[]{"Kyoto", "Beijing", "Tokyo", "Seoul"}, 2),
                new TestQuestionFactory("Which of these is a mammal?", new String[]{"Shark", "Dolphin", "Octopus", "Tuna"}, 1),

                // Fill-in-the-Blank Questions
                new FillInQuestionFactory("Enter the color of the sky on a clear day:", "blue"),
                new FillInQuestionFactory("What do bees make?", "honey"),
                new FillInQuestionFactory("What is 10 divided by 2?", "5"),
                new FillInQuestionFactory("How many days are in a week?", "7"),
                new FillInQuestionFactory("What is the name of our planet?", "earth"),

                // True/False Questions
                new TrueFalseQuestionFactory("The sun rises in the east.", true),
                new TrueFalseQuestionFactory("Fish can breathe air like humans.", false),
                new TrueFalseQuestionFactory("An elephant is larger than a mouse.", true),
                new TrueFalseQuestionFactory("Water freezes at 100 degrees Celsius.", false),
                new TrueFalseQuestionFactory("Lightning comes before thunder.", false)
        );

        for (QuestionFactory factory : factories) {
            questions.add(factory.createQuestion());
        }
    }



    public void start() {
        int score = 0;

        for (BaseQuestion q : questions) {
            q.displayQuestion();
            System.out.print("Your answer: ");
            String answer = scanner.nextLine();

            if (q.checkAnswer(answer)) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Incorrect.\n");
            }
        }

        System.out.println("Quiz complete! Your score: " + score + "/" + questions.size());
    }

    public static void main(String[] args) {
        QuizGame game = new QuizGame();
        game.start();
    }
}
