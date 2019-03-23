package SingletonZadaniePoczta;

public class Automat implements IGeneratorBiletow {
    public int generujBilet() {
      //  return GeneratorBiletow.getInstance().pobierzNastepnyNumerek();  <- jesli nie enum
        return GeneratorBiletow.INSTANCE.pobierzNastepnyNumerek();
    }
}
