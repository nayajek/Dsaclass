package AnimalShelterVent;

public class Main {
    public static void main(String[] args) {
        AnimalShelter shelter = new AnimalShelter();

        // Add animals to the shelter
        shelter.enqueue(new Dog("White"));
        shelter.enqueue(new Cat("Mila"));
        shelter.enqueue(new Dog("Major"));
        shelter.enqueue(new Cat("Shiela"));

        // Adopt animals
        System.out.println("Adopt Any: " + shelter.dequeueAny().getName());
        System.out.println("Adopt Dog: " + shelter.dequeueDog().getName());
        System.out.println("Adopt Cat: " + shelter.dequeueCat().getName());

        // Add more animals
        shelter.enqueue(new Dog("Jack"));
        shelter.enqueue(new Cat("Ben"));

        // Adopt remaining animals
        System.out.println("Adopt Any: " + shelter.dequeueAny().getName());
        System.out.println("Adopt Dog: " + shelter.dequeueDog().getName());
        System.out.println("Adopt Cat: " + shelter.dequeueCat().getName());
    }
}
