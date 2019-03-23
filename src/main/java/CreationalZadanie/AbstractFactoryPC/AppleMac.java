package CreationalZadanie.AbstractFactoryPC;

public class AppleMac extends AbstractPC {
    public AppleMac(String nazwaKomputera, Computer_Brand markaKomputera, int power, double gpuPower, boolean overlocked) {
        super(nazwaKomputera, Computer_Brand.APPLE, power, gpuPower, overlocked);
    }

    public static AppleMac createAppleMac1 () {
        return new AppleMac("Apple1", Computer_Brand.APPLE, 70, 0.5,false);
    }

    public static AppleMac createAppleMac2 () {
        return new AppleMac("Apple2", Computer_Brand.APPLE, 90, 0.7,false);
    }
}
