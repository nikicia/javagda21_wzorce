package BilderZadania.BilderBohater;

public class Main {
    public static void main(String[] args) {

        Bohater.Builder builder = new Bohater.Builder();

        Bohater bohater = builder
                .setHealth(50)
                .setMana(10)
                .setNumberOfPoints(7)
                .setName("krzychu")
                .create();

        System.out.println(builder+ ", ");
    }
}
