public class Camel extends PackAnimal {
    public Camel(String name, String birthDate, int loadCapacity) {
        super(name, birthDate, loadCapacity);
    }

    public String makeSound() {
        return "Grunt!";
    }
}
