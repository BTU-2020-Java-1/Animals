package ge.edu.btu.animals;

public class Horse extends Animal {

    private static final int SPEED_COEFFICIENT = 20;

    private static final int RED_HORSE_EXTRA_SPEED = 15;

    private int level;

    private boolean red;

    public Horse() {}

    public Horse(int id, String name, AnimalType type, int level, boolean red) {
        super(id, name, type);
        this.level = level;
        this.red = red;
    }

    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }

    public boolean isRed() {
        return red;
    }
    public void setRed(boolean red) {
        this.red = red;
    }

    @Override
    public double speed() {
        if (red) {
            return level * SPEED_COEFFICIENT + RED_HORSE_EXTRA_SPEED;
        } else {
            return level * SPEED_COEFFICIENT;
        }
    }
}
