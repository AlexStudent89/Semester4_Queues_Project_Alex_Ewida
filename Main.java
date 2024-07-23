// Main java file
package Queues;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class Main {
    public static void main(String[] args) {
        AnimalShelter shelter = new AnimalShelter();

        long arrivalTimeBruce = LocalDateTime.of(2024, 7, 1, 0, 0).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
        Dog bruce = new Dog("Bruce", "Bloodhound", "Male", 7, arrivalTimeBruce);
        shelter.enqueue(bruce);

        long arrivalTimeFlash = LocalDateTime.of(2024, 7, 2, 0, 0).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
        Dog flash = new Dog("Flash", "Beagle", "Male", 5, arrivalTimeFlash);
        shelter.enqueue(flash);

        long arrivalTimeMango = LocalDateTime.of(2024, 7, 3, 0, 0).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
        Cat mango = new Cat("Mango", "Persian", "Male", 3, arrivalTimeMango);
        shelter.enqueue(mango);

        long arrivalTimePiper = LocalDateTime.of(2024, 7, 4, 0, 0).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
        Dog piper = new Dog("Piper", "Poodle", "Female", 2, arrivalTimePiper);
        shelter.enqueue(piper);

        System.out.println("Enqueue: " + bruce);

        System.out.println("Dequeue Any: " + shelter.dequeueAny());

        System.out.println("Dequeue Cat: " + shelter.dequeueCat());

        System.out.println("Dequeue Dog: " + shelter.dequeueDog());
    }
}