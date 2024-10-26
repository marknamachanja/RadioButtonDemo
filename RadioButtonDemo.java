import javax.swing.*;

public class RadioButtonDemo {
    public static void main(String[] args) {
        String[] pets = {"Bird", "Cat", "Dog", "Rabbit", "Pig"};
        String selectedPet = (String) JOptionPane.showInputDialog(null, "Select a pet:", "RadioButtonDemo", JOptionPane.QUESTION_MESSAGE, null, pets, pets[0]);

        if (selectedPet!= null) {
            if (selectedPet.equals("Bird")) {
                JOptionPane.showMessageDialog(null, "You selected a Bird!");
            } else if (selectedPet.equals("Cat")) {
                JOptionPane.showMessageDialog(null, "You selected a Cat!");
            } else if (selectedPet.equals("Dog")) {
                JOptionPane.showMessageDialog(null, "You selected a Dog!");
            } else if (selectedPet.equals("Rabbit")) {
                JOptionPane.showMessageDialog(null, "You selected a Rabbit!");
            } else if (selectedPet.equals("Pig")) {
                JOptionPane.showMessageDialog(null, "You selected a Pig!");
            } else {
                JOptionPane.showMessageDialog(null, "Invalid selection!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No selection made!");
        }
    }
}