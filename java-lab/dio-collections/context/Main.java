package diocollection.context;

public class Main {
    public static void main(String[] args) {
        final Person joao = new Person("Joao");

        /*joao = new Person("Marcos");*/
        System.out.println(joao.getName());

        joao.changeName("Marcos");
        System.out.println(joao.getName());
    }
}
