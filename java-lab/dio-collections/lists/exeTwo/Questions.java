/*
* 2) Utilizando listas, faça um programa que faça 5 perguntas para
uma pessoa sobre um crime. As perguntas são:
- telefonou para a vítima?
- esteve no local do crime?
- mora perto da vítima?
- devia para a vítima?
- trabalhou com a vítima?

Se a pessoa responder positivamente a 2 questões ela deve ser
classificada como "suspeita", entre 3 e 4 como "cúmplice"
e 5 como assassina. Caso contrário, inocente.*/
package diocollection.lists.exeTwo;


import java.io.IOException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Questions {
    public static void main(String[] args) throws IOException {
        List<String> questions = new ArrayList<>();

        questions.add("Do you call to the victim?");
        questions.add("Were you at the scene of the crime?");
        questions.add("Do you live near the victim? ");
        questions.add("Did you have debts with the victim?");
        questions.add("Have you ever worked with the victim?");

        int answersCounter = 0;

        Scanner input = new Scanner(System.in);
        String answer;

        System.out.println("To answer say 'yes' or 'no':");
        System.out.println();
        for (int i = 0; i < questions.size(); i++) {
            System.out.println(questions.get(i));
            answer = input.nextLine();

            if (answer.equals("yes")) answersCounter++;
        }



        if (answersCounter == 2) System.out.println("suspicious");
        if (answersCounter >= 3 && answersCounter < 5) System.out.println("accomplice");
        if (answersCounter == 5) System.out.println("guilty");
    }
}
