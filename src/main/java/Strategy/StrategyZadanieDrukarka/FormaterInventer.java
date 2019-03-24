package Strategy.StrategyZadanieDrukarka;

public class FormaterInventer implements IFormaterCzcionki {
    public String zmieniaczCzcionki(String tekstDoZmiany) {
        char[] chars = tekstDoZmiany.toCharArray();
        for (int i = 0; i <chars.length ; i++) {
            if (Character.isUpperCase(chars[i])) {
                chars[i] = Character.toLowerCase(chars[i]);
            } else if (Character.isLowerCase(chars[i])) {
                chars[i] = Character.toUpperCase(chars[i]);
            }

        }
        return new String(chars);
    }
}
