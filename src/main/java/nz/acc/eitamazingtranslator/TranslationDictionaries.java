package nz.acc.eitamazingtranslator;

import java.util.ArrayList;
import java.util.List;

public class TranslationDictionaries {
    private List<String> germanTranslations = new ArrayList<>();
    private List<String> frenchTranslations = new ArrayList<>();
    public Integer initilizeDictionaries(){

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

        return frenchTranslations.size();
    }
    public String getTranslation(Integer number, Integer language) throws LanguageNotAvailableException,NumberOutOfRangeException{

        if (number<1 || number>10){
            throw new NumberOutOfRangeException();
        }
        if (language==1){
            return frenchTranslations.get(number-1);
        }
        else if (language==2){
            return germanTranslations.get(number-1);
        }
        else {
            throw new LanguageNotAvailableException();
        }
    }
}
