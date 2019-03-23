package CreationalZadanie.AbstractFactoryPC;

public class AsusPC extends AbstractPC {

    public AsusPC (String nazwaKomputera, Computer_Brand markaKomputera, int power, double gpuPower, boolean overlocked) {
        super(nazwaKomputera, Computer_Brand.ASUS, power, gpuPower, overlocked);
    }
    public static AsusPC createAsusN53 () {
        return new AsusPC("N53", Computer_Brand.ASUS, 100, 0.2,false);
    }

    public static AsusPC createAsusN100 () {
        return new AsusPC("N100", Computer_Brand.ASUS, 80, 0.3,false);
    }
}
