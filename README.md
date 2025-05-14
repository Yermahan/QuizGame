# QuizGame
This is a Java-based console application designed as a simple educational game for primary school students. It includes different types of interactive questions to test basic knowledge.
---

## Features

- Object-Oriented Design with abstraction, inheritance, and polymorphism
- Three question types:
  - Test (Multiple Choice)
  - Fill-in-the-Blank
  - True/False
- Factory Design Pattern used for question creation
- Expandable question system
- Console-based UI
- Follows SOLID principles

---

## Project Structure
  src/
├── BaseQuestion.java
├── TestQuestion.java
├── FillInQuestion.java
├── TrueFalseQuestion.java
├── QuestionFactory.java
├── TestQuestionFactory.java
├── FillInQuestionFactory.java
├── TrueFalseQuestionFactory.java
└── QuizGame.java

---

## 🧠 How to Play

1. Compile all Java files:
   ```bash
   javac *.java
Run the game:
java QuizGame
Answer the questions one by one in the terminal.
## Example Run
What is 5 + 3?
1. 6
2. 7
3. 8
4. 9
Your answer: 3
✅ Correct!

Enter the color of the sky on a clear day:
Your answer: blue
✅ Correct!

Is water wet? (true/false)
Your answer: true
✅ Correct!

🎉 Quiz complete! Your score: 3/3
