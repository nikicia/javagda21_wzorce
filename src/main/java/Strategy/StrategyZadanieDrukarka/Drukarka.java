package Strategy.StrategyZadanieDrukarka;

public class Drukarka {

    private IFormaterCzcionki formatter;

    public void setFormatter(IFormaterCzcionki formatter) {
        this.formatter = formatter;
    }

    public String reformat(String tekstDoPrzetworzenia) {
        return formatter.zmieniaczCzcionki(tekstDoPrzetworzenia);
    }
}
