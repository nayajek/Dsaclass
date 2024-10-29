package AnimalShelterVent;

import java.util.LinkedList;

public class AnimalShelter {
    private LinkedList<Dog> dogs = new LinkedList<>();
    private LinkedList<Cat> cats = new LinkedList<>();
    private int order = 0;  // This keeps track of the arrival order

    // Enqueue operation
    public void enqueue(Animal animal) {
        animal.setOrder(order);
        order++;

        if (animal instanceof Dog) {
            dogs.addLast((Dog) animal);
        } else if (animal instanceof Cat) {
            cats.addLast((Cat) animal);
        }
    }

    // DequeueAny: Adopt the oldest animal
    public Animal dequeueAny() {
        if (dogs.isEmpty() && cats.isEmpty()) {
            System.out.println("No animals available for adoption.");
            return null;
        } else if (dogs.isEmpty()) {
            return dequeueCat(); // Only cats available
        } else if (cats.isEmpty()) {
            return dequeueDog(); // Only dogs available
        } else {
            // Return the oldest animal
            Dog oldestDog = dogs.peek();
            Cat oldestCat = cats.peek();

            if (oldestDog.isOlderThan(oldestCat)) {
                return dequeueDog();
            } else {
                return dequeueCat();
            }
        }
    }

    // Dequeue Dog: Adopt oldest dog
    public Dog dequeueDog() {
        if (!dogs.isEmpty()) {
            return dogs.poll();
        } else {
            System.out.println("No dogs available for adoption.");
            return null;
        }
    }

    // Dequeue Cat: Adopt oldest cat
    public Cat dequeueCat() {
        if (!cats.isEmpty()) {
            return cats.poll();
        } else {
            System.out.println("No cats available for adoption.");
            return null;
        }
    }
}
