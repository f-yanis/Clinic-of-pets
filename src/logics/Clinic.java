package logics;


import animals.*;


/**
 * Класс описывает клинику
 */
public class Clinic {
    private Client[] clients;

    public Clinic(int size) {
        this.clients = new Client[size];
    }

    public void addClient(int posizion) {
        String id = HelpIn.step("Введите id клиента: ");
        String name = HelpIn.step("Введите имя клиента: ");
        String lastName = HelpIn.step("Введите фамилию клиента: ");
        String petClass = HelpIn.step("Введите вид животного (кот, собака, котопес?): ");
        String namePet;
        Pet pet = null;

        if (petClass.equals("кот")) {
            namePet = HelpIn.step("Ввелите имя питомца: ");
            pet = new Cat(namePet);
        } else if (petClass.equals("собака")) {
            namePet = HelpIn.step("Ввелите имя питомца: ");
            pet = new Dog(namePet);
        } else if (petClass.equals("котопес")) {
            pet = new CatDog(new Dog(namePet = HelpIn.step("Введите имя собаки: ")),
                             new Cat(namePet = HelpIn.step("Ввелите имя кота: ")));
        }

        this.clients[posizion] = new Client(id, name, lastName, pet);
    }

    public Client findClientByPetName(String name) {

        //todo: реализовать поиск по имени питомца

        return clients[0];
    }

    public Client findClientByName(String name) {

        //todo: реализовать поиск по имени питомца

        return clients[0];
    }
}
