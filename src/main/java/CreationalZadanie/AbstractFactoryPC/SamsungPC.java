package CreationalZadanie.AbstractFactoryPC;

public class SamsungPC extends AbstractPC {

    public SamsungPC (String nazwaKomputera, Computer_Brand markaKomputera, int power, double gpuPower, boolean overlocked) {
        super(nazwaKomputera, Computer_Brand.SAMSUNG, power, gpuPower, overlocked);
    }

    public static SamsungPC createSamsung1 () {
        return new SamsungPC("Samsung1", Computer_Brand.SAMSUNG, 100, 0.2,false);
    }

    public static SamsungPC createSamsung2 () {
        return new SamsungPC("Samsung2", Computer_Brand.SAMSUNG, 100, 0.5,true);
    }
}
