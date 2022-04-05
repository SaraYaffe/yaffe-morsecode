import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class MorseCodeFrame extends JFrame {

    private MorseCodePresenter presenter;
    MorseCodeConverter codeConverter = new MorseCodeConverter();

    private JPanel panel;
    private JTextArea englishText;
    private JTextArea morseCodeText;
    private JButton englishButton;
    private JButton morseCodeButton;
    private JLabel englishOutput;
    private JLabel morseCodeOutput;

    public MorseCodeFrame(){

        presenter = new MorseCodePresenter(this, codeConverter);

        setTitle("Morse Code Converter");
        setSize(700, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new FlowLayout());
        panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        add(panel);

        englishText = new JTextArea();
        englishText.setPreferredSize(new Dimension(120, 60));
        panel.add(englishText);

        morseCodeButton = new JButton("Convert to Morse Code");
        morseCodeButton.addActionListener(this::onSubmitClickedToMorse);
        panel.add(morseCodeButton);

        morseCodeOutput = new JLabel("output");
        panel.add(morseCodeOutput);

        morseCodeText = new JTextArea();
        morseCodeText.setPreferredSize(new Dimension(120, 60));
        panel.add(morseCodeText);

        englishButton = new JButton("Convert to English");
        englishButton.addActionListener(this::onSubmitClickedToEnglish);
        panel.add(englishButton);

        englishOutput = new JLabel("output");
        panel.add(englishOutput);


    }

    private void onSubmitClickedToEnglish(ActionEvent actionEvent) {

        String result = codeConverter.toEnglish(morseCodeText.getText());
        englishOutput.setText(result);
    }

    private void onSubmitClickedToMorse(ActionEvent actionEvent) {

        String result = codeConverter.toMorseCode(englishText.getText());
        morseCodeOutput.setText(result);
    }

    public static void main(String[] args) {
        JFrame frame = new MorseCodeFrame();
        frame.setVisible(true);
    }
}
