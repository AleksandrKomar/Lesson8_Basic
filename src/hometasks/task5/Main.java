package hometasks.task5;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal("Васька", 45, false);
        Animal animal1 = new Animal("Васька", 45, false);
        Animal animal2 = new Animal("Васька", 44, false);

        System.out.println("Идентичны = " + animal.equals(animal1));
        System.out.println("Идентичны = " + animal.equals(animal2));

        System.out.println(animal);
        System.out.println("Хеш-код = " + animal.hashCode());

    }

}
