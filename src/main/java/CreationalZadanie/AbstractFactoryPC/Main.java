package CreationalZadanie.AbstractFactoryPC;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<AbstractPC> listaKomputerow = new ArrayList<AbstractPC>();

        listaKomputerow.add(AppleMac.createAppleMac1());
        listaKomputerow.add(AppleMac.createAppleMac2());
        listaKomputerow.add(HpPC.createHp1());
        listaKomputerow.add(HpPC.createHp2());
        listaKomputerow.add(SamsungPC.createSamsung1());
        listaKomputerow.add(SamsungPC.createSamsung2());
        listaKomputerow.add(AsusPC.createAsusN53());
        listaKomputerow.add(AsusPC.createAsusN100());

        System.out.println(listaKomputerow);
    }
}
