package Strategy.StrategyZadanieDrukarka;

public class FormaterToLowerCase implements IFormaterCzcionki {
    public String zmieniaczCzcionki(String tekstDoZmiany) {
        return tekstDoZmiany.toLowerCase();
    }
}
