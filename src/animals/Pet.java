package animals;

/**
 * Описывает поведение питомца
 */
public interface Pet {
    /**
     * Издать звук
     */
    void makeSound();

    /**
     * Вернуть имя
     * @return
     */
    String getName();
}
