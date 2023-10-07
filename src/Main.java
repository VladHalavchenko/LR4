public class Main {
    public static void main(String[] args) {

        int smiley1CodePoint = 0x1F60A;
        int smiley2CodePoint = 0x1F604;
        int smiley3CodePoint = 0x1F609;

        System.out.println("Смайлик 1: " + new String(Character.toChars(smiley1CodePoint)));
        System.out.println("Смайлик 2: " + new String(Character.toChars(smiley2CodePoint)));
        System.out.println("Смайлик 3: " + new String(Character.toChars(smiley3CodePoint)));

        int randomSymbol1CodePoint = 0x2602; // ☂
        int randomSymbol2CodePoint = 0x2713; // ✓
        int randomSymbol3CodePoint = 0x1F4A9; // 💩

        System.out.println("Рандомний символ 1: " + new String(Character.toChars(randomSymbol1CodePoint)));
        System.out.println("Рандомний символ 2: " + new String(Character.toChars(randomSymbol2CodePoint)));
        System.out.println("Рандомний символ 3: " + new String(Character.toChars(randomSymbol3CodePoint)));

        String myString = "Java it`s the best language";
        StringBuffer buffer = new StringBuffer(myString);
        System.out.println(buffer.reverse());

    }
}