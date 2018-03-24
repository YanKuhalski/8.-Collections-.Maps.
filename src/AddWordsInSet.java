import java.util.*;

public class AddWordsInSet implements MakingCollectionOfUnique {
    public List<String> listOfwords;

    public AddWordsInSet(List<String> collection) {
        listOfwords = collection;
    }

    public Set<String> getUniqueWOrds() {
        Set<String> uniqueWords = new HashSet<>();
        for (String words : listOfwords) {
            uniqueWords.add(words);
        }

        return uniqueWords;
    }
}