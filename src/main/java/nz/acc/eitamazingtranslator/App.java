package nz.acc.eitamazingtranslator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Amazing Translator
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //List for German Languages
        List<String> germanTranslations = new ArrayList<>();
        germanTranslations.add("Einz");
        germanTranslations.add("Zwei");
        germanTranslations.add("Drei");
        germanTranslations.add("Vier");
        germanTranslations.add("Fünf");
        germanTranslations.add("Sechs");
        germanTranslations.add("Sieben");
        germanTranslations.add("Acht");
        germanTranslations.add("Neun");
        germanTranslations.add("Zehn");

        //List for French Languages
        List<String> frenchTranslations = new ArrayList<>();
        frenchTranslations.add("Un");
        frenchTranslations.add("Deux");
        frenchTranslations.add("Trois");
        frenchTranslations.add("Quatre");
        frenchTranslations.add("Cinq");
        frenchTranslations.add("Six");
        frenchTranslations.add("Sept");
        frenchTranslations.add("Huit");
        frenchTranslations.add("Neuf");
        frenchTranslations.add("Dix");

        System.out.println("What is the number to translate(from 1 to 10)?");
        Scanner scanner = new Scanner(System.in);
        String numberisstring = scanner.nextLine();
        Integer number = null;
        try {
            number = Integer.parseInt(numberisstring);
            System.out.println(number);
        }
        catch (NumberFormatException nfe) {
            System.out.println("The number had to be numeric");
            System.exit(0);
        }
        System.out.println("What is the Language? (1- French, 2- German)");
        String optionasstring = scanner.nextLine();
        Integer option = null;
        try {
            option = Integer.parseInt(optionasstring);
            System.out.println(option);
        }
        catch (NumberFormatException nfe) {
            System.out.println("The number had to be numeric");
            System.exit(0);
        }
        //Check option 1or 2
        if (option == 1){
            String translator = frenchTranslations.get(number-1);
            System.out.println(translator);
        }
        else if (option == 2){
            String translator = germanTranslations.get(number-1);
            System.out.println(translator);
        }
        else {
            System.out.println("Only French or German available!");
        }
    }
}

