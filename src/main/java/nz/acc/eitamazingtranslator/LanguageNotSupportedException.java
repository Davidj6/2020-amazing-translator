package nz.acc.eitamazingtranslator;

public class LanguageNotSupportedException extends Exception{
    @Override
    public String getMessage() {
        return "Only french or German is supported";
    }
}