package Strategy.StrategyZadanieDrukarka;

public class FormaterTrim implements IFormaterCzcionki {
    public String zmieniaczCzcionki(String tekstDoZmiany) {
        return tekstDoZmiany.trim();
    }
}
