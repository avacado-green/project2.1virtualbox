public class Pet extends Animal {
    private String commands;

    public Pet(String name, String birthDate, String commands) {
        super(name, birthDate);
        this.commands = commands;
    }

    public String getCommands() {
        return commands;
    }

    public void setCommands(String commands) {
        this.commands = commands;
    }
}

