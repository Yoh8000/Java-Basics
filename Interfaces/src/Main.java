public class Main {
    public static void main(String[] args) {
        Machine mach1 = new Machine();
        mach1.start();
        mach1.showInfo();

        Person person1 = new Person("Bob");
        person1.greet();
        person1.showInfo();

    }
}
