package animals;

public class Dog implements Pet {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void makeSound() {
        System.out.println("Гав! Гав!");
    }

    @Override
    public String getName() {
        return this.name;
    }
}
