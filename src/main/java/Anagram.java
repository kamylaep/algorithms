import java.util.Arrays;
import java.util.stream.Collectors;

public class Anagram {

    public boolean isAnagram(String a, String b) {
        if (a.replace(" ", "").length() != b.replace(" ", "").length()) {
            return false;
        }

        String collectA = getCollect(a);
        String collectB = getCollect(b);

        return collectA.equals(collectB);
    }

    private String getCollect(String w) {
        return Arrays.stream(w.split(""))
            .filter(f -> !f.equals(" "))
            .map(String::toLowerCase)
            .sorted()
            .collect(Collectors.joining());
    }

}
