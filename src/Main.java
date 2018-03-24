import java.util.*;

public class Main {
    public static void main(String[] args) {
        StringImput text = new ConsoleStringImput();
        MaikingWordsCollection sentence = new AddWordsInLIst(text.getText());
        List<String> wordsArray = sentence.getArrayOfWords();
        System.out.println("Все слова:");
        System.out.println(wordsArray.toString());
        MakingCollectionOfUnique arrayOfWords = new AddWordsInSet(wordsArray);
        Set<String> arrayOfUniqueWords = arrayOfWords.getUniqueWOrds();
        MakingCollectionSorted sortedWords = new Sorter(arrayOfUniqueWords);
        TreeSet<String> sortedUniqueWords = sortedWords.sort();
        System.out.println("Уникальные  слова  слова отсортированые по возростаню длины:");
        System.out.println(sortedUniqueWords.toString());
        MakingOfMap mapOfWords = new CounterOfQuantity(wordsArray, arrayOfUniqueWords);
        Map<String, Integer> quantityOfWords = mapOfWords.getMap();
        try {
            System.out.printf("Данное слов вствечается {%d} раз в предложении ", getquantity(quantityOfWords));
        } catch (NotFoundExeption e) {
            e.printStackTrace();
            Set entrySet = quantityOfWords.entrySet();
            Iterator it = entrySet.iterator();
            while (it.hasNext()) {
                Map.Entry me = (Map.Entry) it.next();
                System.out.printf("Слово: %s  Количество в тексте :  %d \n", me.getKey(), me.getValue());
            }
        }
    }

    private static int getquantity(Map<String, Integer> quantityOfWords) throws NotFoundExeption {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите слово :");
        String word = in.next();
        quantityOfWords.get(word);
        if (quantityOfWords.get(word) != null) {
            return quantityOfWords.get(word);
        } else
            throw new NotFoundExeption("Данное слово отсутствует");
    }
}