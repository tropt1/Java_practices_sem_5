package prac_12;

import javax.swing.*;
import java.awt.*;

public class UIFactory {
    public static void main(String[] args) {
        GUIFactory factory = new WinGUIFactory();

        JFrame frame = new JFrame("Windows GUI Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());

        JPanel panel = new JPanel();
        frame.add(panel);

        Button button = factory.createButton();
        Checkbox checkbox = factory.createCheckbox();

        button.render(panel);
        checkbox.render(panel);

        frame.setVisible(true);
    }
}
