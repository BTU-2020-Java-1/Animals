package ge.edu.btu.animals;

import java.time.LocalDate;

public class Dog extends Animal {

    private static final double SPEED_COEFFICIENT = 300;

    private LocalDate birthdate;

    public Dog() {}

    public Dog(int id, String name, AnimalType type, LocalDate birthdate) {
        super(id, name, type);
        this.birthdate = birthdate;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }
    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    @Override
    public double speed() {
        LocalDate now = LocalDate.now();
        int age = now.getYear() - birthdate.getYear();
        return SPEED_COEFFICIENT / age;
    }
}
