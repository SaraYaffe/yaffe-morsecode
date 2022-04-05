import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class MorseCodeConverter {

    private static final String[] code
            = {".-", "-...", "-.-.", "-..", ".",
            "..-.", "--.", "....", "..", ".---",
            "-.-", ".-..", "--", "-.", "---",
            ".--.", "--.-", ".-.", "...", "-",
            "..-", "...-", ".--", "-..-", "-.--",
            "--.."};
    private final Map<String, Character> morseToEnglish = new HashMap<>();

    public MorseCodeConverter() {
        for (int i = 0; i < 26; i++) {
            morseToEnglish.put(code[i], (char) ('a' + i));
        }

    }

    public String toMorseCode(String englishInput) {
        StringBuilder morseString = new StringBuilder();
        String[] array = englishInput.split(" ");

        for (String s : array) {
            for (int i = 0; i < s.length(); i++) {
                try {
                    morseString.append(code[s.charAt(i) - 'a']).append(" ");
                } catch (Exception ignored) {}
            }
        }

        return morseString.toString();
    }

    public String toEnglish(String morseCodeInput) {
        StringBuilder englishString = new StringBuilder();
        String[] array = morseCodeInput.split(" ");

        for (String s : array) {
            if(morseToEnglish.get(s) != null){
                englishString.append(morseToEnglish.get(s));
            }
        }

        return englishString.toString();
    }

}
