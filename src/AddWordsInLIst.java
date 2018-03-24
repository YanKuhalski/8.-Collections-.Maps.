import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddWordsInLIst implements MaikingWordsCollection {
    public String text;

    public AddWordsInLIst(String text) {
        this.text = text;
    }

    public List<String> getArrayOfWords() {
        List<String> words = new ArrayList<>(Arrays.asList(text.split(" ")));
        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).equals("STOP")) {
                words.remove(i);
            }
        }
        return words;
    }
}