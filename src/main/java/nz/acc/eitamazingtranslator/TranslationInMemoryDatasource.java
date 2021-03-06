package nz.acc.eitamazingtranslator;

import java.util.ArrayList;
import java.util.List;

public class TranslationInMemoryDatasource implements ITranslationDatasource {

    private List<String> germanTranslations=new ArrayList<>();
    private List<String> frenchTranslations=new ArrayList<>();

    public int initializeDictionaries(){

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
        germanTranslations.add("Elf");
        germanTranslations.add("Zwölf");
        germanTranslations.add("Dreizehn");
        germanTranslations.add("Vierzehn");
        germanTranslations.add("Fünfzehn");
        germanTranslations.add("Sechzehn");
        germanTranslations.add("Siebzehn");
        germanTranslations.add("Achtzehn");
        germanTranslations.add("Neunzehn");
        germanTranslations.add("Zwanzig");
        germanTranslations.add("Einzundzwanzig");
        germanTranslations.add("Zweiundzwanzig");
        germanTranslations.add("Dreiundzwanzig");
        germanTranslations.add("Vierundzwanzig");
        germanTranslations.add("Fünfundzwanzig");
        germanTranslations.add("Sechsundzwanzig");
        germanTranslations.add("Siebenundzwanzig");
        germanTranslations.add("Achtundzwanzig");
        germanTranslations.add("Neunundzwanzig");
        germanTranslations.add("Dreißig");
        //...

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
        frenchTranslations.add("Onze");
        frenchTranslations.add("Douze");
        frenchTranslations.add("Treize");
        frenchTranslations.add("Quatorze");
        frenchTranslations.add("Quinze");
        frenchTranslations.add("Seize");
        frenchTranslations.add("Dix-sept");
        frenchTranslations.add("Dix-huit");
        frenchTranslations.add("Dix-neuf");
        frenchTranslations.add("Vingt");
        frenchTranslations.add("Vingt et un");
        frenchTranslations.add("Vingt-deux");
        frenchTranslations.add("Vingt-trois");
        frenchTranslations.add("Vingt-quatre");
        frenchTranslations.add("Vingt-Cinq");
        frenchTranslations.add("Vingt-Six");
        frenchTranslations.add("Vingt-Sept");
        frenchTranslations.add("Vingt-Huit");
        frenchTranslations.add("Vingt-Neuf");
        frenchTranslations.add("Trente");
        //...

        return frenchTranslations.size();
    }

    public String getTranslationOf(int number,int languageOption) throws LanguageNotSupportedException,NumberOutOfRangeException{

        if (number<1 || number>30){
            throw new NumberOutOfRangeException();
        }

        //...Check that the option is 1 or 2

        if (languageOption==1){
            return frenchTranslations.get(number-1);
        }
        else if (languageOption==2){
            return germanTranslations.get(number-1);
        }
        else {
            throw new LanguageNotSupportedException();
        }

    }

}