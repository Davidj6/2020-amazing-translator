package nz.acc.eitamazingtranslator;

import org.junit.Assert;
import org.junit.Test;

public class LanguageNotSupportedExceptionTest {
    @Test
    public void getMessage_withNoParameter_returnProperMessage(){
        LanguageNotSupportedException languageNotSupportedException = new LanguageNotSupportedException();
        Assert.assertEquals("Not the exact sentence","Only french or German is supported",languageNotSupportedException.getMessage());
    }
}
