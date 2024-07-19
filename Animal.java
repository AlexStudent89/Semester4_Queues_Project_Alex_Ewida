//Animal file
package Queues;

import java.time.LocalDateTime;

public abstract class Animal {
    private String name;
    private LocalDateTime arrivalTime;
    private String breed;
    private String gender;
    private int age;

    public Animal(String name, String breed, String gender, int age) {
        this.name = name;
        this.breed = breed;
        this.gender = gender;
        this.age = age;
        this.arrivalTime = LocalDateTime.now();
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public LocalDateTime getArrivalTime() {
        return arrivalTime;
    }

    @Override
    public String toString() {
        return name + " (" + breed + ", " + gender + ", " + age + " years old)";
    }
}
