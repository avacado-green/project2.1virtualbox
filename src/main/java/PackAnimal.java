public class PackAnimal extends Animal {
    private int loadCapacity;

    public PackAnimal(String name, String birthDate, int loadCapacity) {
        super(name, birthDate);
        this.loadCapacity = loadCapacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
}




