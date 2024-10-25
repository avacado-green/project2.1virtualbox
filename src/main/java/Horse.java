public class Horse extends PackAnimal {
    public Horse(String name, String birthDate, int loadCapacity) {
        super(name, birthDate, loadCapacity);
    }

    public String makeSound() {
        return "Neigh!";
    }
}
