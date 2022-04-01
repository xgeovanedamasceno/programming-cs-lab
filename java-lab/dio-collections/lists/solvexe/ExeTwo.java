package diocollection.lists.solvexe;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ExeTwo {
    public static void main(String[] args) throws IOException {
        List<String> questions = new ArrayList<>();
        List<String> answers = new ArrayList<>();

        questions.add("Do you call to the victim?");
        questions.add("Were you at the scene of the crime?");
        questions.add("Do you live near the victim? ");
        questions.add("Did you have debts with the victim?");
        questions.add("Have you ever worked with the victim?");

        int answersCounter = 0;

        Scanner input = new Scanner(System.in);


        System.out.println("To answer say 'yes' or 'no':");
        System.out.println();
        for (int i = 0; i < questions.size(); i++) {
            System.out.println(questions.get(i));
            String answer = input.nextLine();
            answers.add(answer);
        }

        Iterator<String> answersIterator = answers.iterator();

        while (answersIterator.hasNext()) {
            String answerNext = answersIterator.next();
            if (answerNext.equalsIgnoreCase("yes")) answersCounter++;
        }


        if (answersCounter == 2) System.out.println("suspicious");
        if (answersCounter >= 3 && answersCounter < 5) System.out.println("accomplice");
        if (answersCounter == 5) System.out.println("guilty");
    }
}
