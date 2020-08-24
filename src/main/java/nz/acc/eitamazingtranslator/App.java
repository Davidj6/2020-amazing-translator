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
        TranslationDictionaries dictionaries=new TranslationDictionaries();
        dictionaries.initilizeDictionaries();


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
        try {
            String translated=dictionaries.getTranslation(number-1,option);
            System.out.println(translated);
        } catch (LanguageNotAvailableException lnse) {
            System.out.println("Language Not Supported!");
        }catch (NumberOutOfRangeException noore) {
            System.out.println("Numbers have to be between 1 and 10 inclusive!");
        }

    }
}

