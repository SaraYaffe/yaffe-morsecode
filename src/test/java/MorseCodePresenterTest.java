import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.verify;

import org.mockito.Mockito;

class MorseCodePresenterTest {

    private MorseCodeFrame frame = Mockito.mock(MorseCodeFrame.class);
    private MorseCodeConverter model = Mockito.mock(MorseCodeConverter.class);
    private MorseCodePresenter presenter = new MorseCodePresenter(frame, model);

    @Test
    public void toEnglish(){
        //given
        doReturn("hello").when(model).toEnglish(".... . .-.. .-.. ---");

        //when
        presenter.toEnglish(".... . .-.. .-.. ---");

        //then
        verify(model).toEnglish(".... . .-.. .-.. ---");
        verify(frame).setEnglishOutput("hello");
    }

    @Test
    public void toMorseCode(){
        //given
        doReturn(".... . .-.. .-.. ---").when(model).toMorseCode("Hello");

        //when
        presenter.toMorseCode("Hello");

        //then
        verify(model).toMorseCode("Hello");
        verify(frame).setMorseCodeOutput(".... . .-.. .-.. ---");

    }




}