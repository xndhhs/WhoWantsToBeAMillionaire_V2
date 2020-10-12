package ro.jademy.millionaire.data;

import ro.jademy.millionaire.model.Answer;
import ro.jademy.millionaire.model.Question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class QuestionProvider {

        public static List<Question> ALL_QUESTIONS = Arrays.asList(
                //10 difficulty 0 questions
                new Question("What is the capital of the USA?", Arrays.asList(
                        new Answer("Los Angeles"),
                        new Answer("New York"),
                        new Answer("Boston")
                ), new Answer("Washington DC"), 0),
                new Question("Which of these products is sold by the brands Colgate, Oral-B and Sensodyne?", Arrays.asList(
                        new Answer("Deodorant"),
                        new Answer("Shampoo"),
                        new Answer("Suncream")
                ), new Answer("Toothpaste"), 0),
                new Question("Which tool was used as a weapon by the Norse god Thor?", Arrays.asList(
                        new Answer("Pitchfork"),
                        new Answer("Saw"),
                        new Answer("Axe")
                ), new Answer("Hammer"), 0),
                new Question("In children’s stories, how many wishes are granted by a genie or fairy?", Arrays.asList(
                        new Answer("4"),
                        new Answer("1"),
                        new Answer("2")
                ), new Answer("3"), 0),
                new Question("How many continents are there?", Arrays.asList(
                        new Answer("4"),
                        new Answer("5"),
                        new Answer("6")
                ), new Answer("7"), 0),
                new Question("Which pop culture franchise has characters named Luke Skywalker, Han Solo and Darth Vader?", Arrays.asList(
                        new Answer("Star Trek"),
                        new Answer("Harry Potter"),
                        new Answer("James Bond")
                ), new Answer("Star Wars"), 0),
                new Question("Alberta is a province of which country?", Arrays.asList(
                        new Answer("USA"),
                        new Answer("New Zeeland"),
                        new Answer("Australia")
                ), new Answer("Canada"), 0),
                new Question("What is the longest river in the world?", Arrays.asList(
                        new Answer("Amazon"),
                        new Answer("Congo"),
                        new Answer("Rhine")
                ), new Answer("Nile"), 0),
                new Question("Trigonometry is a branch of which subject??", Arrays.asList(
                        new Answer("Chemistry"),
                        new Answer("Biology"),
                        new Answer("Economics")
                ), new Answer("Mathematics"), 0),
                new Question("What did the Romans call Scotland??", Arrays.asList(
                        new Answer("Dacia"),
                        new Answer("Parthia"),
                        new Answer("Gaul")
                ), new Answer("Caledonia"), 0),
                //10 difficulty 1 questions
                new Question("Which of these means a speech in a play where a character talks to themselves rather than to other characters?", Arrays.asList(
                        new Answer("Interlude"),
                        new Answer("Revue"),
                        new Answer("Chorus")
                ), new Answer("Soliloquy"), 1),
                new Question("Which of these is a religious event celebrated in Hinduism??", Arrays.asList(
                        new Answer("Hanukkah"),
                        new Answer("Ramadan "),
                        new Answer("Whitsunday")
                ), new Answer("Diwali"), 1),
                new Question("Which iconic horror film involves a couple whose newborn child is replaced at birth with the Antichrist?", Arrays.asList(
                        new Answer("The Exorcist"),
                        new Answer("Don't Look Now"),
                        new Answer("The Shining")
                ), new Answer("The Omen"), 1),
                new Question("Which instrument does not have strings?", Arrays.asList(
                        new Answer("Bass"),
                        new Answer("Guitar"),
                        new Answer("Cello")
                ), new Answer("Trombone"), 1),
                new Question("Who was the first woman to fly solo across the Atlantic?", Arrays.asList(
                        new Answer("Geraldine Ferraro"),
                        new Answer("Martha Stewart"),
                        new Answer("Sally Ride")
                ), new Answer("Amelia Earhart"), 1),
                new Question("Which of the following landlocked countries is entirely contained within another country?", Arrays.asList(
                        new Answer("Burkina Faso"),
                        new Answer("Mongolia"),
                        new Answer("Luxembourg")
                ), new Answer("Lesotho"), 1),
                new Question("Who is credited with inventing the first mass-produced helicopter?", Arrays.asList(
                        new Answer("Elmer Sperry"),
                        new Answer("Ferdinand von Zeppelin"),
                        new Answer("Gottlieb Daimler")
                ), new Answer("Igor Sikorsky"), 1),
                new Question("What scientist first determined that human sight results from images projected onto the retina?", Arrays.asList(
                        new Answer("Galileo"),
                        new Answer("Copernicus"),
                        new Answer("Isaac Newton")
                ), new Answer("Johannes Kepler"), 1),
                new Question("Which king was married to Eleanor of Aquitaine?", Arrays.asList(
                        new Answer("Henry I"),
                        new Answer("Richard I"),
                        new Answer("Henry V")
                ), new Answer("Henry II"), 1),
                new Question("How many players are there in a rugby league team?", Arrays.asList(
                        new Answer("14"),
                        new Answer("7"),
                        new Answer("15")
                ), new Answer("13"), 1),
                //10 difficulty 2 questions
                new Question("In the opera by Rossini, what is the first name of The Barber of Seville??", Arrays.asList(
                        new Answer("Tamino"),
                        new Answer("Alfredo"),
                        new Answer("Don Carlos")
                ), new Answer("Figaro"), 2),
                new Question("Which toxic substance is obtained from the pressed seeds of the castor oil plant?", Arrays.asList(
                        new Answer("Sarin"),
                        new Answer("Strychnine"),
                        new Answer("Cyanide")
                ), new Answer("Ricin"), 2),
                new Question("Which of these books is believed to have been inspired by the real-life experiences of the Scottish sailor Alexander Selkirk?", Arrays.asList(
                        new Answer("Moby Dick"),
                        new Answer("Treasure Island"),
                        new Answer("The Count of Monte Cristo")
                ), new Answer("Robinson Crusoe"), 2),
                new Question("The Twelve Apostles is a series of peaks connected to which mountain?", Arrays.asList(
                        new Answer("Aoraki Mount Cook"),
                        new Answer("K2"),
                        new Answer("Mont Blanc")
                ), new Answer("Table Mountain"), 2),
                new Question("How many days make up a non-leap year in the Islamic calendar?", Arrays.asList(
                        new Answer("365"),
                        new Answer("400"),
                        new Answer("376")
                ), new Answer("354"), 2),
                new Question("First performed in 1804, Beethoven's Eroica Symphony was originally dedicated to which historical figure?", Arrays.asList(
                        new Answer("Marie Antoinette"),
                        new Answer("Louis XVIII of France"),
                        new Answer("Voltaire")
                ), new Answer("Napoleon Bonaparte"), 2),
                new Question("Who is the patron saint of Spain?", Arrays.asList(
                        new Answer("St John"),
                        new Answer("St Benedict"),
                        new Answer("St Peter")
                ), new Answer("St James"), 2),
                new Question("The Earth is approximately how many miles away from the Sun?", Arrays.asList(
                        new Answer("9.3 mil"),
                        new Answer("39 mil"),
                        new Answer("193 mil")
                ), new Answer("93 mil"), 2),
                new Question("Which insect shorted out an early supercomputer and inspired the term <<computer bug>>?", Arrays.asList(
                        new Answer("Roach"),
                        new Answer("Fly"),
                        new Answer("Mosquito")
                ), new Answer("Moth"), 2),
                new Question("Which of the following men does not have a chemical element named for him?", Arrays.asList(
                        new Answer("Albert Einstein"),
                        new Answer("Niels Bohr"),
                        new Answer("Enrico Fermi")
                ), new Answer("Isaac Newton"), 2),
                //8 level 3 questions
                new Question("Which monarch was known as <<the wisest fool in Christendom>>?", Arrays.asList(
                        new Answer("Charles I"),
                        new Answer("Edward I"),
                        new Answer("Henry I")
                ), new Answer("James I"), 2),
                new Question("Oberon is the satellite of which planet?", Arrays.asList(
                        new Answer("Mercury"),
                        new Answer("Neptune"),
                        new Answer("Jupiter")
                ), new Answer("Uranus"), 3),
                new Question("Tomas Masaryk was the first president of which country?", Arrays.asList(
                        new Answer("Poland"),
                        new Answer("Hungary"),
                        new Answer("Yugoslavia")
                ), new Answer("Czechoslovakia"), 3),
                new Question("Which scientific unit is named after an Italian nobleman?", Arrays.asList(
                        new Answer("Pascal"),
                        new Answer("Ohm"),
                        new Answer("Herz")
                ), new Answer("Volt"), 3),
                new Question("Who was the first man to travel into space twice?", Arrays.asList(
                        new Answer("Vladimir Titov"),
                        new Answer("Michael Collins"),
                        new Answer("Yuri Gagarin")
                ), new Answer("Gus Grissom"), 3),
                new Question("In the history of motor sport, which of these iconic races was held first?", Arrays.asList(
                        new Answer("Indy 500"),
                        new Answer("Monaco Grand Prix"),
                        new Answer("Le Mans 24 Hours")
                ), new Answer("Isle of Man TT"), 3),
                new Question("What was the occupation of the composer Borodin?", Arrays.asList(
                        new Answer("Naval captain"),
                        new Answer("Lawyer"),
                        new Answer("Chef")
                ), new Answer("Chemist"), 3),
                new Question("Neurologists believe that the brain's medial ventral prefrontal cortex is activated when you do what?", Arrays.asList(
                        new Answer("Have a panic attack"),
                        new Answer("Remember a name"),
                        new Answer("Listen to music")
                ), new Answer("Get a joke"), 3)

        );

        //Method to return [x] questions of [y] difficulty level
        public static List<Question> getRandomQuestions( int nrOfQuestions, int difficulty ) {
                //  Algorithm:
                // loop through all questions -> get all questions of given difficulty -> return a list of [x] random questions of [y] difficulty
                List<Question> questionsOfDiff = new ArrayList<>();
                List<Question> questionsRandom = new ArrayList<>();
                for (Question question : ALL_QUESTIONS) {
                        if (question.getDifficulty() == difficulty) {
                                questionsOfDiff.add(question);
                        }
                }
                Random random = new Random();
                for (int i = 0; i < nrOfQuestions; i++) {
                        int randomIndex = random.nextInt(questionsOfDiff.size());
                        questionsRandom.add(questionsOfDiff.remove(randomIndex));
                }
                return questionsRandom;
        }
}
