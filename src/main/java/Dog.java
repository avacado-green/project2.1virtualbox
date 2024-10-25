public class Dog extends Pet {
    public Dog(String name, String birthDate, String commands) {
        super(name, birthDate, commands);
    }

    public String makeSound() {
        return "Woof!";
    }
}
