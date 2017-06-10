package animals;

public class Cat implements Pet {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void makeSound() {
        System.out.println("Мяу! Мяу!");
    }

    @Override
    public String getName() {
        return this.name;
    }
}
