/**
 * Interface for creating questions using the Factory design pattern.
 * Each implementation creates a specific type of question.
 */

public interface QuestionFactory {
    BaseQuestion createQuestion();
}
