package diocollection.javaio;

public class Example4 {
    public static void main(String[] args) {
        String nameMonths[] = {
                "January",
                "February",
                "March",
                "April",
                "May",
                "June",
                "July",
                "August",
                "September",
                "Octubre",
                "November",
                "December"
        };

        System.out.println("Month - Name");

        for (int i = 0; i < 12; i ++) {
            System.out.printf("%0,2d - %s\n", i+1, nameMonths[i]);
        }
    }
}
