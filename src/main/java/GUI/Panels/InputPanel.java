package GUI.Panels;


import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/** This class is the south panel of the application, it contains an input where the user writes the function to display
 *  This class is a singleton.
 * @see javax.swing.JPanel
 * @author Davide
 */
public class InputPanel extends JPanel {
    /**
     * The instance (singleton) of the InputPanel.
     */
    private static InputPanel inputPanel;
    private static String inputText;

    /**
     * The constructor of the singleton. Generate all the panel
     *
     * @see GridBagLayout
     * @author Davide
     */
    private InputPanel() {
        GridBagLayout layout = new GridBagLayout();

        setLayout(layout);
        generatePanelElements();
    }

    /** The method that creates (if not already created) the unique instance of InputPanel and returns it.
     *
     * @return A unique instance of InputPanel
     */
    public static InputPanel getInstance(){
        if(inputPanel == null)
            inputPanel = new InputPanel();
        return inputPanel;
    }

    /** The function that generates the elements of this panel
     *
     * @see GridBagConstraints
     */
    private void generatePanelElements(){
        final JTextField input = new JTextField();
        GridBagConstraints inputConstraints = new GridBagConstraints();
        inputConstraints.fill = GridBagConstraints.BOTH;
        inputConstraints.gridx = 1;
        inputConstraints.gridy = 0;
        inputConstraints.weightx = 8;
        inputConstraints.weighty = 1;


        JLabel label = new JLabel("function : ");
        label.setLabelFor(input);
        GridBagConstraints labelConstraints = new GridBagConstraints();
        labelConstraints.fill = GridBagConstraints.BOTH;
        labelConstraints.gridx = 0;
        labelConstraints.gridy = 0;
        labelConstraints.weightx = 0.3;
        labelConstraints.weighty = 1;

        JButton submit = new JButton("submit");
        submit.addActionListener(e -> onclick(input.getText()));
        GridBagConstraints submitConstraints = new GridBagConstraints();
        submitConstraints.fill = GridBagConstraints.BOTH;
        submitConstraints.gridx = 2;
        submitConstraints.gridy = 0;
        submitConstraints.weightx = 1;
        submitConstraints.weighty = 1;


        add(label, labelConstraints);
        add(input, inputConstraints);
        add(submit, submitConstraints);
    }

    /** The onclick function of the button, gets the function as a string and calls other methods in order to print it.
     *
     * @param input The function as a string
     */
    private void onclick(String input){
        System.out.println(input);
    }
}
