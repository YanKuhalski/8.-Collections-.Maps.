import java.util.Scanner;

public class ConsoleStringImput implements StringImput {
    Scanner scanner = new Scanner(System.in);

    public String getText() {
        String finalSentence = "";

        StringBuilder stringBuilder = new StringBuilder();
        System.out.println("Введите 'STOP' после того как текст будет введен");
        while (scanner.hasNextLine()) {
            stringBuilder.append(scanner.nextLine() + " ");
            finalSentence = stringBuilder.toString();
            if (finalSentence.indexOf("STOP") > 0)
                break;
        }
        return finalSentence.trim();
    }
}