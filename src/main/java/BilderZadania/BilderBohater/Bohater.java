package BilderZadania.BilderBohater;

public class Bohater {
    private String name;
    private int health;
    private int mana;
    private  int numberOfPoints;

    public Bohater(String name, int health, int mana, int numberOfPoints) {
        this.name = name;
        this.health = health;
        this.mana = mana;
        this.numberOfPoints = numberOfPoints;
    }

    @Override
    public String toString() {
        return "Bohater{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", mana=" + mana +
                ", numberOfPoints=" + numberOfPoints +
                '}';
    }

    public static class Builder {
         private String name;
         private int health;
         private int mana;
         private int numberOfPoints;

        public Builder() {
        }


         public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setHealth(int health) {
            this.health = health;
            return this;
        }

        public Builder setMana(int mana) {
            this.mana = mana;
            return this;
        }

        public Builder setNumberOfPoints(int numberOfPoints) {
            this.numberOfPoints = numberOfPoints;
            return this;
        }

        public Bohater create() {
            return new Bohater(name, health, mana, numberOfPoints);
        }

        @Override
        public String toString() {
            return "Builder{" +
                    "name='" + name + '\'' +
                    ", health=" + health +
                    ", mana=" + mana +
                    ", numberOfPoints=" + numberOfPoints +
                    '}';
        }
    }
}
