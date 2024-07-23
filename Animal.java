// Animal java file
package Queues;

public abstract class Animal {
    private String name;
    private String breed;
    private String gender;
    private int age;
    private long arrivalTime;

    public Animal(String name, String breed, String gender, int age, long arrivalTime) {
        this.name = name;
        this.breed = breed;
        this.gender = gender;
        this.age = age;
        this.arrivalTime = arrivalTime;
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

    public long getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(long arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    @Override
    public String toString() {
        return name + " (" + breed + ", " + gender + ", " + age + " years old)";
    }
}