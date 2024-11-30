package prac_12;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class WinCheckbox implements Checkbox {

    private JCheckBox checkbox;

    @Override
    public void render(JPanel panel) {
        checkbox = new JCheckBox("Check Me!");

        checkbox.addItemListener(e -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                JOptionPane.showMessageDialog(panel, "Checkbox selected!");
            } else if (e.getStateChange() == ItemEvent.DESELECTED) {
                JOptionPane.showMessageDialog(panel, "Checkbox deselected!");
            }
        });

        panel.add(checkbox);
    }
}
