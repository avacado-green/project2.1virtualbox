public class Donkey extends PackAnimal {
    public Donkey(String name, String birthDate, int loadCapacity) {
        super(name, birthDate, loadCapacity);
    }

    public String makeSound() {
        return "Hee-haw!";
    }
}
