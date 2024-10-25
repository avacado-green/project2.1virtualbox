import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AnimalRegistry {
    private List<Animal> animals = new ArrayList<>();

    public static void main(String[] args) {
        AnimalRegistry registry = new AnimalRegistry();
        registry.runMenu();
    }

    public void runMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Завести новое животное");
            System.out.println("2. Определить животное в правильный класс");
            System.out.println("3. Увидеть список команд, которые выполняет животное");
            System.out.println("4. Обучить животное новым командам");
            System.out.println("5. Выход");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    try (Counter counter = new Counter()) {
                        addNewAnimal(counter);
                    } catch (Exception e) {
                        System.out.println("Ошибка: " + e.getMessage());
                    }
                    break;
                case 2:
                    determineAnimalClass();
                    break;
                case 3:
                    showAnimalCommands();
                    break;
                case 4:
                    trainAnimal();
                    break;
                case 5:
                    System.out.println("Выход...");
                    return;
                default:
                    System.out.println("Неверный выбор. Попробуйте снова.");
            }
        }
    }

    private void addNewAnimal(Counter counter) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите тип животного (Собака, Кошка, Хомяк, Лошадь, Осел, Верблюд): ");
        String type = scanner.nextLine();
        System.out.println("Введите имя животного: ");
        String name = scanner.nextLine();
        System.out.println("Введите дату рождения (гггг-мм-дд): ");
        String birthDate = scanner.nextLine();

        Animal animal = null;
        switch (type.toLowerCase()) {
            case "собака":
                System.out.println("Введите команды (через запятую): ");
                String dogCommands = scanner.nextLine();
                animal = new Dog(name, birthDate, dogCommands);
                break;
            case "кошка":
                System.out.println("Введите команды (через запятую): ");
                String catCommands = scanner.nextLine();
                animal = new Cat(name, birthDate, catCommands);
                break;
            case "хомяк":
                System.out.println("Введите команды (через запятую): ");
                String hamsterCommands = scanner.nextLine();
                animal = new Hamster(name, birthDate, hamsterCommands);
                break;
            case "лошадь":
                System.out.println("Введите грузоподъемность: ");
                int horseLoadCapacity = scanner.nextInt();
                scanner.nextLine();
                animal = new Horse(name, birthDate, horseLoadCapacity);
                break;
            case "осел":
                System.out.println("Введите грузоподъемность: ");
                int donkeyLoadCapacity = scanner.nextInt();
                scanner.nextLine();
                animal = new Donkey(name, birthDate, donkeyLoadCapacity);
                break;
            case "верблюд":
                System.out.println("Введите грузоподъемность: ");
                int camelLoadCapacity = scanner.nextInt();
                scanner.nextLine();
                animal = new Camel(name, birthDate, camelLoadCapacity);
                break;
            default:
                System.out.println("Неизвестный тип животного.");
                return;
        }
        animals.add(animal);
        counter.add();
        System.out.println("Новое животное добавлено!");
        System.out.println("Текущее значение счетчика: " + counter.getCount());
    }

    private void determineAnimalClass() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя животного для определения класса: ");
        String name = scanner.nextLine();

        for (Animal animal : animals) {
            if (animal.getName().equalsIgnoreCase(name)) {
                if (animal instanceof Dog) {
                    System.out.println(name + " относится к классу Собак.");
                } else if (animal instanceof Cat) {
                    System.out.println(name + " относится к классу Кошек.");
                } else if (animal instanceof Hamster) {
                    System.out.println(name + " относится к классу Хомяков.");
                } else if (animal instanceof Horse) {
                    System.out.println(name + " относится к классу Лошадей.");
                } else if (animal instanceof Donkey) {
                    System.out.println(name + " относится к классу Ослы.");
                } else if (animal instanceof Camel) {
                    System.out.println(name + " относится к классу Верблюдов.");
                }
                return;
            }
        }
        System.out.println("Животное не найдено.");
    }

    private void showAnimalCommands() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя животного для просмотра команд: ");
        String name = scanner.nextLine();

        for (Animal animal : animals) {
            if (animal.getName().equalsIgnoreCase(name)) {
                if (animal instanceof Pet) {
                    System.out.println("Команды: " + ((Pet) animal).getCommands());
                } else {
                    System.out.println("Это вьючное животное, команды не применимы.");
                }
                return;
            }
        }
        System.out.println("Животное не найдено.");
    }

    private void trainAnimal() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя животного для обучения новым командам: ");
        String name = scanner.nextLine();

        for (Animal animal : animals) {
            if (animal.getName().equalsIgnoreCase(name) && animal instanceof Pet) {
                System.out.println("Введите новые команды (через запятую): ");
                String newCommands = scanner.nextLine();
                ((Pet) animal).setCommands(newCommands);
                System.out.println("Животное обучено новым командам!");
                return;
            }
        }
        System.out.println("Животное не найдено или это вьючное животное.");
    }
}
