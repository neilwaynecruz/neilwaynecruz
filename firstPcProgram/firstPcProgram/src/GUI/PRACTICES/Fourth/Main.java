package GUI.PRACTICES.Fourth;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Main extends JFrame implements ActionListener {
    private final JPanel panel;
    private final JButton changeColorButton;
    private final JButton[] colorButtons;
    private final Color[] colors = {Color.RED, Color.GREEN, Color.BLUE, Color.YELLOW, Color.BLACK, Color.WHITE};
    private final String[] colorNames = {"Red", "Green", "Blue", "Yellow", "Black", "White"};
    private final Random random;

    public Main() {
        // Frame setup
        setTitle("Color Changer");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Panel setup
        panel = new JPanel();
        panel.setBackground(Color.LIGHT_GRAY);
        add(panel, BorderLayout.CENTER);

        // Button Panel setup
        JPanel buttonPanel = new JPanel(new GridLayout(1, 7, 10, 10));
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Change color button
        changeColorButton = createStyledButton("Random", new Color(189, 109, 109, 197));
        changeColorButton.addActionListener(this);
        buttonPanel.add(changeColorButton);

        // Color buttons setup
        colorButtons = new JButton[colors.length];
        for (int i = 0; i < colors.length; i++) {
            colorButtons[i] = createStyledButton(colorNames[i], new Color(189, 109, 109, 197));
            colorButtons[i].setForeground(colors[i]);
            colorButtons[i].addActionListener(this);
            buttonPanel.add(colorButtons[i]);
        }

        add(buttonPanel, BorderLayout.SOUTH);
        random = new Random();
        setVisible(true);
    }

    private JButton createStyledButton(String text, Color bgColor) {
        JButton button = new JButton(text);
        button.setFont(new Font("Arial", Font.BOLD, 20));
        button.setFocusable(false);
        button.setBackground(bgColor);
        button.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        return button;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        for (int i = 0; i < colorButtons.length; i++) {
            if (source == colorButtons[i]) {
                panel.setBackground(colors[i]);
                return;
            }
        }

        if (source == changeColorButton) {
            panel.setBackground(new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256)));
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}
