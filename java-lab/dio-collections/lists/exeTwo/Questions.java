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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Questions {
    public static void main(String[] args) throws IOException {
        List<String> questions = new ArrayList<>();

        questions.add("Do you call to the victim?");
        questions.add("Were you at the scene of the crime?");
        questions.add("Do you live near the victim? ");
        questions.add("Did you have debts with the victim?");
        questions.add("Have you ever worked with the victim?");

        int answersCounter = 0;

        InputStream inputStream = System.in;
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String answer;


        for (int i = 0; i < questions.size(); i++) {
            System.out.println(questions.get(i));
            do {
                answer = bufferedReader.readLine();
                System.out.println(answer);
            } while (answer != null);
        }
    }
}
