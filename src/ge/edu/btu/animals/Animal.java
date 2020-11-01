package ge.edu.btu.animals;

public abstract class Animal {

    private int id;

    private String name;

    private AnimalType type;

    public Animal() {}

    public Animal(int id, String name, AnimalType type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public AnimalType getType() {
        return type;
    }
    public void setType(AnimalType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return getName() + ": " + speed();
    }

    public abstract double speed();
}
