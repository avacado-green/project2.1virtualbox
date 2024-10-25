public class Hamster extends Pet {
    public Hamster(String name, String birthDate, String commands) {
        super(name, birthDate, commands);
    }

    public String makeSound() {
        return "Squeak!";
    }
}
