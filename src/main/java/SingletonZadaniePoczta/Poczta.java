package SingletonZadaniePoczta;

public class Poczta {
    private Automat automat;
    private Rejestracja rejestracja;
    private StronaInternetowa stronaInternetowa;

    public Poczta() {
        this.automat = new Automat();
        this.rejestracja = new Rejestracja();
        this.stronaInternetowa = new StronaInternetowa();
    }

    public int pobierzBiletZAutomatu() {
        return automat.generujBilet();
    }

    public int pobierzBiletZeStronyInternetowej(){
        return stronaInternetowa.generujBilet();
    }

    public int pobierzBiletZRejestracji(){
        return rejestracja.generujBilet();
    }
}
