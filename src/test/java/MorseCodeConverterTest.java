import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MorseCodeConverterTest {

    @Test
    public void toMorseCode(){
        //given
        MorseCodeConverter converter = new MorseCodeConverter();

        //when

        //then
        assertEquals("-- --- .-. ... . -.-. --- -.. . ", converter.toMorseCode("morsecode"));
        assertEquals("-- --- .-. ... . -.-. --- -.. . ", converter.toMorseCode("morse code"));
    }

    @Test
    public void toMorseCode_notCompatible(){
        //given
        MorseCodeConverter converter = new MorseCodeConverter();

        //when

        //then
        assertEquals("-- --- .-. ... . -.-. --- -.. . ", converter.toMorseCode("morse012code"));

    }

    @Test
    public void toEnglish(){
        //given
        MorseCodeConverter converter = new MorseCodeConverter();

        //when

        //then
        assertEquals("morsecode", converter.toEnglish("-- --- .-. ... . -.-. --- -.. ."));
    }

    @Test
    public void toEnglish_notCompatible(){
        //given
        MorseCodeConverter converter = new MorseCodeConverter();

        //when

        //then
        assertEquals("morsecode", converter.toEnglish("-- jk --- .-. ... / . -.-. --- -.. ."));

    }

}