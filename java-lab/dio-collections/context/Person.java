package diocollection.context;

public class Person {
    private String name;

    Person(String name) {
        this.name = name;
    }

    void changeName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }
}
