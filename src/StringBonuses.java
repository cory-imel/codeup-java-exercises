import java.text.Format;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

class SimpleDateFormatStringToDate {
    public static void main(String[] args) throws Exception {
        System.out.println("Please input a date (11/20/2017): ");
        Scanner sc = new Scanner(System.in);
        String expectedPattern = "MM/dd/yyyy";
        String userInput = sc.nextLine();

        SimpleDateFormat formatter = new SimpleDateFormat(expectedPattern);
        Date date = formatter.parse(userInput);

        Format dFormatter = new SimpleDateFormat("MMMM dd, yyyy");
        String s = dFormatter.format(date);

        System.out.println(s);
    }
}

class sentenceParse {
    public static void main(String[] args) {
        String input;
        int vowelCount = 0;
        int constCount = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Please input a sentence: ");
        input = sc.nextLine();
        input = input.trim();
        System.out.println(input);
        for (int i = 0; i < input.length(); i++){
            if (input.charAt(i) == 'a' || input.charAt(i) == 'e' ||input.charAt(i) == 'i' || input.charAt(i) == 'o' || input.charAt(i) == 'u'){
                vowelCount++;
            }else if (input.charAt(i) != '.' || input.charAt(i) != '?' || input.charAt(i) != '?' || input.charAt(i) != '!' || input.charAt(i) != ',' || input.charAt(i) == ';'){
                System.out.println(input.charAt(i));
                constCount++;
            }
        }
        System.out.println( vowelCount + " vowels and " + constCount + " consonants.");
    }
}