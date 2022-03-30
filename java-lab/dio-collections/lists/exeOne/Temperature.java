package diocollection.lists.exeOne;

public class Temperature {
    Double temperature;
    String month;

    Temperature(Double temp, String month) {
        this.temperature = temp;
        this.month = month;
    }

    public Double getTemperature() {
        return temperature;
    }

    public String getMonth() {
        return month;
    }

    @Override
    public String toString() {
        return "Month: " + month + " " +
                "Temperature: " + temperature;
    }
}
