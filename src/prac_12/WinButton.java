package prac_12;

import javax.swing.*;

public class WinButton implements Button {
    private JButton button;

    @Override
    public void render(JPanel panel) {
        button = new JButton("Click Me!");

        button.addActionListener(_ -> JOptionPane.showMessageDialog(panel, "Button clicked!"));

        panel.add(button);
    }
}
