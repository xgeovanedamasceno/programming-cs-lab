package diocollection.sets.exetwo;

import java.util.Objects;

public class FavoriteLanguage implements Comparable<FavoriteLanguage> {
    private String name;
    private Integer yearCreation;
    private String IDE;

    FavoriteLanguage(String name, Integer yearCreation, String ide) {
        this.name = name;
        this.yearCreation = yearCreation;
        this.IDE = ide;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getYearCreation() {
        return yearCreation;
    }

    public void setYearCreation(Integer yearCreation) {
        this.yearCreation = yearCreation;
    }

    public String getIDE() {
        return IDE;
    }

    public void setIDE(String IDE) {
        this.IDE = IDE;
    }

    @Override
    public String toString() {
        return "\nLanguage Name='" + name + '\'' +
                ", Year of Creation=" + yearCreation +
                ", IDE='" + IDE + '\'';
    }

    @Override
    public int compareTo(FavoriteLanguage favoriteLanguage) {
        return this.name.compareTo(favoriteLanguage.getName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FavoriteLanguage that = (FavoriteLanguage) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, yearCreation, IDE);
    }
}
