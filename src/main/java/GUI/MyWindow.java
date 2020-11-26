package GUI;

import GUI.Panels.InputPanel;
import GUI.Panels.LinePrinter;
import GUI.Panels.OptionsPanel;

import javax.swing.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.awt.*;

public class MyWindow extends JFrame {

    public MyWindow(String title){
        super(title);
    }

    public void run(){
        setLookAndFeel();
        setFrame();
        setPanels();
        setVisible(true);
    }

    // GUI METHODS
    private void setPanels(){
        JPanel contentPane = (JPanel) getContentPane();
        LayoutManager layout = new BorderLayout();
        contentPane.setLayout(layout);
        contentPane.add(InputPanel.getInstance(), BorderLayout.SOUTH);
        contentPane.add(LinePrinter.getInstance(), BorderLayout.CENTER);
        contentPane.add(OptionsPanel.getInstance(), BorderLayout.WEST);
    }

    private void setLookAndFeel(){
        try {
            UIManager.setLookAndFeel(new NimbusLookAndFeel());
        }catch (UnsupportedLookAndFeelException ignored){}
    }


    private void setFrame(){
        this.setSize(1280, 720);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }
}
