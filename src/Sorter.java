import java.util.Set;
import java.util.TreeSet;

public class Sorter implements MakingCollectionSorted {
    private Set<String> unsortedWords;

    public Sorter(Set<String> set) {
        this.unsortedWords = set;
    }

    public TreeSet<String> sort() {
        TreeSet<String> sortedWords = new TreeSet<>(new MyComparator());
        for (String word : unsortedWords) {
            sortedWords.add(word);
        }
        return sortedWords;
    }
}