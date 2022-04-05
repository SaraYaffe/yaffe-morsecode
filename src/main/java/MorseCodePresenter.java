public class MorseCodePresenter {

    private MorseCodeFrame view;
    private MorseCodeConverter model;

    public MorseCodePresenter(MorseCodeFrame view, MorseCodeConverter model){
        this.model = model;
        this.view = view;
    }
}
