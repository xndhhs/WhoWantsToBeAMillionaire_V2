package ro.jademy.millionaire;

import ro.jademy.millionaire.data.QuestionProvider;
import ro.jademy.millionaire.model.Game;
import ro.jademy.millionaire.model.Question;

import java.util.List;

public class Main {

    public static void main( String[] args ) {
        //Creating sets of questions for each difficulty level
        List<Question> difficultyZeroQuestion = QuestionProvider.getRandomQuestions(5, 0);
        List<Question> difficultyOneQuestion = QuestionProvider.getRandomQuestions(5, 1);
        List<Question> difficultyTwoQuestion = QuestionProvider.getRandomQuestions(4, 2);
        List<Question> difficultyThreeQuestion = QuestionProvider.getRandomQuestions(1, 3);

        //Initialize game
        Game game = new Game(difficultyZeroQuestion, difficultyOneQuestion, difficultyTwoQuestion, difficultyThreeQuestion);
        game.start();
    }
}
