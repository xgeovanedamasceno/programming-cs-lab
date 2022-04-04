package diocollection.sets.exetwo;

import java.util.Comparator;

public class ComparatorCreationYearAndNameAndIDE implements Comparator<FavoriteLanguage> {
    @Override
    public int compare(FavoriteLanguage langOne, FavoriteLanguage langTwo) {
        int name = langOne.getName().compareToIgnoreCase(langTwo.getName());
        int creationYear = Integer.compare(langOne.getYearCreation(), langTwo.getYearCreation());
        if (name != 0) return name;
        if (creationYear != 0) return creationYear;
        return langOne.getIDE().compareToIgnoreCase(langTwo.getIDE());
    }
}
