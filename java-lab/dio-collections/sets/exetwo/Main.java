package diocollection.sets.exetwo;


import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


/*
Crie uma classe LinguagemFavorita que possua os atributos nome, anoDeCriacao e IDE.
Em seguida, crie um conjunto com 3 linguagens e faça um programa que ordene esse conjunto por:
a) Ordem de inserção;
b) Ordem natural(nome);
c) IDE;
d) Ano de criação e nome;
e) Nome, ano de criação e IDE;
Ao final, exiba as linguagens no console, um abaixo da outra.
*/
public class Main {
    public static void main(String[] args) {
        Set<FavoriteLanguage> languages = new LinkedHashSet<>();

        FavoriteLanguage first = new FavoriteLanguage("Python", 1990, "pycharm");
        FavoriteLanguage second = new FavoriteLanguage("Java", 1991, "intellij");
        FavoriteLanguage third = new FavoriteLanguage("Javascript", 1995, "vscode");


        languages.add(first);
        languages.add(second);
        languages.add(third);

        System.out.println();
        System.out.println("Showing by insection order:");
        System.out.println(languages);

        System.out.println();
        System.out.println("Showing by name order:");
        Set<FavoriteLanguage> langNameOrder = new HashSet<>(languages);
        System.out.println(langNameOrder);

        System.out.println();
        System.out.println("Showing by name IDE order:");
        Set<FavoriteLanguage> languagesIdeOrder = new TreeSet<>(new ComparatorIDE());
        languagesIdeOrder.addAll(languages);
        System.out.println(languagesIdeOrder);

        System.out.println();
        System.out.println("Showing by Creation and Name:");
        Set<FavoriteLanguage> langsCreationAndName = new TreeSet<>(new ComparatorCreationYearAndName());
        langsCreationAndName.addAll(languages);
        System.out.println(langsCreationAndName);

        System.out.println();
        System.out.println("Showing by Order Name, Creation Year and IDE");
        Set<FavoriteLanguage> langsCreationAndNameAndYearAndIDE =
                new TreeSet<>(new ComparatorCreationYearAndNameAndIDE());
        langsCreationAndNameAndYearAndIDE.addAll(languages);
        System.out.println(langsCreationAndNameAndYearAndIDE);




    }
}
