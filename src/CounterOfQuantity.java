import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CounterOfQuantity implements MakingOfMap {
    private List<String> allWords;
    private Set<String> uniqueWords;

    public CounterOfQuantity(List<String> allWords, Set<String> uniqueWords) {
        this.allWords = allWords;
        this.uniqueWords = uniqueWords;
    }

    public Map<String, Integer> getMap() {
        Map<String, Integer> mapOfWords = new HashMap<>();
        for (String i : uniqueWords) {
            int quantity = 0;
            for (String a : allWords) {
                if (i.equals(a)) quantity++;
            }
            mapOfWords.put(i, quantity);
        }
        return mapOfWords;
    }
}