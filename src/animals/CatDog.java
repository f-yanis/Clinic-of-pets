package animals;

public class CatDog implements Pet {

    private Dog dog;
    private Cat cat;

    public CatDog(Dog dog, Cat cat) {
        this.dog = dog;
        this.cat = cat;
    }

    @Override
    public void makeSound() {
        cat.makeSound();
        dog.makeSound();
    }

    @Override
    public String getName() {
        return cat.getName() + dog.getName();
    }
}
