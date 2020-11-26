package GUI.Panels;

import javax.swing.*;
import java.awt.*;

/** A panel that contains option of the application such as the
 *
 * @see BoxLayout
 * @author Davide
 */
public class OptionsPanel extends JPanel {
    private static OptionsPanel optionsPanel;
    private OptionsPanel(){
        BoxLayout layout = new BoxLayout(this, BoxLayout.Y_AXIS);
        setLayout(layout);
        setPreferredSize(new Dimension(200, getHeight()));
        generateOptions();
    }

    public static OptionsPanel getInstance(){
        if(optionsPanel == null)
            optionsPanel = new OptionsPanel();
        return optionsPanel;
    }

    private void generateOptions(){
        JLabel text = new JLabel("OPTIONS");
        add(text);
    }


}
