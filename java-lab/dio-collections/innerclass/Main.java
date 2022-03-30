package diocollection.innerclass;

public class Main {
    public static void main(String[] args) {
        int x = 123;

        x = 456;

        class MyClass {
            void doSomething() {
                System.out.println(x);
            }
        }

        new MyClass().doSomething();
    }
}
