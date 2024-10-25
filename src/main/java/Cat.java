public class Cat extends Pet {
    public Cat(String name, String birthDate, String commands) {
        super(name, birthDate, commands);
    }

    public String makeSound() {
        return "Meow!";
    }
}
