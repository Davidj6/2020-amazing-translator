package nz.acc.eitamazingtranslator;

public interface ITranslationDatasource {
    int initializeDictionaries();
    String getTranslationOf(int number,int languageOption) throws LanguageNotSupportedException,NumberOutOfRangeException;
}