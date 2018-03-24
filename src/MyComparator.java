import java.util.Comparator;

public class MyComparator implements Comparator<String> {

    public int compare(String str1, String str2) {
        if (str1.length() - str2.length() != 0)
            return str1.length() - str2.length();
        else return 1;
    }
}