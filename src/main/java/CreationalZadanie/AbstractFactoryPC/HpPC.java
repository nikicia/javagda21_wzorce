package CreationalZadanie.AbstractFactoryPC;

public class HpPC extends AbstractPC{
    public HpPC(String nazwaKomputera, Computer_Brand markaKomputera, int power, double gpuPower, boolean overlocked) {
        super(nazwaKomputera, Computer_Brand.HP, power, gpuPower, overlocked);
    }

    public static HpPC createHp1 () {
        return new HpPC("HP1", Computer_Brand.HP, 70, 0.5,false);
    }
    public static HpPC createHp2 () {
        return new HpPC("HP2", Computer_Brand.HP, 100, 0.4,true);
    }
}
