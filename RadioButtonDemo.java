import javax.swing.*;
import java.awt.event.*;

public class RadioButtonDemo {
    public static void main(String[] args) {
        // Create a new JFrame
        JFrame frame = new JFrame("RadioButtonDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a panel to hold the radio buttons
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        // Create a button group to manage the radio buttons
        ButtonGroup group = new ButtonGroup();

        // Create the radio buttons
        JRadioButton birdButton = new JRadioButton("Bird");
        JRadioButton catButton = new JRadioButton("Cat");
        JRadioButton dogButton = new JRadioButton("Dog");
        JRadioButton rabbitButton = new JRadioButton("Rabbit");
        JRadioButton pigButton = new JRadioButton("Pig");

        // Add the radio buttons to the button group
        group.add(birdButton);
        group.add(catButton);
        group.add(dogButton);
        group.add(rabbitButton);
        group.add(pigButton);

        // Add the radio buttons to the panel
        panel.add(birdButton);
        panel.add(catButton);
        panel.add(dogButton);
        panel.add(rabbitButton);
        panel.add(pigButton);

        // Create a label to display the selected pet
        JLabel label = new JLabel("Select a pet:");

        // Create a button to display the selected pet
        JButton button = new JButton("Display Pet");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedPet = "";
                if (birdButton.isSelected()) {
                    selectedPet = "Bird";
                } else if (catButton.isSelected()) {
                    selectedPet = "Cat";
                } else if (dogButton.isSelected()) {
                    selectedPet = "Dog";
                } else if (rabbitButton.isSelected()) {
                    selectedPet = "Rabbit";
                } else if (pigButton.isSelected()) {
                    selectedPet = "Pig";
                }
                JOptionPane.showMessageDialog(frame, "You selected: " + selectedPet);
            }
        });

        // Add the label and button to the panel
        panel.add(label);
        panel.add(button);

        // Add the panel to the frame
        frame.getContentPane().add(panel);

        // Set the frame's size and make it visible
        frame.setSize(200, 250);
        frame.setVisible(true);
    }
}