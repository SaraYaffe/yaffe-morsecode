public class MorseCodePresenter {

    private MorseCodeFrame view;
    private MorseCodeConverter model;

    public MorseCodePresenter(MorseCodeFrame view, MorseCodeConverter model){
        this.model = model;
        this.view = view;
    }

    public void toEnglish(String morseCodeInput) {
        view.setEnglishOutput(model.toEnglish(morseCodeInput));
    }

    public void toMorseCode(String englishInput) {
        view.setMorseCodeOutput(model.toMorseCode(englishInput));
    }
}
