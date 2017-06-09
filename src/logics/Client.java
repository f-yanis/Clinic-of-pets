package logics;

import animals.Pet;


public class Client {
    private String id;
    private String name;
    private String lastName;
    private Pet pet;

    public Client(String id, String name, String lastName, Pet pet) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.pet = pet;
    }
}
