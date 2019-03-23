package CreationalZadanie.AbstractFactoryPC.AbstractFactoryBike;

public abstract  class BikeFactory {
    public static Bike stworz10os5przezKross() {
        return new Bike("KROSS", 10, 5, BikeType.TANDEM);
    }

}
