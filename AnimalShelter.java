// AnimalShelter.java
package Queues;

import java.util.LinkedList;

public class AnimalShelter {
    private LinkedList<Dog> dogs = new LinkedList<>();
    private LinkedList<Cat> cats = new LinkedList<>();

    public void enqueue(Animal animal) {
        if (animal instanceof Dog) {
            dogs.addLast((Dog) animal);
        } else if (animal instanceof Cat) {
            cats.addLast((Cat) animal);
        }
    }

    public Animal dequeueAny() {
        if (dogs.isEmpty()) {
            return dequeueCat();
        } else if (cats.isEmpty()) {
            return dequeueDog();
        }
        Dog oldestDog = dogs.peek();
        Cat oldestCat = cats.peek();
        if (oldestDog.getArrivalTime() < oldestCat.getArrivalTime()) {
            return dequeueDog();
        } else {
            return dequeueCat();
        }
    }

    public Dog dequeueDog() {
        return dogs.poll();
    }

    public Cat dequeueCat() {
        return cats.poll();
    }
}