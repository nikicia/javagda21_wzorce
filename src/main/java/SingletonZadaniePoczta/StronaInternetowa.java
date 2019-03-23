package SingletonZadaniePoczta;

public class StronaInternetowa implements IGeneratorBiletow {
    public int generujBilet() {
        //return GeneratorBiletow.getInstance().pobierzNastepnyNumerek(); <- jesli nie enum a class
        return GeneratorBiletow.INSTANCE.pobierzNastepnyNumerek();
    }
}
