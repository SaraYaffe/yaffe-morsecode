import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MorseCodeConverterTest {

    MorseCodeConverter converter = new MorseCodeConverter();

    @Test
    public void toMorseCode(){
        //given

        //when

        //then
        assertEquals("-- --- .-. ... . -.-. --- -.. . ", converter.toMorseCode("morsecode"));
        assertEquals("-- --- .-. ... . -.-. --- -.. . ", converter.toMorseCode("morse code"));
    }

    @Test
    public void toMorseCode_upper() {
        //given

        //when

        //then
        assertEquals("-- --- .-. ... . -.-. --- -.. . ", converter.toMorseCode("mORSecode"));
    }

    @Test
    public void toMorseCode_notCompatible(){
        //given

        //when

        //then
        assertEquals("-- --- .-. ... . -.-. --- -.. . ", converter.toMorseCode("morse012code"));

    }

    @Test
    public void toEnglish(){
        //given

        //when

        //then
        assertEquals("morsecode", converter.toEnglish("-- --- .-. ... . -.-. --- -.. ."));
    }

    @Test
    public void toEnglish_notCompatible(){
        //given

        //when

        //then
        assertEquals("morsecode", converter.toEnglish("-- jk --- .-. ... / . -.-. --- -.. ."));

    }

}