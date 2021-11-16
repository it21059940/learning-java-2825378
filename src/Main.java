import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        String question = "What is the largest planet in our solar system?";
        String choiceOne = "earth";
        String choiceTwo = "jupiter";
        String choiceThree = "saturn";

        String correctAnswer = choiceTwo;

        // A print statement asking the question
        System.out.println(question);

        // A print statement giving the answer choices
        System.out.println("Choose one of the following: " +
                choiceOne + ", " + choiceTwo + ", or " + choiceThree + ".");

        // Have the user input an answer
        Scanner input = new Scanner(System.in);
        // Retrieve the user's input
        String userAns = input.next();

        //check if userans is equal to correctans after converting user ans to lower case
        if(correctAnswer.equals(userAns.toLowerCase())) {
            System.out.println("Congrats! That's the correct answer");
        } else {
            System.out.println("You are incorrect. The correct answer is " + correctAnswer);
        }
     }
}
