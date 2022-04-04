package diocollection.sets.exetwo;

import java.util.Comparator;

public class ComparatorCreationYearAndName implements Comparator<FavoriteLanguage> {
    @Override
    public int compare(FavoriteLanguage languageOne, FavoriteLanguage languageTwo) {
        int creationYear = languageOne.getYearCreation().compareTo(languageTwo.getYearCreation());
        if (creationYear != 0) return creationYear;
        return languageTwo.getName().compareToIgnoreCase(languageTwo.getName());
    }
}
