package ge.edu.btu.animals;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main(String[] args) {
        Animal horse1 = new Horse(1, "Horse 1", AnimalType.BEAST_OF_PREY, 7, true);
        Animal horse2 = new Horse(2, "Horse 2", AnimalType.BEAST_OF_PREY, 8, false);
        Animal dog1 = new Dog(3, "Horse 3", AnimalType.PAT, LocalDate.of(2015, 4, 4));
        Animal dog2 = new Dog(4, "Horse 4", AnimalType.PAT, LocalDate.of(2014, 3, 20));

        List<Animal> animals = new ArrayList<>();
        animals.add(horse1);
        animals.add(horse2);
        animals.add(dog1);
        animals.add(dog2);

        try {
            validate(animals);
        } catch (AnimalException ex) {
            System.out.println("დაფიქსირდა გაუთვალისწინებელი შემთხვევა: " + ex.getMessage());
        }

        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }

    private static void validate(List<Animal> animals) throws AnimalException {
        for (int i = 0; i < animals.size(); i++) {
            for (int j = i + 1; j < animals.size(); j++) {
                if (animals.get(i).getId() == animals.get(j).getId()) {
                    throw new AnimalException("Duplicate ID");
                }
            }
        }
    }
}
