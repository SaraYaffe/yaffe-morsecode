import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class MorseCodeFrame extends JFrame {

    private final MorseCodePresenter presenter;

    private JPanel panel;
    private final JTextField englishText;
    private final JTextField morseCodeText;
    private JButton englishButton;
    private JButton morseCodeButton;
    private final JLabel englishOutput;
    private final JLabel morseCodeOutput;

    public MorseCodeFrame(){

        MorseCodeConverter codeConverter = new MorseCodeConverter();
        presenter = new MorseCodePresenter(this, codeConverter);

        setTitle("Morse Code Converter");
        setSize(700, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new FlowLayout());
        panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        add(panel);

        englishText = new JTextField();
        englishText.setHorizontalAlignment(JTextField.CENTER);
        englishText.setPreferredSize(new Dimension(120, 60));
        panel.add(englishText);
        panel.add(Box.createRigidArea(new Dimension(0, 15)));

        morseCodeButton = new JButton("Convert to Morse Code");
        morseCodeButton.addActionListener(this::onSubmitClickedToMorse);
        panel.add(morseCodeButton);
        panel.add(Box.createRigidArea(new Dimension(0, 20)));

        morseCodeOutput = new JLabel("output");
        panel.add(morseCodeOutput);
        panel.add(Box.createRigidArea(new Dimension(0, 50)));

        morseCodeText = new JTextField();
        morseCodeText.setHorizontalAlignment(JTextField.CENTER);
        morseCodeText.setPreferredSize(new Dimension(120, 60));
        panel.add(morseCodeText);
        panel.add(Box.createRigidArea(new Dimension(0, 15)));

        englishButton = new JButton("Convert to English");
        englishButton.addActionListener(this::onSubmitClickedToEnglish);
        panel.add(englishButton);
        panel.add(Box.createRigidArea(new Dimension(0, 20)));

        englishOutput = new JLabel("output");
        panel.add(englishOutput);

    }

    private void onSubmitClickedToEnglish(ActionEvent actionEvent) {

        presenter.toEnglish(morseCodeText.getText());
    }

    private void onSubmitClickedToMorse(ActionEvent actionEvent) {

        presenter.toMorseCode(englishText.getText());
    }

    public void setEnglishOutput(String result){
        englishOutput.setText(result);
    }

    public void setMorseCodeOutput(String result) {
        morseCodeOutput.setText(result);
    }

    public static void main(String[] args) {
        JFrame frame = new MorseCodeFrame();
        frame.setVisible(true);
    }

}
