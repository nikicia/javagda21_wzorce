package Strategy.StrategyZadanieDrukarka;

public class FormaterUpper implements IFormaterCzcionki {
    public String zmieniaczCzcionki(String tekstDoZmiany) {
        return tekstDoZmiany.toUpperCase();
    }
}
