public class Animal {
    private String name;
    private String birthDate;

    public Animal(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String makeSound() {
        return "";
    }

    public String getInfo() {
        return name + ", " + birthDate;
    }
}
