package entities;

public class Inversor {
    private String string;

    public Inversor(String string) {
        this.string = string;
    }

    public static String inverterString(String str) {
        char[] chars = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            chars[i] = str.charAt(str.length() - 1 - i);
        }
        return new String(chars);
    }
}
