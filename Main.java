// An animal shelter, which holds only dogs and cats, operates on a strictly
// "first in, first out" basis. People must adopt either the "oldest" (based on arrival time) of
//  all animals at the shelter, or they can select whether they would
//  prefer a dog or a cat (and will receive the oldest animal of that type).
//   They cannot select which specific animal they would like.
//   Create the data structures to maintain this system and implement
//   operations such as enqueue, dequeueAny, dequeueDog, and dequeueCat.

package Queues;

public class Main {
    public static void main(String[] args) {
        AnimalShelter shelter = new AnimalShelter();

        shelter.enqueue(new Dog("Flash"));
        shelter.enqueue(new Cat("Mango"));
        shelter.enqueue(new Dog("Piper"));
        shelter.enqueue(new Cat("Mittens"));
        shelter.enqueue(new Dog("Shiloh"));
        shelter.enqueue(new Cat("Ziggy"));

        System.out.println("Dequeued any: " + shelter.dequeueAny().getName());
        System.out.println("Dequeued dog: " + shelter.dequeueDog().getName());
        System.out.println("Dequeued cat: " + shelter.dequeueCat().getName());
    }
}