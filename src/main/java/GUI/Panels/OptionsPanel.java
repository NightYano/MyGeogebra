package GUI.Panels;

import Util.Pair;

import javax.swing.*;
import java.awt.*;

/** A panel that contains option of the application such as the
 *
 * @see BoxLayout
 * @author Davide
 */
public class OptionsPanel extends JPanel {
    private JTextField xmin, xmax;

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
        JLabel text = new JLabel("<html><h1>OPTIONS</h1></html>");
        add(text);
        JTextField xmin = new JTextField();
        JTextField xmax = new JTextField();
        JLabel xminLabel = new JLabel("xmin : ");
        JLabel xmaxLabel = new JLabel("xmax : ");
        xminLabel.setLabelFor(xmin);
        xmaxLabel.setLabelFor(xmax);

        this.xmin = xmin;
        this.xmax = xmax;

        add(xminLabel);
        add(xmin);
        add(xmaxLabel);
        add(xmax);
    }

    public Pair<Double, Double> getRange() throws IllegalArgumentException{
        Pair<Double, Double> pair = new Pair<Double, Double>();
        Double xmin, xmax;
        xmin = Double.parseDouble(this.xmin.getText());
        xmax = Double.parseDouble(this.xmax.getText());

        if(xmin>xmax){
            throw new IllegalArgumentException("xMin must be inferior than xMax");
        }

        pair.setVal1(xmin);
        pair.setVal2(xmax);
        return pair;
    }


}
