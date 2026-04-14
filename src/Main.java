public class Main {
    public static void main(String[] args) {

        Dog malinoak9 = new Dog();
        Cat garfild = new Cat();
        Fish nemo = new Fish();
        Turtle rafaelo = new Turtle();

        malinoak9.makeSound(); // Bark
        garfild.makeSound(); // Meow
        nemo.makeSound(); //uzima se metoda iz Animal klase
        rafaelo.makeSound();

        System.out.println("test");
        System.out.println("Test");//uzima se metoda iz Animal klase
    }
}
