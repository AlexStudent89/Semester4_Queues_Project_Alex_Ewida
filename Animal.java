//Animal
package Queues;

import java.time.LocalDateTime;

public abstract class Animal {
    private String name;
    private LocalDateTime arrivalTime;

    public Animal(String name) {
        this.name = name;
        this.arrivalTime = LocalDateTime.now();
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getArrivalTime() {
        return arrivalTime;
    }
}