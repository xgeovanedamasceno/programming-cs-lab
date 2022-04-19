package diocollection.maps.exes;

import java.util.ArrayList;
import java.util.List;

public class FederalState implements Comparable<FederalState>{
    private String name;
    private String initials;
    private Integer population;
    private List<String> cities = new ArrayList<>();

    public FederalState(String name, String initials, Integer population) {
        this.name = name;
        this.initials = initials;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    public List<String> getCities() {
        return cities;
    }

    public void addCitie(String city) {
        this.cities.add(city);
    }

    @Override
    public int compareTo(FederalState federalState) {
        return Integer.compare(this.getPopulation(), federalState.getPopulation());
    }
}
