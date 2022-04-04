package diocollection.sets.exetwo;

import java.util.Comparator;

public class ComparatorIDE implements Comparator<FavoriteLanguage> {
    @Override
    public int compare(FavoriteLanguage languageOne, FavoriteLanguage languageTwo) {
        return languageOne.getIDE().compareToIgnoreCase(languageTwo.getIDE());
    }
}
