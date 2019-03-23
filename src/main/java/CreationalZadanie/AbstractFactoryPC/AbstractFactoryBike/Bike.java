package CreationalZadanie.AbstractFactoryPC.AbstractFactoryBike;

import lombok.Data;

@Data
public class Bike {

    private String manufacturer;
    private int sits;
    private int gears;
    private BikeType bikeType;

    public Bike(String manufacturer, int sits, int gears, BikeType bikeType) {
        this.manufacturer = manufacturer;
        this.sits = sits;
        this.gears = gears;
        this.bikeType = bikeType;
    }
}
