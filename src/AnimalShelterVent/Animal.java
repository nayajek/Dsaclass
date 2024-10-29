package AnimalShelterVent;

public class Animal {
    private final String name;
    private int order;

    // Constructor
    public Animal(String name) {
        this.name = name;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    // Compare orders to determine the oldest
    public boolean isOlderThan(Animal other) {
        return this.order < other.order;
    }
}
