package CreationalZadanie.AbstractFactoryPC;

import lombok.Data;

@Data
public abstract class  AbstractPC {
    private String nazwaKomputera;
    private Computer_Brand markaKomputera;
    private int power;
    private double gpuPower;
    private boolean overlocked;

    public AbstractPC(String nazwaKomputera, Computer_Brand markaKomputera, int power, double gpuPower, boolean overlocked) {
        this.nazwaKomputera = nazwaKomputera;
        this.markaKomputera = markaKomputera;
        this.power = power;
        this.gpuPower = gpuPower;
        this.overlocked = overlocked;
    }
}
